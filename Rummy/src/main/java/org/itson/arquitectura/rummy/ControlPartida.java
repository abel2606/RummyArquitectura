package org.itson.arquitectura.rummy;

/**
 *
 * @author Abe
 */
public class ControlPartida {

    private ModeloPantallaPartida modelo;

    public ControlPartida(ModeloPantallaPartida modelo) {
        this.modelo = modelo;
    }

    public void tomarFicha() {
        modelo.agregarFichaJugador(modelo.obtenerFichaMazo());
    }
}
