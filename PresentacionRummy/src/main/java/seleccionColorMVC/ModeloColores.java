package seleccionColorMVC;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitectura.aplicacionrummy.servicios.IAplicacionFachada;
import org.itson.arquitectura.dominiorummy.Color;
import org.itson.arquitectura.dominiorummy.IJugador;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.TipoConjunto;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;
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
    private String error;
    private String nombre;
    private String avatar;
    private boolean host;
    
    public ModeloColores(){
    }
    
    public void crearParametrosMVC(){
       pantalla = PantallaSeleccionarColor.getInstance();
    }
    
    public void asignarColoresJugador(List<Integer> colores) {
        IJugador jugador = new Jugador(this.nombre, this.avatar);
        jugador.setColores((convertirColores(colores)));
        
        if(host){
            fachadaAplicacion.registrarJugador(jugador);
        } else {
            try {
                fachadaInfraestructura.solicitarUnirsePartida();
            } catch (InfraestructuraException ex) {
                error = "Hubo un error al guardar el jugador. :(";
            }
        } 
    }
    
    public void asignarNombreYAvatarJugador(String nombre, String avatar, boolean host){
        this.nombre = nombre;
        this.avatar = avatar;
        this.host = host;
    }
    
    public void notificar(){
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
    
    private JugadorDTO convertirJugadorAJugadorDTO(IJugador jugador){
        return new JugadorDTO(jugador.getNombre(), jugador.getAvatar());
    }
}

