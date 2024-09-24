package org.itson.arquitectura.rummy;

/**
 *
 * @author Abe
 */
public class ControlPartida {

    private ModeloPantallaPartida modelo;
    private ControlAuxiliar controlAuxiliar;

    /**
     * Constructor del modelo
     * @param pantalla valor de la pantalla de vista
     */
    public ControlPartida(PantallaPartida pantalla) {
        this.modelo = new ModeloPantallaPartida(pantalla);
        
        controlAuxiliar = new ControlAuxiliar(pantalla);
        controlAuxiliar.prepararDatos();
    }

    /**
     * Indica al modelo que debe de tomar ua ficha
     */
    public void tomarFicha() {
        modelo.agregarFichaJugador(controlAuxiliar.obtenerJugadorActual(), modelo.obtenerFichaMazo());
    }
    
}
