/*
 * DominioFachada.java
 */
package org.itson.arquitectura.dominiorummy.fachada;

import org.itson.arquitectura.dominiorummy.Ficha;
import org.itson.arquitectura.dominiorummy.GrupoFichas;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.Partida;

/**
 * @author Equipo4
 */
public class DominioFachada implements IDominioFachada {

    private Partida partida;

    public DominioFachada(int numeroComodines, int rangoFichas) {
        partida = new Partida(numeroComodines, rangoFichas);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean agregarJugadorPartida(Jugador jugador) {
        return partida.agregarJugador(jugador);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ficha obtenerFicha() {
        return partida.obtenerFicha();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean agregarFichaTablero(Ficha ficha, GrupoFichas grupoFichas) {
        return partida.agregarFichaTablero(ficha, grupoFichas);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void iniciarPartida() {
        partida.iniciarPartida();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean agregarFichaJugador(Ficha ficha, Jugador jugador) {
        return partida.agregarFichaJugador(ficha, jugador);
    }

}
