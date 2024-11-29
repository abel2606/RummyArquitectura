/*
 * ControlConfigurarPartida.java
 */
package configurarPartidaMVC;

import inicioMVC.ControlInicio;
import org.itson.arquitectura.dominiorummy.IPartida;
import registrarJugadorMVC.ControlConfigurarJugador;

/**
 *
 * @author Abe
 */public class ControlConfigurarPartida {
    
    private static ControlConfigurarPartida control;
    private ControlInicio inicio;
    private ControlConfigurarJugador configurarJugador;
    private ModeloConfigurarPartida modelo;
    
    private ControlConfigurarPartida(){
    }
    
    public void crearParametrosMVC() {
        inicio = ControlInicio.getInstance();
//        configurarJugador = ControlConfigurarJugador.getInstance();
        modelo = ModeloConfigurarPartida.getInstance();
    }
    
    public void crearPartida(IPartida partida){
        if(modelo.crearPartida(partida)!=null){
            
            configurarJugador.mostrarVista();
        }
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
