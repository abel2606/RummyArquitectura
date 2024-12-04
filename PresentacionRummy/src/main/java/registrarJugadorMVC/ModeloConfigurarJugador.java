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
    private IPartida partida;
    private JugadorDTO jugador;

    public ModeloConfigurarJugador() {
    }
    
    public void crearParametrosMVC() {
        pantalla = PantallaConfigurarJugador.getInstance();
        partida = Partida.getInstance();
    }
    
    public void crearJugador(IJugador jugador){
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
