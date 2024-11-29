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
    
    public void iniciarConfiguracion(int rangoFichas, int numeroComodines){
        

    }
    
    public void crearParametrosMVC() {
        controlColores = ControlColores.getInstance();
        controlInicio = ControlInicio.getInstance();
        modelo = ModeloConfigurarJugador.getInstance();
    }
    
    public void mostrarVista() {
        modelo.mostrarVista();
    }
    
    public void continuarConfiguracion(String nombre, String avatar){
        //yo voy a usar este
    }
    
    public static ControlConfigurarJugador getInstance() {
        if (control == null) {
            control = new ControlConfigurarJugador();
        }
        return control;
    }
    
}
