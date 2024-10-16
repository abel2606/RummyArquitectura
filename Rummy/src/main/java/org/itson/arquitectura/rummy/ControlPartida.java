package org.itson.arquitectura.rummy;

import org.itson.arquitectura.datosrummy.Jugador;
import org.itson.arquitectura.vistas.PantallaPartida;

/**
 *
 * @author Equipo4 
 */
public class ControlPartida {

    private ModeloPantallaPartida modelo;

    /**
     * Constructor del modelo
     * @param pantalla valor de la pantalla de vista
     */
    public ControlPartida(PantallaPartida pantalla) {
        this.modelo = new ModeloPantallaPartida(pantalla);
    }

    /**
     * Indica al modelo que debe de tomar ua ficha
     */
    public void tomarFicha(Jugador jugador) {
        modelo.agregarFichaJugador(jugador, modelo.obtenerFichaMazo());
    }
    
}
