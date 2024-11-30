/*
 * ControlConfigurarPartida.java
 */
package configurarPartidaMVC;

import inicioMVC.ControlInicio;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaCreada;
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

    private ControlConfigurarPartida() {
    }

    public void crearParametrosMVC() {
        inicio = ControlInicio.getInstance();
        controlConfigurarJugador = ControlConfigurarJugador.getInstance();
        modelo = ModeloConfigurarPartida.getInstance();
    }

    public void crearPartida(IPartida partida) {
        modelo.crearPartida(partida);
    }
    
    public void cambiarVista() {
        controlConfigurarJugador.mostrarVista();
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
