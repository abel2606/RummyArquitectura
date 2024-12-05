/*
 * ControlInicio.java
 */
package inicioMVC;

import configurarPartidaMVC.ControlConfigurarPartida;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaInfraestructura;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.IFachadaInfraestructura;
import unirsePartidaMVC.ControlUnirsePartida;

/**
 * @author Equipo4
 */
public class ControlInicio {

    private static ControlInicio control;
    private ControlConfigurarPartida configurarPartida;
    private ControlUnirsePartida unirsePartida;
    private ModeloInicio modelo;
    private IFachadaInfraestructura infraestructura;

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
        infraestructura = new FachadaInfraestructura();
    }

    public static ControlInicio getInstance() {
        if (control == null) {
            control = new ControlInicio();
        }
        return control;
    }

    void verificarPartidaCreada() {
        try {
            infraestructura.verificarPartidaCreada();
        } catch (InfraestructuraException ex) {
            modelo.setError("Ocurrió un error al enviar la solicitud, intenta de nuevo más tarde.");
            modelo.notificar();
        }
    }

}
