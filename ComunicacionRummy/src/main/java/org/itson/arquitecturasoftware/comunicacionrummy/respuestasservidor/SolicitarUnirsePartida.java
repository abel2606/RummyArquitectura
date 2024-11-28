/*
 * SolicitarUnirsePartida.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 * Clase que representa la respuesta de solicitar unirse a la partida.
 *
 * @author Equipo4
 */
public class SolicitarUnirsePartida implements Serializable {

    private JugadorDTO jugador;

    /**
     * Constructor que recibe el jugador que solicita unirse a la partida.
     *
     * @param jugador El jugador que solicita unirse a la partida
     */
    public SolicitarUnirsePartida(JugadorDTO jugador) {
        this.jugador = jugador;
    }

    /**
     * Permite obtener al jugador.
     *
     * @return El jugador
     */
    public JugadorDTO getJugador() {
        return jugador;
    }

}
