/*
 * ControlInicio.java
 */
package inicioMVC;

import configurarPartidaMVC.ControlConfigurarPartida;
import unirsePartidaMVC.ControlUnirsePartida;

/**
 *
 * @author Equipo4
 */
public class ControlInicio {

    private static ControlInicio control;
    private ControlConfigurarPartida configurarPartida;
    private ControlUnirsePartida unirsePartida;
    private ModeloInicio modelo;

    private ControlInicio(ModeloInicio modelo, ControlConfigurarPartida configurarPartida, ControlUnirsePartida unirsePartida) {
        this.configurarPartida = configurarPartida;
        this.modelo = modelo;
        this.unirsePartida = unirsePartida;
    }

    public void configurarPartida() {
        configurarPartida.mostrarVista();
    }

    public void unirsePartida() {
//        unirsePartida.mostrarVista();
    }

    public void mostrarVista() {
        modelo.notificar();
    }

    public static ControlInicio getInstance(ModeloInicio modelo, ControlConfigurarPartida configurarPartida, ControlUnirsePartida unirsePartida) {
        if (control == null) {
            control = new ControlInicio(modelo, configurarPartida, unirsePartida);
        }
        return control;
    }

}
