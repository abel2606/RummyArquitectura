package seleccionColorMVC;

import java.util.ArrayList;
import java.util.List;
import org.itson.arquitectura.aplicacionrummy.servicios.IAplicacionFachada;
import org.itson.arquitectura.dominiorummy.Color;
import org.itson.arquitectura.dominiorummy.IJugador;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.TipoConjunto;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.IFachadaInfraestructura;

/**
 *
 * @author Equipo4
 */
public class ModeloColores implements IModeloColores {
    
    private static ModeloColores modelo;
    private IPantallaSeleccionarColor pantalla;
    private IAplicacionFachada fachadaAplicacion;
    private IFachadaInfraestructura fachadaInfraestructura;
    private String nombre;
    private String avatar;
    private boolean host;
    
    public ModeloColores(){
    }
    
    public void crearParametrosMVC(){
       pantalla = PantallaSeleccionarColor.getInstance();
    }
    
    public void asignarColoresJugador(List<Integer> colores){
        IJugador jugador = new Jugador(this.nombre, this.avatar);
        jugador.setColores((convertirColores(colores)));
        
//        if(this.host == true){
//            fachadaAplicacion.registrarJugador(jugador);
//        } else {
//            fachadaInfraestructura.solicitarInicioPartida(convertirJugadorAJugadorDTO(jugador));
//        } 
    }
    
    public void asignarNombreYAvatarJugador(String nombre, String avatar, boolean host){
        this.nombre = nombre;
        this.avatar = avatar;
        this.host = host;
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
    
    private JugadorDTO convertirJugadorAJugadorDTO(Jugador jugador){
        return new JugadorDTO(jugador.getNombre(), jugador.getAvatar());
    }
}

