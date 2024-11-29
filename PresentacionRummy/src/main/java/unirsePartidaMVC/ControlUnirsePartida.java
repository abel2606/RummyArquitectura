/*
 * CControlUnirsePartida.java
 */
package unirsePartidaMVC;

import inicioMVC.ControlInicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaInfraestructura;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.IFachadaInfraestructura;

/**
 * @author Equipo4
 */
public class ControlUnirsePartida {

    private static ControlUnirsePartida control;
    private ControlInicio inicio;
//    private ControlConfigurarJugador configurarJugador;
    private ModeloUnirsePartida modelo;
    private IFachadaInfraestructura infraestructura;
    
    private ControlUnirsePartida() { 
    }
    
    public void verificarCodigoPartida(String codigo){
        
    }
    
    public void enviarSolicitudUnirsePartida(){
        try {
            infraestructura = new FachadaInfraestructura();
            infraestructura.solicitarUnirsePartida();
        } catch (InfraestructuraException ex) {
            modelo.notificar("Ocurrió un error al enviar la solicitud, intenta de nuevo más tarde.");
        }
    }
    
    public void cancelarAccion() {
        inicio.mostrarVista();
    }

    public void crearParametrosMVC() {
        inicio = ControlInicio.getInstance();
//        configurarJugador = ControlConfigurarJugador.getInstance();
//        infraestructura = new FachadaInfraestructura();
        modelo = ModeloUnirsePartida.getInstance();
    }
    
    public void mostrarVista() {
        modelo.notificar(null);
    }
    
    public static ControlUnirsePartida getInstance() {
        if (control == null) {
            control = new ControlUnirsePartida();
        }
        return control;
    }
    
}
