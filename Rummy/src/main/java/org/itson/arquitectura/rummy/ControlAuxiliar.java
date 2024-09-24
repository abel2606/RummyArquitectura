package org.itson.arquitectura.rummy;

import org.itson.arquitectura.datosrummy.Jugador;

/**
 *
 * @author ricar
 */
public class ControlAuxiliar {

    private ModeloAuxiliar modelo;
    
    public ControlAuxiliar(PantallaPartida pantalla) {
        modelo = new ModeloAuxiliar(pantalla);
    }
    
    public Jugador obtenerJugadorActual(){
        return modelo.getJugadorActual();
    }
    
    public void prepararDatos(){
        modelo.generarMazo();
        modelo.anadirJugadores();
        modelo.repartirFichas();
        modelo.dibujarMano();
    }
    
}
