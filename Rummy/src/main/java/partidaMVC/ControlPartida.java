package partidaMVC;

import partidaMVC.ModeloPartida;
import org.itson.arquitectura.datosrummy.Jugador;
import org.itson.arquitectura.datosrummy.Partida;
import partidaMVC.PantallaPartida;

/**
 *
 * @author Equipo4
 */
public class ControlPartida {

    private static ControlPartida instance;
    private ModeloPartida modelo;

    /**
     * Constructor del modelo
     *
     * @param pantalla valor de la pantalla de vista
     */
    public ControlPartida() {
        this.modelo = new ModeloPartida();
    }

    public void iniciarPartida(ControlPartida controlPartida) {
        modelo.iniciarPartida();
    }

    /**
     * Indica al modelo que debe de tomar ua ficha
     */
    public void tomarFicha(Jugador jugador) {
        modelo.agregarFichaJugador(jugador, modelo.obtenerFichaMazo());
    }

    public static ControlPartida getInstance() {
        if (instance == null) {
            instance = new ControlPartida();
        }
        return instance;
    }

}
