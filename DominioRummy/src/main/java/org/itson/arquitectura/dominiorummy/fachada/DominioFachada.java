/*
 * DominioFachada.java
 */
package org.itson.arquitectura.dominiorummy.fachada;

import java.util.List;
import org.itson.arquitectura.dominiorummy.Ficha;
import org.itson.arquitectura.dominiorummy.GrupoFichas;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.Partida;

/**
 * @author Equipo4
 */
public class DominioFachada implements IDominioFachada {

    private Partida partida;

    public DominioFachada(int numeroComodines, int rangoFichas) {
        partida = Partida.getInstance(numeroComodines, rangoFichas);
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
    public boolean agregarFichaJugador(Ficha ficha, Jugador jugador) {
        return partida.agregarFichaJugador(ficha, jugador);
    }

    @Override
    public boolean isPartidaIniciada() {
        return partida.isIniciada();
    }

    @Override
    public boolean agregarJugador(Jugador jugador) {
        return partida.agregarJugador(jugador);
    }

    @Override
    public boolean agregarFichaGrupo(Ficha ficha, GrupoFichas grupoFichas) {
        return partida.agregarFichaTablero(ficha, grupoFichas);
    }

    @Override
    public GrupoFichas crearGrupoFichas(List<Ficha> grupoFichas) {
        return partida.crearGrupoFichas(grupoFichas);
    }

    @Override
    public Ficha tomarFichaMazo() {
        return partida.obtenerFichaMazo();
    }

    @Override
    public boolean terminarTurno() {
        return partida.terminarTurno();
    }

    @Override
    public boolean terminarPartida() {
        return partida.terminarPartida();
    }

    @Override
    public void iniciarPartida(IPartida partida) {
        this.partida.iniciarPartida();
    }

    @Override
    public Partida configurarPartida(IPartida partida) {
        return this.partida.actualizarConfiguracion(partida);
    }
}
