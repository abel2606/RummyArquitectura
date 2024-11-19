/*
 * IDominioFacahda.java
 */
package org.itson.arquitectura.dominiorummy.fachada;

import org.itson.arquitectura.dominiorummy.Ficha;
import org.itson.arquitectura.dominiorummy.GrupoFichas;
import org.itson.arquitectura.dominiorummy.Jugador;

/**
 * @author Equipo4
 */
public interface IDominioFachada {

    /**
     * Permite agregar un jugador nuevo a la partida.
     *
     * @param jugador El jugador a agregar
     * @return true si se pudo agregar el jugador, false en caso contrario
     */
    public boolean agregarJugadorPartida(Jugador jugador);

    /**
     * Permite obtener una ficha del mazo.
     *
     * @return La ficha obtenida del mazo
     */
    public Ficha obtenerFicha();

    /**
     * Permite agregar una ficha al tablero.
     *
     * @param ficha
     * @param grupoFichas
     * @return
     */
    public boolean agregarFichaTablero(Ficha ficha, GrupoFichas grupoFichas);

    /**
     * Permite iniciar la partida.
     */
    public void iniciarPartida();

    /**
     * Permite agregar una ficha a la mano de un jugador.
     *
     * @param ficha La ficha a agregar
     * @param jugador El jugador al que se le agregará la ficha
     * @return true si se pudo agregar la ficha, false en caso contrarios
     */
    public boolean agregarFichaJugador(Ficha ficha, Jugador jugador);
}
