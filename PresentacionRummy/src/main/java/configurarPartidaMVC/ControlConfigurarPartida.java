/*
 * ControlConfigurarPartida.java
 */
package configurarPartidaMVC;

import inicioMVC.ControlInicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaInfraestructura;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.IFachadaInfraestructura;
import registrarJugadorMVC.ControlConfigurarJugador;

/**
 *
 * @author Abe
 */
public class ControlConfigurarPartida {

    private static ControlConfigurarPartida control;
    private ControlInicio inicio;
    private ControlConfigurarJugador controlConfigurarJugador;
    private ModeloConfigurarPartida modelo;
    private IFachadaInfraestructura infraestructura;

    private ControlConfigurarPartida() {
    }

    public void crearParametrosMVC() {
        inicio = ControlInicio.getInstance();
        controlConfigurarJugador = ControlConfigurarJugador.getInstance();
        modelo = ModeloConfigurarPartida.getInstance();
        infraestructura = new FachadaInfraestructura();
    }

    public void crearPartida(int rangoFichas, int numeroComodines) {
        try {
            modelo.crearPartida(rangoFichas, numeroComodines);
            controlConfigurarJugador.mostrarVista(true);
            infraestructura.crearPartida();
        } catch (InfraestructuraException ex) {
            modelo.setError("Ocurrió un error al enviar la solicitud, intenta de nuevo más tarde.");
            modelo.notificar();
        }
    }
    
    public void verificarPartidaCreada() {
        modelo.suscribirseManejador();
        try {
            infraestructura.verificarPartidaCreada();
        } catch (InfraestructuraException ex) {
            Logger.getLogger(ModeloConfigurarPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void iniciarConfigurarJugador() {
        controlConfigurarJugador.mostrarVista(true);
    }
    
    public void mostrarVista() {
        modelo.notificar();
    }

    public void cancelarAccion() {
        inicio.mostrarVista();
    }

    public static ControlConfigurarPartida getInstance() {
        if (control == null) {
            control = new ControlConfigurarPartida();
        }
        return control;
    }

}
