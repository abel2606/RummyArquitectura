package registrarJugadorMVC;

import inicioMVC.ControlInicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaInfraestructura;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.IFachadaInfraestructura;
import seleccionColorMVC.ControlColores;

/**
 *
 * @author Equipo4
 */
public class ControlConfigurarJugador {
    
    private static ControlConfigurarJugador control;
    private ControlColores controlColores;
    private ControlInicio controlInicio;
    private ModeloConfigurarJugador modelo;
    private IFachadaInfraestructura infraestructura;
    
    
    public ControlConfigurarJugador(){
    }
    
    public void crearParametrosMVC() {
        controlColores = ControlColores.getInstance();
        controlInicio = ControlInicio.getInstance();
        modelo = ModeloConfigurarJugador.getInstance();
    }
    
    public void mostrarVista(boolean host) {
        modelo.setHost(host);
        modelo.notificar();
    }
    
    public void enviarInformacionAnfitrion(String nombre, String avatar) {
        infraestructura = new FachadaInfraestructura();
        JugadorDTO jugadorNuevo = new JugadorDTO(nombre, avatar);
        
        try {
            infraestructura.enviarJugadorAnfitrion(jugadorNuevo);
        } catch (InfraestructuraException ex) {
            modelo.setError("Hubo un error al comunicarse con el anfitrión. :(");
            modelo.notificar();
        }
    } 
    
    public void iniciarSeleccionarColores(String nombre, String avatar){
        controlColores.asignarNombreAvatarJugador(nombre, avatar);
        controlColores.mostrarVista();
    }
    
    public static ControlConfigurarJugador getInstance() {
        if (control == null) {
            control = new ControlConfigurarJugador();
        }
        return control;
    }
    
}
