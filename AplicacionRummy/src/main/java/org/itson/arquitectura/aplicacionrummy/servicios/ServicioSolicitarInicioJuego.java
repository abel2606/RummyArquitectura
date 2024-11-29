/*
 * ServicioSolicitarInicioJuego.java
 */
package org.itson.arquitectura.aplicacionrummy.servicios;

import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.fachada.DominioFachada;
import org.itson.arquitectura.dominiorummy.fachada.IDominioFachada;

/**
 * @author Equipo4
 */
public class ServicioSolicitarInicioJuego {
    
    private IDominioFachada dominio = new DominioFachada(2, 10);
    
    public boolean solicitarInicioJuego(Jugador jugador) {
        return dominio.solicitarIniciarPartida(jugador);
    }
}
