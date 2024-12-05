package seleccionColorMVC;

import java.util.ArrayList;
import java.util.List;
import org.itson.arquitectura.aplicacionrummy.servicios.AplicacionFachada;
import org.itson.arquitectura.aplicacionrummy.servicios.IAplicacionFachada;
import org.itson.arquitectura.dominiorummy.Color;
import org.itson.arquitectura.dominiorummy.IJugador;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.TipoConjunto;

/**
 * @author Equipo4
 */
public class ModeloColores implements IModeloColores {

    private static ModeloColores modelo;
    private IPantallaSeleccionarColor pantalla;
    private IAplicacionFachada fachadaAplicacion;
    private String error;
    private String nombre;
    private String avatar;
    private boolean host;

    private ModeloColores() {
    }

    public void crearParametrosMVC() {
        pantalla = PantallaSeleccionarColor.getInstance();
    }
    
    public void crearJugador(List<Integer> colores) {
        fachadaAplicacion = new AplicacionFachada();
        IJugador jugador = new Jugador(this.nombre, this.avatar);
        jugador.setColores((convertirColores(colores)));
        fachadaAplicacion.registrarJugador(jugador);
    }

    public void asignarNombreAvatarJugador(String nombre, String avatar) {
        this.nombre = nombre;
        this.avatar = avatar;
    }

    public void notificar() {
        pantalla.update(this);
    }

    public static ModeloColores getInstance() {
        if (modelo == null) {
            modelo = new ModeloColores();
        }
        return modelo;
    }

    @Override
    public String getError() {
        return this.error;
    }

    private List<Color> convertirColores(List<Integer> colores) {
        List<Color> listaColores = new ArrayList<>();

        for (int i = 0; i < colores.size(); i++) {
            Integer codigoHex = colores.get(i);
            TipoConjunto conjunto = new TipoConjunto(i + 1);
            Color color = new Color(codigoHex, conjunto);
            listaColores.add(color);
        }

        return listaColores;
    }
    
}
