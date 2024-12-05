package seleccionColorMVC;

import java.util.List;
import salaEsperaMVC.ControlSalaEspera;

/**
 * @author Equipo4
 */
public class ControlColores {

    private static ControlColores control;
    private ControlSalaEspera salaEspera;
    private ModeloColores modelo;

    private ControlColores() {
    }

    public void crearParametrosMVC() {
        modelo = ModeloColores.getInstance();
        salaEspera = ControlSalaEspera.getInstance();
    }

    public void asignarNombreAvatarJugador(String nombre, String avatar) {
        modelo.asignarNombreAvatarJugador(nombre, avatar);
    }

    public void crearJugador(List<Integer> colores) {
        modelo.crearJugador(colores);
        salaEspera.asignarNombreAvatarJugador(modelo.getNombre(), modelo.getAvatar());
        salaEspera.mostrarVista();
    }

    public static ControlColores getInstance() {
        if (control == null) {
            control = new ControlColores();
        }
        return control;
    }

    public void mostrarVista() {
        modelo.notificar();
    }

}
