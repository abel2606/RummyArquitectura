/*
 * SolicitudIniciarPartida.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 * Clase que representa la respuesta de solicitud de iniciar partida evaluada.
 *
 * @author Equipo4
 */
public class SolicitudIniciarPartida implements Serializable {

    private JugadorDTO jugador;

    /**
     * Constructor que recibe la solicitud evaluada de inciar partida.
     *
     * @param jugador El jugador que solicitó iniciar la partida.
     */
    public SolicitudIniciarPartida(JugadorDTO jugador) {
        this.jugador = jugador;
    }

    /**
     * Permite obtener el jugador que solicitó iniciar la partida.
     *
     * @return El jugador.
     */
    public JugadorDTO getJugador() {
        return jugador;
    }

}
