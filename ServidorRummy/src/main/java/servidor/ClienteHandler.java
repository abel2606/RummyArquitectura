/**
 * ClienteHandler.java
 */
package servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.PeticionCliente;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirsePartida;

/**
 * Clase que implementa hilos (Runnable) para representar a cada cliente que se
 * conecta al servidor.
 *
 * @author Diego Valenzuela Parra
 */
public class ClienteHandler implements Runnable {

    private ServerSocket serverSocket;
    private Socket clienteSocket;
    private RummyProtocol protocolo;
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

            // Aquí va algo como que: "
            while (true) {
                // Se obtiene la petición del cliente.
                PeticionCliente peticion = (PeticionCliente) in.readObject();
                // Se manda a procesar la petición.
                Object respuesta = protocolo.procesarPeticion(peticion);
                // Se envía la respuesta del servidor.
                broadcast(respuesta);
            }
        } catch (IOException | ClassNotFoundException e) {
            // Por si suceden errores y así.
            e.printStackTrace();
            Logger.getLogger(ClienteHandler.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            // Se elimina el cliente de la lista al desconectarse.
            try {
                RummyServer.clientesConectados.remove(out);
                if (clienteSocket != null) {
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
     * @param solicitud Objeto a enviar.
     */
    private void broadcast(Object respuesta) {
        /**
         * Aquí se responde solo al host porque únicamente él puede aceptar o
         * rechazar la solicitud de unirse.
         */
        if (respuesta instanceof SolicitudUnirsePartida solicitarUnirsePartida) { // Algo bien esto, eh
            // Responder al host.
            try {
                // Se le manda la respuesta.
                RummyServer.host.writeObject(solicitarUnirsePartida);
                // Fuerza el envío inmediato de los datos almacenados en el buffer del Stream.
                RummyServer.host.flush();
            } catch (IOException e) {
                System.err.println("Error al enviar mensaje a un cliente.");
                System.out.println(e.getMessage());
            }
        } else {
            /**
             * Si no es una solicitud de unirse a partida, se responde a todos
             * los clientes conectados menos al que originó la solicitud.
             */
            // Se itera sobre la lista de clientes conectados.
            for (ObjectOutputStream cliente : RummyServer.clientesConectados) {
                // Si el cliente es el mismo que originó la petición, no se le manda nada.
                if (cliente != out) {
                    try {
                        // Se les manda la respuesta.
                        cliente.writeObject(respuesta);
                        // Fuerza el envío inmediato de los datos almacenados en el buffer del Stream.
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
