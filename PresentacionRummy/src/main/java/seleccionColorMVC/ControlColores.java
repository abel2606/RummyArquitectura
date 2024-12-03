package seleccionColorMVC;

/**
 *
 * @author Equipo4
 */
public class ControlColores {
    
    private static ControlColores control;
    public ModeloColores modelo;
    
    public ControlColores(){
        modelo = new ModeloColores();
    }
    
    public void iniciarConfiguracion(String nombre, String avatar){
        
    }
    
    public void agregarcoloresJugador(String[] colores){
        
    }
    
    public static ControlColores getInstance() {
        if (control == null) {
            control = new ControlColores();
        }
        return control;
    }

    public void mostrarVista(String nombre, String avatar) {
        modelo.mostrarVista();
    }
   
}
