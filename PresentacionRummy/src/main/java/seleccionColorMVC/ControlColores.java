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

    public ControlColores() {
        modelo = new ModeloColores();
    }

    public void crearParametrosMVC() {
        modelo = ModeloColores.getInstance();
        salaEspera = ControlSalaEspera.getInstance(null);
    }

    public void asignarNombreYAvatarJugador(String nombre, String avatar, boolean host) {
        modelo.asignarNombreYAvatarJugador(nombre, avatar, host);
        mostrarVista();
    }

    public void asignarColoresJugador(List<Integer> colores) {
        modelo.asignarColoresJugador(colores);
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
