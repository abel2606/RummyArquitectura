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

    public ModeloPantallaPartida() {
        partida = Partida.getInstance();
    }
    
    public Ficha obtenerFichaMazo() {
        return partida.tomarFicha();
    }

    public void agregarFichaJugador(Jugador jugador, Ficha ficha) {
        jugador.agregarFicha(ficha);
    }
}
