package org.itson.arquitectura.rummy;

import org.itson.arquitectura.vistas.PantallaPartida;
import org.itson.arquitectura.datosrummy.Jugador;

/**
 *
 * @author Equipo4
 */
public class ControlAuxiliar {

    private ModeloAuxiliar modelo;
    
    /**
     * Constructor del control auxiliar
     * @param pantalla pantalla de la vista
     */
    public ControlAuxiliar(PantallaPartida pantalla) {
        modelo = new ModeloAuxiliar(pantalla);
    }
    
    /**
     * Regresa al jugador actual
     * @return valor del jugador actual
     */
    public Jugador obtenerJugadorActual(){
        return modelo.getJugadorActual();
    }
    
    /**
     * prepara los datos de la partida
     */
    public void prepararDatos(){
        modelo.generarMazo();
        modelo.anadirJugadores();
        modelo.repartirFichas();
        modelo.dibujarMano();
    }
    
}
