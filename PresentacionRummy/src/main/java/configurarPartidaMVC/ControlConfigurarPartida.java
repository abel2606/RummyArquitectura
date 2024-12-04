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
    private IPartida partida;

    private ControlConfigurarPartida() {
    }

    public void crearParametrosMVC() {
        inicio = ControlInicio.getInstance();
        controlConfigurarJugador = ControlConfigurarJugador.getInstance();
        modelo = ModeloConfigurarPartida.getInstance();
    }

    public void crearPartida(int rangoFichas, int numeroComodines) {
        modelo.crearPartida(rangoFichas, numeroComodines);
        
        controlConfigurarJugador.mostrarVista(true);
    }
    
    public void verificarPartidaCreada() {
        modelo.suscribirseManejador();
        FachadaInfraestructura infraestructura = new FachadaInfraestructura();
        try {
            infraestructura.crearPartida();
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
