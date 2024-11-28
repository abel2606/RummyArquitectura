/*
 * PartidaDTO.java
 */
package org.itson.arquitecturasoftware.dtorummy.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Clase que se usa para transmitir las modificaciones de una partida a través
 * del servidor.
 *
 * @author Equipo4
 */
public class PartidaDTO implements Serializable {

    private JugadorDTO anfitrion;
    private TableroDTO tablero;
    private List<FichaDTO> mazo;
    private List<JugadorDTO> jugadores;
    private List<TurnoDTO> turnos;

    /**
     * Constructor que se usa cuando se configura la partida. Se emplea cuando
     * un usuario quiere que otros usuarios se unan a la partida. Recibe el
     * anfitrión la partida para que el servidor sepa a quien notificar las
     * solicitudes de unirse.
     *
     * @param anfitrion El anfitrión de la partida
     */
    public PartidaDTO(JugadorDTO anfitrion) {
        this.anfitrion = anfitrion;
    }

    /**
     * Constructor que se usa cuando se realiza un cambio durante la partida y
     * se le tiene que notificar a los otros jugadores.
     *
     * @param tablero El tablero que resultó después de la modificación
     * @param mazo El mazo de fichas que resultó después de la modificación
     * @param jugadores Los jugadores de la partida
     * @param turnos Los turnos de la partida
     */
    public PartidaDTO(TableroDTO tablero, List<FichaDTO> mazo, List<JugadorDTO> jugadores, List<TurnoDTO> turnos) {
        this.tablero = tablero;
        this.mazo = mazo;
        this.jugadores = jugadores;
        this.turnos = turnos;
    }

    /**
     * Permite obtener al anfitrión de la partida.
     *
     * @return El anfitrión de la partida
     */
    public JugadorDTO getAnfitrion() {
        return anfitrion;
    }

    /**
     * Permite obtener el tablero de la partida.
     *
     * @return El tablero de la partida
     */
    public TableroDTO getTablero() {
        return tablero;
    }

    /**
     * Permite obtener el mazo de fichas de la partida.
     *
     * @return El mazo de fichas
     */
    public List<FichaDTO> getMazo() {
        return mazo;
    }

    /**
     * Permite obtener los jugadores de la partida.
     *
     * @return Los jugadores de la partida
     */
    public List<JugadorDTO> getJugadores() {
        return jugadores;
    }

    /**
     * Permite obtener los turnos de la partida.
     *
     * @return Los turnos de la partida
     */
    public List<TurnoDTO> getTurnos() {
        return turnos;
    }

}
