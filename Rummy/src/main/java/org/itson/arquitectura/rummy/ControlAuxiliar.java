package org.itson.arquitectura.rummy;

import org.itson.arquitectura.datosrummy.Jugador;

/**
 *
 * @author ricar
 */
public class ControlAuxiliar {

    private ModeloAuxiliar modelo;
    
    public ControlAuxiliar() {
        modelo = new ModeloAuxiliar();
    }
    
    public Jugador obtenerJugadorActual(){
        return modelo.getJugadorActual();
    }
    
    public void prepararDatos(){
        modelo.generarMazo();
        modelo.anadirJugadores();
        modelo.repartirFichas();
        modelo.colorearFichas();
    }
    
}
