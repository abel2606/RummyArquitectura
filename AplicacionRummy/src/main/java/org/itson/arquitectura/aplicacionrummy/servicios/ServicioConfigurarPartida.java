/*
 * ServicioConfigurarPartida.java
 */
package org.itson.arquitectura.aplicacionrummy.servicios;

import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Partida;
import org.itson.arquitectura.dominiorummy.fachada.DominioFachada;
import org.itson.arquitectura.dominiorummy.fachada.IDominioFachada;

/**
 * @author Equipo4
 */
public class ServicioConfigurarPartida {

    private IDominioFachada dominioFachada;

    /**
     * Constructor que inicializa el servicio con la fachada de dominio.
     *
     * @param dominioFachada Fachada de dominio para interactuar con la lógica
     * central del juego.
     */
    public ServicioConfigurarPartida() {
        this.dominioFachada = new DominioFachada(0, 0);
    }

    /**
     * Configura los parámetros de la partida.
     *
     * @param numeroComodines Número de comodines que tendrá la partida.
     * @param rangoFichas Rango de las fichas numéricas.
     * @return La partida configurada.
     */
    public Partida configurarPartida(IPartida partida) {
        return dominioFachada.configurarPartida(partida);
        
    }

}
