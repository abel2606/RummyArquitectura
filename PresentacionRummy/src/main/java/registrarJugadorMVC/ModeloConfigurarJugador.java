package registrarJugadorMVC;

import org.itson.arquitectura.dominiorummy.IJugador;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Partida;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 *
 * @author Equipo4
 */
public class ModeloConfigurarJugador {
    
    private static ModeloConfigurarJugador modelo;
    private IPantallaConfigurarJugador pantalla;
    private boolean host;
    

    public ModeloConfigurarJugador() {
    }
    
    public void crearParametrosMVC() {
        pantalla = PantallaConfigurarJugador.getInstance();
    }
    
    public void crearJugador(){
        
    }
    
    public void notificar(){
        pantalla.update();
    }
    
    public static ModeloConfigurarJugador getInstance() {
        if (modelo == null) {
            modelo = new ModeloConfigurarJugador();
        }
        return modelo;
    }
}
