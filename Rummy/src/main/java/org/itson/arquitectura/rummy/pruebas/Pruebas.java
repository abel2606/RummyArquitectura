package org.itson.arquitectura.rummy.pruebas;

import org.itson.arquitectura.rummy.ControlPartida;
import org.itson.arquitectura.rummy.ModeloPantallaPartida;

/**
 *
 * @author ricar
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModeloPantallaPartida mPP = new ModeloPantallaPartida();
        ControlPartida controlPartida = new ControlPartida(mPP);
        
        controlPartida.tomarFicha();
    }
    
}
