/*
 * AplicacionFachada.java
 */
package org.itson.arquitectura.aplicacionrummy.fachada;

import java.util.List;
import org.itson.arquitectura.aplicacionrummy.servicios.ServicioConfigurarPartida;
import org.itson.arquitectura.aplicacionrummy.servicios.ServicioEjercerTurno;
import org.itson.arquitectura.aplicacionrummy.servicios.ServicioIniciarPartida;
import org.itson.arquitectura.aplicacionrummy.servicios.ServicioRegistrarJugador;
import org.itson.arquitectura.aplicacionrummy.servicios.ServicioSolicitarInicioJuego;
import org.itson.arquitectura.aplicacionrummy.servicios.ServicioSolicitarUnirsePartida;
import org.itson.arquitectura.dominiorummy.Ficha;
import org.itson.arquitectura.dominiorummy.GrupoFichas;
import org.itson.arquitectura.dominiorummy.IJugador;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Partida;

/**
 * @author Equipo4
 */
public class AplicacionFachada implements IAplicacionFachada {

    private ServicioConfigurarPartida configurarPartida;
    private ServicioEjercerTurno ejercerTurno;
    private ServicioIniciarPartida iniciarPartida;
    private ServicioRegistrarJugador registrarJugador;
    private ServicioSolicitarInicioJuego solicitarInicioJuego;
    private ServicioSolicitarUnirsePartida solicitarUnirsePartida;
    
    public AplicacionFachada() {
        configurarPartida = new ServicioConfigurarPartida();
        ejercerTurno = new ServicioEjercerTurno();
        iniciarPartida = new ServicioIniciarPartida();
        registrarJugador = new ServicioRegistrarJugador();
        solicitarInicioJuego = new ServicioSolicitarInicioJuego();
        solicitarUnirsePartida = new ServicioSolicitarUnirsePartida();
    }

    @Override
    public void configurarPartida(IPartida partida) {
        
    }

    @Override
    public void registrarJugador(IJugador jugador) {
    }

    @Override
    public void solicitarUnirsePartida() {
    }

    @Override
    public void solicitarIniciarPartida() {
    }

    @Override
    public void tomarFichaMazo() {
    }

    @Override
    public void agregarFichaGrupo(Ficha ficha, GrupoFichas grupoFichas) {
    }

    @Override
    public void crearGrupoFichas(List<Ficha> fichas) {
    }

    @Override
    public void isPartidaIniciada() {
    }

    @Override
    public void iniciarPartida(IPartida partida) {
    }
    
    
}
