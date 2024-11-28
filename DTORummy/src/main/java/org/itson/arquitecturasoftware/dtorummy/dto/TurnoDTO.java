/*
 * TurnoDTO.java
 */
package org.itson.arquitecturasoftware.dtorummy.dto;

import java.io.Serializable;

/**
 * Clase que representa los turnos en los que realizan sus jugadas los jugadores
 * de la partida.
 *
 * @author Equipo4
 */
public class TurnoDTO implements Serializable {

    private int turno;
    private JugadorDTO jugador;

    /**
     * Constructor que recibe el turno y el jugador que lo posee.
     *
     * @param turno El turno
     * @param jugador El jugador que posee el turno
     */
    public TurnoDTO(int turno, JugadorDTO jugador) {
        this.turno = turno;
        this.jugador = jugador;
    }

    /**
     * Permite obtener el turno.
     *
     * @return El turno
     */
    public int getTurno() {
        return turno;
    }

    /**
     * Permite obtener el jugador.
     *
     * @return El jugador
     */
    public JugadorDTO getJugador() {
        return jugador;
    }

}
