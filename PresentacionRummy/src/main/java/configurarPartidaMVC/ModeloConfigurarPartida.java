/*
 * ModeloConfigurarPartida.java
 */
package configurarPartidaMVC;

import org.itson.arquitectura.aplicacionrummy.fachada.AplicacionFachada;
import org.itson.arquitectura.aplicacionrummy.fachada.IAplicacionFachada;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Partida;

/**
 * @author Equipo4
 */public class ModeloConfigurarPartida {

    private static ModeloConfigurarPartida modelo;
    private IPantallaConfigurarPartida vista;

    private ModeloConfigurarPartida() {
    }
    
    public void crearParametrosMVC() {
        vista = PantallaConfigurarPartida.getInstance();
    }
    
    public void notificar() {
        vista.update();
    }
    
    public Partida crearPartida(IPartida partida){
        IAplicacionFachada aplicacionFachada = new AplicacionFachada();
        
        Partida partidaCreada = aplicacionFachada.configurarPartida(partida);
        partidaCreada.toString();
        return partidaCreada;
    }
    
    public static ModeloConfigurarPartida getInstance() {
        if (modelo == null) {
            modelo = new ModeloConfigurarPartida();
        }
        return modelo;
    }

}
