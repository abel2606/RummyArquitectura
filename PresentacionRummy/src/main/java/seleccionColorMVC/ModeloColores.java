package seleccionColorMVC;

import java.util.ArrayList;
import java.util.List;
import org.itson.arquitectura.dominiorummy.Color;
import org.itson.arquitectura.dominiorummy.IJugador;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.TipoConjunto;

/**
 *
 * @author Equipo4
 */
public class ModeloColores implements IModeloColores {
    
    private static ModeloColores modelo;
    private IPantallaSeleccionarColor pantalla;
    private String nombre;
    private String avatar;
    
    public ModeloColores(){
    }
    
    public void crearParametrosMVC(){
       pantalla = PantallaSeleccionarColor.getInstance();
    }
    
    public void asignarColoresJugador(List<Integer> colores){
        IJugador jugador = new Jugador(this.nombre, this.avatar);
        jugador.setColores((convertirColores(colores)));
        
        //ya q creé el jugador aquí va a ir la lógica de donde se manda al servlet o a partida
    }
    
    public void asignarNombreYAvatarJugador(String nombre, String avatar){
        this.nombre = nombre;
        this.avatar = avatar;
    }
    
    public void notificar(){
        pantalla.update();
    }
    
    public static ModeloColores getInstance() {
        if (modelo == null) {
            modelo = new ModeloColores();
        }
        return modelo;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getAvatar() {
        return this.avatar;
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

