/*
 * ClienteSocket.java
 */
package org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.IniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.PeticionCliente;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.JugadorUnidoPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaIniciada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudIniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirseEvaluada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirsePartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.VerificacionPartidaCreada;
import org.itson.arquitecturasoftware.manejadorRespuestas.ManejadorRespuestas;

/**
 * Clase que permite establecer la comunicación con el servidor y enviarle
 * peticiones.
 *
 * @author Equipo4
 */
public class ClienteSocket implements Runnable {

    private static ClienteSocket clienteSocket;
    private ManejadorRespuestas manejador;
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    
    private ClienteSocket() {
    }

    /**
     * Permite establecer la conexión con el servidor.
     */
    public void establecerConexionServidor() {
        try {
            socket = new Socket("localhost", 4444);
            socket.setKeepAlive(true);

            out = new ObjectOutputStream(socket.getOutputStream());
            out.flush(); // Flush inmediato para evitar deadlock
            in = new ObjectInputStream(socket.getInputStream());

            // Iniciar el hilo para recibir mensajes
            new Thread(this).start();
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Permite enviarle paticiones al servidor.
     *
     * @param peticion La petición que se desea enviar
     * @throws IOException Si sucede algún error de entrada o salida de datos
     */
    public void enviarPeticion(PeticionCliente peticion) throws IOException {
        out.writeObject(peticion);
        out.flush();
    }

    /**
     * Permite finalizar la conexión con el servidor.
     */
    public void finalizarConexionServidor() {
        try {
            if (out != null) {
                out.close();  // Cerrar el flujo de salida
            }
            if (in != null) {
                in.close();  // Cerrar el flujo de entrada
            }
            if (socket != null && !socket.isClosed()) {
                socket.close();  // Cerrar el socket
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Permite correr un hilo para escuchar activamente al servidor y las
     * respuestas que envía.
     */
    @Override
    public void run() {
        try {
            manejador = ManejadorRespuestas.getInstance();
            while (true) {
                Object respuesta = in.readObject();
                if (respuesta instanceof VerificacionPartidaCreada verificacion) {
                    manejador.manejarVerificacionPartidaCreada(verificacion);
                } else if (respuesta instanceof SolicitudUnirsePartida solicitudUnirsePartida) {
                    manejador.manejarSolicitudUnirsePartida(solicitudUnirsePartida);
                } else if (respuesta instanceof SolicitudIniciarPartida solicitudIniciarPartida) {
                    manejador.manejarSolicitudIniciarPartida(solicitudIniciarPartida);
                } else if (respuesta instanceof SolicitudUnirseEvaluada solicitudUnirseEvaluada) {
                    manejador.manejarSolicitudUnirseEvaluada(solicitudUnirseEvaluada);
                } else if (respuesta instanceof PartidaIniciada partidaIniciada){
                    manejador.manejarPartidaIniciada(partidaIniciada);
                } else if (respuesta instanceof JugadorUnidoPartida jugadorUnidoPartida){
                    manejador.manejarJugadorUnidoPartida(jugadorUnidoPartida);
                }
              
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static ClienteSocket getInstance() {
        if (clienteSocket == null) {
            clienteSocket = new ClienteSocket();
        }
        return clienteSocket;
    }

}
