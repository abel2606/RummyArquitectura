/*
 * AplicacionFachada.java
 */
package org.itson.arquitectura.aplicacionrummy.fachada;

import org.itson.arquitectura.aplicacionrummy.servicios.ServicioConfigurarPartida;
import org.itson.arquitectura.aplicacionrummy.servicios.ServicioEjercerTurno;
import org.itson.arquitectura.aplicacionrummy.servicios.ServicioIniciarPartida;
import org.itson.arquitectura.aplicacionrummy.servicios.ServicioRegistrarJugador;
import org.itson.arquitectura.aplicacionrummy.servicios.ServicioSolicitarInicioJuego;
import org.itson.arquitectura.aplicacionrummy.servicios.ServicioSolicitarUnirsePartida;

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
    
    
}
