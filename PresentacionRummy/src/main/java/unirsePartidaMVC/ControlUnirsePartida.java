/*
 * CControlUnirsePartida.java
 */
package unirsePartidaMVC;

import inicioMVC.ControlInicio;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaInfraestructura;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.IFachadaInfraestructura;
import registrarJugadorMVC.ControlConfigurarJugador;

/**
 * @author Equipo4
 */
public class ControlUnirsePartida {

    private static ControlUnirsePartida control;
    private ControlInicio inicio;
    private ControlConfigurarJugador configurarJugador;
    private ModeloUnirsePartida modelo;
    private IFachadaInfraestructura infraestructura;

    private ControlUnirsePartida() {
    }

    public void enviarSolicitudUnirsePartida() {
        try {
            infraestructura.establecerConexion();
            infraestructura.solicitarUnirsePartida();
        } catch (InfraestructuraException ex) {
            modelo.setError("Ocurrió un error al enviar la solicitud, intenta de nuevo más tarde.");
            modelo.notificar();
        }
    }

    public void cancelarAccion() {
        inicio.mostrarVista();
    }

    public void iniciarConfigurarJugador() {
        configurarJugador.mostrarVista(false);
    }

    public void crearParametrosMVC() {
        inicio = ControlInicio.getInstance();
        configurarJugador = ControlConfigurarJugador.getInstance();
        modelo = ModeloUnirsePartida.getInstance();
        infraestructura = new FachadaInfraestructura();
    }

    public void mostrarVista() {
        modelo.suscribirse();
        modelo.notificar();
    }

    public static ControlUnirsePartida getInstance() {
        if (control == null) {
            control = new ControlUnirsePartida();
        }
        return control;
    }

}
