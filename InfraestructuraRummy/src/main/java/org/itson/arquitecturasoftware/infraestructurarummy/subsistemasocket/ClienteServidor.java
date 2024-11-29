/*
 * ClienteSocket.java
 */
package org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import manejadorRespuestas.ManejadorRespuestas;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.PeticionCliente;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudIniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirseEvaluada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirsePartida;

/**
 * Clase que permite establecer la comunicación con el servidor y enviarle
 * peticiones.
 *
 * @author Equipo4
 */
public class ClienteServidor implements Runnable {

    private ManejadorRespuestas manejador;
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

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

    }

    /**
     * Permite correr un hilo para escuchar activamente al servidor y las
     * respuestas que envía.
     */
    @Override
    public void run() {
        try {
            while (true) {
                manejador = new ManejadorRespuestas();
                Object respuesta = in.readObject();
                if (respuesta instanceof SolicitudUnirsePartida) {
                    manejador.manejarSolicitudUnirsePartida((SolicitudUnirsePartida) respuesta);
                } else if (respuesta instanceof SolicitudIniciarPartida) {
                    manejador.manejarSolicitudIniciarPartida((SolicitudIniciarPartida) respuesta);
                } else if (respuesta instanceof SolicitudUnirseEvaluada) {
                    manejador.manejarSolicitudUnirseEvaluada((SolicitudUnirseEvaluada) respuesta);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
