/*
 * ModeloConfigurarPartida.java
 */
package configurarPartidaMVC;

import java.util.logging.Level;
import java.util.logging.Logger;
import manejadorRespuestas.IOyenteManejadorRespuestas;
import org.itson.arquitectura.aplicacionrummy.fachada.AplicacionFachada;
import org.itson.arquitectura.aplicacionrummy.fachada.IAplicacionFachada;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Partida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaCreada;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaInfraestructura;

/**
 * @author Equipo4
 */
public class ModeloConfigurarPartida implements IOyenteManejadorRespuestas {

    private static ModeloConfigurarPartida modelo;
    private IPantallaConfigurarPartida vista;
    private IPartida partida;

    private ModeloConfigurarPartida() {
    }

    public void crearParametrosMVC() {
        vista = PantallaConfigurarPartida.getInstance();
    }

    public void notificar() {
        vista.update();
    }

    public Partida crearPartida(IPartida partida) {
        IAplicacionFachada aplicacionFachada = new AplicacionFachada();
        FachadaInfraestructura infraestructura = new FachadaInfraestructura();
        Partida partidaCreada = aplicacionFachada.configurarPartida(partida);
        partidaCreada.toString();
        partidaCreada.getNumeroComodines();
        partidaCreada.getRangoFichas();
        partidaCreada.getJugadores();
        PartidaDTO partidaDTO = new PartidaDTO();
        try {
            infraestructura.crearPartida(partidaDTO);
        } catch (InfraestructuraException ex) {
            Logger.getLogger(ModeloConfigurarPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return partidaCreada;
    }

    public static ModeloConfigurarPartida getInstance() {
        if (modelo == null) {
            modelo = new ModeloConfigurarPartida();
        }
        return modelo;
    }

    @Override
    public void update() {
        vista.crearPartida();
    }

}
