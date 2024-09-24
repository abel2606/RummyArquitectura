package org.itson.arquitectura.rummy;

/**
 *
 * @author Abe
 */
public class ControlPartida {

    private ModeloPantallaPartida modelo;
    private ControlAuxiliar controlAuxiliar;

    public ControlPartida(PantallaPartida pantalla) {
        this.modelo = new ModeloPantallaPartida(pantalla);
        
        controlAuxiliar = new ControlAuxiliar(pantalla);
        controlAuxiliar.prepararDatos();
    }

    public void tomarFicha() {
        modelo.agregarFichaJugador(controlAuxiliar.obtenerJugadorActual(), modelo.obtenerFichaMazo());
    }
    
}
