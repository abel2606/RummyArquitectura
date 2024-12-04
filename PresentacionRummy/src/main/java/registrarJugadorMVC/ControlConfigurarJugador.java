package registrarJugadorMVC;

import inicioMVC.ControlInicio;
import seleccionColorMVC.ControlColores;

/**
 *
 * @author Equipo4
 */
public class ControlConfigurarJugador {
    
    private static ControlConfigurarJugador control;
    private ControlColores controlColores;
    private ControlInicio controlInicio;
    private ModeloConfigurarJugador modelo;
    
    
    public ControlConfigurarJugador(){
    }
    
    public void crearParametrosMVC() {
        controlColores = ControlColores.getInstance();
        controlInicio = ControlInicio.getInstance();
        modelo = ModeloConfigurarJugador.getInstance();
    }
    
    public void mostrarVista() {
        modelo.notificar();
    }
    
    public void continuarConfiguracion(String nombre, String avatar){
        controlColores.mostrarVista(nombre, avatar);
    }
    
    public static ControlConfigurarJugador getInstance() {
        if (control == null) {
            control = new ControlConfigurarJugador();
        }
        return control;
    }
    
}
