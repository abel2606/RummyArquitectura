package org.itson.arquitectura.rummy;

import org.itson.arquitectura.datosrummy.Ficha;
import org.itson.arquitectura.datosrummy.Jugador;
import org.itson.arquitectura.datosrummy.Partida;

/**
 *
 * @author Abe
 */
public class ModeloPantallaPartida {
    private Partida partida;
    private Jugador jugador;

    public ModeloPantallaPartida() {
    }
     
    public Ficha obtenerFichaMazo(){
        return partida.tomarFicha();
    }
    
    public void agregarFichaJugador(Ficha ficha){
        jugador.agregarFicha(ficha);
    }
}
