/*
 * RummyServer.java
 */
package servidor;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Clase main del servidor. Solo una persona tiene que correr este proyecto.
 *
 * @author Diego Valenzuela Parra
 */
public class RummyServer {

    /**
     * Lista de clientes conectados. Realmente es una lista con los Streams de
     * salida de cada cliente conectado.
     */
    public static final CopyOnWriteArrayList<ObjectOutputStream> clientesConectados = new CopyOnWriteArrayList<>();

    public static ObjectOutputStream host = null;

    /**
     * Método principal.
     *
     * @param args
     */
    public static void main(String[] args) {
        int puerto = 4444;
        // Se crear el servidor en el puerto
        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            System.out.println("Servidor iniciado en el puerto " + puerto + "...");

            // Esto es para que se puedan agregar múltiplos clientes.
            while (true) {
                // Se acepta a un cliente nuevo.
                Socket clienteSocket = serverSocket.accept();
                System.out.println("Cliente conectado: " + clienteSocket.getInetAddress());

                /**
                 * Se crea un nuevo hilo para manejar al cliente. Se le manda el
                 * cliente que se acaba de aceptar.
                 */
                new Thread(new ClienteHandler(clienteSocket)).start();
            }
        } catch (IOException e) {
            // Por si suceden cositas que no deberían suceder.
            System.err.println("Error en el puerto " + puerto + ".");
            e.printStackTrace();
        }
    }

}
