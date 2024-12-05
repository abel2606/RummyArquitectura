/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaEsperaMVC;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.manejadorRespuestas.IOyenteManejadorRespuestas;
import org.itson.arquitectura.aplicacionrummy.servicios.AplicacionFachada;
import org.itson.arquitectura.aplicacionrummy.servicios.IAplicacionFachada;
import org.itson.arquitectura.dominiorummy.IJugador;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.Partida;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaInfraestructura;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.IFachadaInfraestructura;
import org.itson.arquitecturasoftware.manejadorRespuestas.IManejadorRespuestas;
import org.itson.arquitecturasoftware.manejadorRespuestas.ManejadorRespuestas;

/**
 *
 * @author Abe
 */
public class ModeloSalaEspera implements IModeloSalaEspera, IOyenteManejadorRespuestas {

    private static ModeloSalaEspera instance;
    private IPantallaSalaEspera pantallaSalaEspera;
    private boolean haySolicitudUnirse;
    private IFachadaInfraestructura infraestructura = new FachadaInfraestructura();
    private IAplicacionFachada aplicacionFachada = new AplicacionFachada();
    private IPartida partida = Partida.getInstance();
    private List<JugadorDTO> jugadores = new ArrayList<>();
    private JugadorDTO jugador;
    private String error;
    private ManejadorRespuestas manejador;
    
    // Constructor privado para evitar la creación directa de objetos
    private ModeloSalaEspera()  {
    }

    public void asignarNombreAvatarJugador(String nombre, String avatar) {
        jugador = new JugadorDTO(nombre, avatar, false);
    }

    /**
     * Método para convertir la lista de jugadores entidad a DTO.
     *
     * @param jugadores Lista de jugadores entidad.
     * @return La lista de jugadores ya convertidos a DTO.
     */
    private List<JugadorDTO> convertirJugadoresADTO(List<Jugador> jugadoresEntidad) {
        List<JugadorDTO> jugadoresActualizados = new ArrayList<>();
        for (Jugador jugadorEntidad : jugadoresEntidad) {
            JugadorDTO jugadorDTO = new JugadorDTO(
                    jugadorEntidad.getNombre(),
                    jugadorEntidad.getAvatar(),
                    jugadorEntidad.isIsListo());
            jugadoresActualizados.add(jugadorDTO);
        }
        return jugadoresActualizados;
    }

    public void solicitarIniciarPartida(JugadorDTO jugadorDTO) {
        // Crear una nueva instancia con el estado actualizado
        JugadorDTO nuevoJugadorDTO = new JugadorDTO(
                jugadorDTO.getNombre(),
                jugadorDTO.getAvatar(),
                !jugadorDTO.isListoParaJugar());

        Jugador jugador = new Jugador(nuevoJugadorDTO.getNombre(), nuevoJugadorDTO.getAvatar());
        jugador.setIsListo(nuevoJugadorDTO.isListoParaJugar());

        jugadorDTO.setListoParaJugar(aplicacionFachada.solicitarIniciarPartida(jugador));
        try {
            infraestructura.solicitarInicioPartida(nuevoJugadorDTO);
        } catch (InfraestructuraException ex) {
            Logger.getLogger(ModeloSalaEspera.class.getName()).log(Level.SEVERE, null, ex);
        }
        notificar();
    }

    public void salirPartida() {

    }

    public void iniciarPartida() {

    }

    public void notificarSolicitudUnirse() {

    }

    public void notificar() {
        pantallaSalaEspera.update(this);
    }

    // Método público para obtener la instancia única
    public static ModeloSalaEspera getInstance() {
        if (instance == null) {
            instance = new ModeloSalaEspera();
        }
        return instance;
    }

    @Override
    public List<JugadorDTO> getJugadores() {
        return convertirJugadoresADTO(aplicacionFachada.obtenerJugadores(partida));
    }

    @Override
    public JugadorDTO getJugador() {
        return jugador;
    }

    @Override
    public boolean getSolicitudUnirse() {
        return haySolicitudUnirse;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public void update(IManejadorRespuestas contexto) {
        if (contexto.getJugador() == null) {
            this.haySolicitudUnirse = true;
        } else {
            JugadorDTO jugadorDTO = contexto.getJugador();
            IJugador nuevoJugador = new Jugador(jugadorDTO.getNombre(), jugadorDTO.getAvatar());
            aplicacionFachada.registrarJugador(nuevoJugador);
            jugadores = convertirJugadoresADTO(aplicacionFachada.obtenerJugadores(partida));
            this.haySolicitudUnirse = false;
        }
        notificar();
    }

    public void crearParametrosMVC() {
        pantallaSalaEspera = PantallaSalaEspera.getInstance();
        manejador = ManejadorRespuestas.getInstance();

    }

    void suscribirse() {
        manejador.subscribe(this);
    }

}
