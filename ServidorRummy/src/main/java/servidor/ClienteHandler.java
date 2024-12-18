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
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaCreada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirseEvaluada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirsePartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.VerificacionPartidaCreada;

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
            desconectarUsuario();
        }
    }

    /**
     * Método para redireccionar respuestas
     *
     * @param respuesta Objeto a enviar.
     */
    private void broadcast(Object respuesta) {
        if (respuesta instanceof SolicitudUnirsePartida solicitudUnirsePartida) {
            RummyServer.ultimoJugador = out;
            enviarHost(solicitudUnirsePartida);
        } else if (respuesta instanceof VerificacionPartidaCreada verificacionPartidaCreada) {
            enviarCliente(out, verificacionPartidaCreada);
        } else if (respuesta instanceof PartidaCreada partidaCreada) {
            if (partidaCreada.isPartidaCreada()) {
                // Se indica que el host es el jugador que creó la partida.
                RummyServer.host = out;
                System.out.println("HOST: " + RummyServer.host);
            }
        } else if (respuesta instanceof SolicitudUnirseEvaluada solicitudUnirseEvaluada) {
            System.out.println(RummyServer.ultimoJugador);
            enviarCliente(RummyServer.ultimoJugador, solicitudUnirseEvaluada);
        } else {
            enviarTodos(respuesta);
        }
    }

    private void enviarHost(SolicitudUnirsePartida solicitud) {
        // Responder al host
        enviarCliente(RummyServer.host, solicitud);
    }

    private void enviarTodos(Object respuesta) {
        // Responder a todos los clientes conectados menos al que originó la solicitud
        for (ObjectOutputStream cliente : RummyServer.clientesConectados) {
            if (cliente != out) {
                enviarCliente(cliente, respuesta);
            }
        }
    }

    private void enviarCliente(ObjectOutputStream cliente, Object respuesta) {
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

    private void desconectarUsuario() {
        // Si un cliente se desconecta abruptamente.
        try {
            // Se elimina su Stream de salida de la lista.
            if (out != null) {
                RummyServer.clientesConectados.remove(out);
            }

            // Se cierra el socket.
            if (clienteSocket != null && !clienteSocket.isClosed()) {
                clienteSocket.close();
            }

            // Si es el host, ya no se hace referencia a él en la variable host.
            if (RummyServer.host == out) {
                RummyServer.host = null;
            }

            RummyServer.partidaExistente = false;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
