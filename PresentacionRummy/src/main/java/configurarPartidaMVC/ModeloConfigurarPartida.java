/*
 * ModeloConfigurarPartida.java
 */
package configurarPartidaMVC;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.manejadorRespuestas.IOyenteManejadorRespuestas;
import org.itson.arquitectura.aplicacionrummy.servicios.AplicacionFachada;
import org.itson.arquitectura.aplicacionrummy.servicios.IAplicacionFachada;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.Partida;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaInfraestructura;
import org.itson.arquitecturasoftware.manejadorRespuestas.IManejadorRespuestas;
import org.itson.arquitecturasoftware.manejadorRespuestas.ManejadorRespuestas;

/**
 * @author Equipo4
 */
public class ModeloConfigurarPartida implements IOyenteManejadorRespuestas {

    private static ModeloConfigurarPartida modelo;
    private IPantallaConfigurarPartida vista;
    private IPartida partida;
    private ManejadorRespuestas manejador;

    private ModeloConfigurarPartida() {
        manejador = new ManejadorRespuestas();
        manejador.subscribe(this);
    }

    public void crearParametrosMVC() {
        vista = PantallaConfigurarPartida.getInstance();
    }

    public void notificar() {
        vista.update();
    }

    public void crearPartida(IPartida partida) {
        IAplicacionFachada aplicacionFachada = new AplicacionFachada();
        FachadaInfraestructura infraestructura = new FachadaInfraestructura();
        Partida partidaCreada = aplicacionFachada.configurarPartida(partida);
        List<JugadorDTO> jugadores = convertirJugadores(partidaCreada.getJugadores());
        int numeroComodines = partidaCreada.getNumeroComodines();
        int rangoFichas = partidaCreada.getRangoFichas();
        PartidaDTO partidaDTO = new PartidaDTO(jugadores, numeroComodines, rangoFichas);
        try {
            infraestructura.crearPartida(partidaDTO);
        } catch (InfraestructuraException ex) {
            Logger.getLogger(ModeloConfigurarPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ModeloConfigurarPartida getInstance() {
        if (modelo == null) {
            modelo = new ModeloConfigurarPartida();
        }
        return modelo;
    }

    @Override
    public void update(IManejadorRespuestas contexto) {
        vista.crearPartida();
    }

    private List<JugadorDTO> convertirJugadores(List<Jugador> jugadores) {
        List<JugadorDTO> jugadoresDTO = new ArrayList<>();
        for (Jugador jugador : jugadores) {
            JugadorDTO jugadorDTO = new JugadorDTO(
                    jugador.getNombre(),
                    jugador.getAvatar(),
                    jugador.isIsListo());
            jugadoresDTO.add(jugadorDTO);
        }
        return jugadoresDTO;
    }

}
