/*
 * ServicioRegistrarJugador.java
 */
package org.itson.arquitectura.aplicacionrummy.servicios;

import org.itson.arquitectura.dominiorummy.IJugador;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.Partida;
import org.itson.arquitectura.dominiorummy.fachada.DominioFachada;
import org.itson.arquitectura.dominiorummy.fachada.IDominioFachada;

/**
 * @author Equipo4
 */
public class ServicioRegistrarJugador {
    
    private IDominioFachada dominio;

    public ServicioRegistrarJugador() {
        dominio = new DominioFachada(0, 0);
    }
    
    public void crearJugador(IJugador jugador){
    
    }
    
    public void unirsePartida(IJugador jugador){
        dominio.agregarJugador((Jugador) jugador);
    }
    
    
}
