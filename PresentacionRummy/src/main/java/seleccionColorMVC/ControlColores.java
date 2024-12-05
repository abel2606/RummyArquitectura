package seleccionColorMVC;

import java.util.List;

/**
 * @author Equipo4
 */
public class ControlColores {

    private static ControlColores control;
    private ModeloColores modelo;

    public ControlColores() {
        modelo = new ModeloColores();
    }

    public void crearParametrosMVC() {
        modelo = ModeloColores.getInstance();
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
