package partidaMVC;

import partidaMVC.ModeloPartida;
import org.itson.arquitectura.datosrummy.Jugador;
import partidaMVC.PantallaPartida;

/**
 *
 * @author Equipo4 
 */
public class ControlPartida {

    private ModeloPartida modelo;

    /**
     * Constructor del modelo
     * @param pantalla valor de la pantalla de vista
     */
    public ControlPartida() {
        this.modelo = new ModeloPartida();
    }

//    /**
//     * Indica al modelo que debe de tomar ua ficha
//     */
//    public void tomarFicha(Jugador jugador) {
//        modelo.agregarFichaJugador(jugador, modelo.obtenerFichaMazo());
//    }
    
    public void mostrarPantalla(){
        modelo.mostrar();
    }
    
    public void iniciarPartida(){
        
    }
    public void avisar(){
        
    }
    public void jalarFicha(){
        
    }
    public void agregarFichaMano(){
        
    }
    public void colocarFichaTablero(){
        
    }
    
    public void terminarPartida(){
        
    }
    public void terminarTurno(){
        
    }
    
}
