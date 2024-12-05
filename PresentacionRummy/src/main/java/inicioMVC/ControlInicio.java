/*
 * ControlInicio.java
 */
package inicioMVC;

import configurarPartidaMVC.ControlConfigurarPartida;
import unirsePartidaMVC.ControlUnirsePartida;

/**
 * @author Equipo4
 */
public class ControlInicio {

    private static ControlInicio control;
    private ControlConfigurarPartida configurarPartida;
    private ControlUnirsePartida unirsePartida;
    private ModeloInicio modelo;

    private ControlInicio() {
    }

    public void configurarPartida() {
        configurarPartida.mostrarVista();
    }

    public void unirsePartida() {
        unirsePartida.mostrarVista();
        unirsePartida.enviarSolicitudUnirsePartida();
    }

    public void mostrarVista() {
        modelo.notificar();
    }
    
    public void crearParametrosMVC() {
        configurarPartida = ControlConfigurarPartida.getInstance();
        unirsePartida = ControlUnirsePartida.getInstance();
        modelo = ModeloInicio.getInstance();
    }

    public static ControlInicio getInstance() {
        if (control == null) {
            control = new ControlInicio();
        }
        return control;
    }

}
