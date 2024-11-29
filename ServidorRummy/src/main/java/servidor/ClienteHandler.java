/**
 * ClienteHandler.java
 */
package servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.PeticionCliente;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudIniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirsePartida;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import static servidor.RummyServer.host;

/**
 * Clase que implementa hilos (Runnable) para representar a cada cliente que se
 * conecta al servidor.
 *
 * @author Diego Valenzuela Parra
 */
public class ClienteHandler implements Runnable {

    private ServerSocket serverSocket;
    private Socket clienteSocket;
    private RummyProtocol protocolo = new RummyProtocol();
    private ObjectInputStream in;
    private ObjectOutputStream out;

    /**
     * Método constructor que recibe el socket de un cliente conectado y lo
     * guarda como atributo.
     *
     * @param socket Socket del cliente que representa el hilo.
     */
    public ClienteHandler(Socket socket) {
        this.clienteSocket = socket;
    }

    /**
     * Método de la interfaz Runnable que define lo que se ejecutará en el hilo.
     */
    @Override
    public void run() {
        try {
            // Inicializar los Streams de entrada y salida.
            // Lo que envía el cliente.
            in = new ObjectInputStream(clienteSocket.getInputStream());
            // Lo que se le manda al cliente.
            out = new ObjectOutputStream(clienteSocket.getOutputStream());

            // Agregar el Stream de salida del cliente a la lista global.
            RummyServer.clientesConectados.add(out);

            if (RummyServer.clientesConectados.size() == 1) {
                host = new ObjectOutputStream(clienteSocket.getOutputStream());
            }
            System.out.println(RummyServer.host);

            while (!clienteSocket.isClosed()) {
                try {
                    // Esperar y leer una petición del cliente
                    PeticionCliente peticion = (PeticionCliente) in.readObject();

                    // Procesar la petición recibida
                    Object respuesta = protocolo.procesarPeticion(peticion);

                    // Enviar la respuesta a los demás clientes
                    broadcast(respuesta);
                } catch (SocketException e) {
                    // Cliente desconectado abruptamente
                    System.out.println("El cliente se desconectó: " + clienteSocket.getInetAddress());
                    break;  // Salir del bucle si el cliente se desconectó
                } catch (IOException | ClassNotFoundException e) {
                    // Manejar errores de I/O o de deserialización
                    Logger.getLogger(ClienteHandler.class.getName()).log(Level.SEVERE, "Error inesperado:", e);
                    break;  // Salir del bucle en caso de error
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ClienteHandler.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Se elimina el cliente de la lista al desconectarse
            try {
                if (out != null) {
                    RummyServer.clientesConectados.remove(out);
                }
                if (clienteSocket != null && !clienteSocket.isClosed()) {
                    clienteSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Envía un objeto a todos los clientes conectados.
     *
     * @param respuesta Objeto a enviar.
     */
    private void broadcast(Object respuesta) {
        if (respuesta instanceof SolicitudUnirsePartida solicitarUnirsePartida) {
            // Responder al host
            try {
                // Se le manda la respuesta al host
                RummyServer.host.writeObject(solicitarUnirsePartida);
                // Fuerza el envío inmediato de los datos almacenados en el buffer del Stream
                RummyServer.host.flush();
            } catch (IOException e) {
                System.err.println("Error al enviar mensaje al host.");
                System.out.println(e.getMessage());
            }
        } else {
            // Responder a todos los clientes conectados menos al que originó la solicitud
            for (ObjectOutputStream cliente : RummyServer.clientesConectados) {
                JugadorDTO jugador = ((SolicitudIniciarPartida) respuesta).getJugador();
                String listo = "";
                listo = jugador.isListoParaJugar() ? "está listo" : "NO está listo";
                System.out.println(jugador.getNombre() + " dice que " + listo);
                if (cliente != out) {
                    try {
                        // Se les manda la respuesta
                        cliente.writeObject(respuesta);
                        // Fuerza el envío inmediato de los datos almacenados en el buffer del Stream
                        cliente.flush();
                    } catch (IOException e) {
                        System.err.println("Error al enviar mensaje a un cliente.");
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
}
