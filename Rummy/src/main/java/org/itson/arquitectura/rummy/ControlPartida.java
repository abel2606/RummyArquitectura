package org.itson.arquitectura.rummy;

/**
 *
 * @author Abe
 */
public class ControlPartida {

    private ModeloPantallaPartida modelo;
    private ControlAuxiliar controlAuxiliar;

    public ControlPartida(ModeloPantallaPartida modelo) {
        this.modelo = modelo;
        
        controlAuxiliar = new ControlAuxiliar();
        controlAuxiliar.prepararDatos();
    }

    public void tomarFicha() {
        modelo.agregarFichaJugador(controlAuxiliar.obtenerJugadorActual(), modelo.obtenerFichaMazo());
    }
}
