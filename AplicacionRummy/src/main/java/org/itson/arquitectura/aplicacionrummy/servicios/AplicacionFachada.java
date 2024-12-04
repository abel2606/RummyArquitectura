/*
 * AplicacionFachada.java
 */
package org.itson.arquitectura.aplicacionrummy.servicios;

import java.util.List;
import org.itson.arquitectura.dominiorummy.Ficha;
import org.itson.arquitectura.dominiorummy.GrupoFichas;
import org.itson.arquitectura.dominiorummy.IJugador;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.Partida;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

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
    public Partida configurarPartida(IPartida partida) {
        try {
            return configurarPartida.configurarPartida(partida);
        } catch (Exception e) {
            System.out.println("Error al configurar la partida");
        }
        return null;
    }

    @Override
    public void registrarJugador(IJugador jugador) {
        try {
            registrarJugador.unirsePartida(jugador);
        } catch (Exception e) {
            System.out.println("Error al registrar jugador");
        }
    }

    @Override
    public void solicitarUnirsePartida(JugadorDTO jugador) {
//        solicitarInicioJuego
    }

    @Override
    public boolean solicitarIniciarPartida(Jugador jugador) {
        return solicitarInicioJuego.solicitarInicioJuego(jugador);
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
