/*
 * ModeloConfigurarPartida.java
 */
package configurarPartidaMVC;

import java.util.ArrayList;
import java.util.List;
import org.itson.arquitecturasoftware.manejadorRespuestas.IOyenteManejadorRespuestas;
import org.itson.arquitectura.aplicacionrummy.servicios.AplicacionFachada;
import org.itson.arquitectura.aplicacionrummy.servicios.IAplicacionFachada;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.Partida;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.manejadorRespuestas.IManejadorRespuestas;
import org.itson.arquitecturasoftware.manejadorRespuestas.ManejadorRespuestas;

/**
 * @author Equipo4
 */
public class ModeloConfigurarPartida implements IOyenteManejadorRespuestas, IModeloConfigurarPartida {

    private static ModeloConfigurarPartida modelo;
    private IPantallaConfigurarPartida vista;

    private ManejadorRespuestas manejador;
    private Boolean isPartidaCreada;
    private IPartida partida;

    private ModeloConfigurarPartida() {
    }

    public void crearParametrosMVC() {
        manejador = ManejadorRespuestas.getInstance();
        vista = PantallaConfigurarPartida.getInstance();
    }

    public void notificar() {
        vista.update(this);
    }

    public void crearPartida(int rangoFichas, int cantidadComodines) {
        partida = Partida.getInstance();
        partida.setNumeroComodines(cantidadComodines);
        partida.setRangoFichas(rangoFichas);

        IAplicacionFachada aplicacionFachada = new AplicacionFachada();
        aplicacionFachada.configurarPartida(partida);
    }
    
    public void suscribirseManejador() {
        manejador.subscribe(this);
    }

    public static ModeloConfigurarPartida getInstance() {
        if (modelo == null) {
            modelo = new ModeloConfigurarPartida();
        }
        return modelo;
    }

    @Override
    public void update(IManejadorRespuestas contexto) {
        this.isPartidaCreada = contexto.isPartidaCreada();
        notificar();
    }

    @Override
    public Boolean isPartidaCreada() {
        return this.isPartidaCreada;
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
