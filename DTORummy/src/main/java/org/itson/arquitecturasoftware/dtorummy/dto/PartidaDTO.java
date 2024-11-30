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

    private TableroDTO tablero;
    private List<FichaDTO> mazo;
    private List<JugadorDTO> jugadores;
    private List<TurnoDTO> turnos;
    private int numeroComodines;
    private int rangoFichas;

    public PartidaDTO() {
        
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

    public PartidaDTO(List<JugadorDTO> jugadores, int numeroComodines, int rangoFichas) {
        this.jugadores = jugadores;
        this.numeroComodines = numeroComodines;
        this.rangoFichas = rangoFichas;
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
