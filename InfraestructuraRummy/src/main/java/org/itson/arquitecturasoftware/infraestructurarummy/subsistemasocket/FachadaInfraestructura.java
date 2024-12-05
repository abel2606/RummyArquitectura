 /*
 * InfraestructuraFachada.java
 */
package org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket;

import java.io.IOException;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;

/**
 * Clase que permite conectarse con la infraestructura para comunicarse con el
 * servidor.
 *
 * @author Equipo4
 */
public class FachadaInfraestructura implements IFachadaInfraestructura {

    private ClienteSocket clienteSocket;
    private CreadorPeticiones creadorPeticiones = new CreadorPeticiones();

    /**
     * Constructor.
     */
    public FachadaInfraestructura() {
        clienteSocket = ClienteSocket.getInstance();
        creadorPeticiones = new CreadorPeticiones();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void solicitarInicioPartida(JugadorDTO jugador) throws InfraestructuraException {
        try {
            clienteSocket.enviarPeticion(creadorPeticiones.crearPeticionSolicitarIniciarPartida(jugador));
        } catch (IOException ex) {
            throw new InfraestructuraException("Hubo un error al enviar la petición de solicitar inicio partida");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void solicitarUnirsePartida() throws InfraestructuraException {
        try {
            clienteSocket.enviarPeticion(creadorPeticiones.crearPeticionSolicitarUnirsePartida());
        } catch (IOException ex) {
            throw new InfraestructuraException("Hubo un error al enviar la petición de solicitar unirse partida");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void evaluarSolicitudUnirsePartida(boolean solicitudEvaluada) throws InfraestructuraException {
        try {
            clienteSocket.enviarPeticion(creadorPeticiones.crearPeticionSolicitudUnirseEvaluada(solicitudEvaluada));
        } catch (IOException ex) {
            throw new InfraestructuraException("Hubo un error al enviar la petición de solicitud unirse evaluada");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void iniciarPartida(PartidaDTO partida) throws InfraestructuraException {
        try {
            clienteSocket.enviarPeticion(creadorPeticiones.crearPeticionIniciarPartida(partida));
        } catch (IOException ex) {
            throw new InfraestructuraException("Hubo un error al enviar la petición de iniciar partida");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void crearPartida() throws InfraestructuraException {
        try {
            clienteSocket.enviarPeticion(creadorPeticiones.crearPeticionCrearPartida());
        } catch (IOException ex) {
            throw new InfraestructuraException("Hubo un error al enviar la petición de crear partida");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void terminarTurno(PartidaDTO partida) throws InfraestructuraException {
        try {
            clienteSocket.enviarPeticion(creadorPeticiones.crearPeticionTerminarTurno(partida));
        } catch (IOException ex) {
            throw new InfraestructuraException("Hubo un error al enviar la petición de terminar turno");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void terminarPartida(PartidaDTO partida) throws InfraestructuraException {
        try {
            clienteSocket.enviarPeticion(creadorPeticiones.crearPeticionTerminarTurno(partida));
        } catch (IOException ex) {
            throw new InfraestructuraException("Hubo un error al enviar la petición de terminar partida");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void verificarPartidaCreada() throws InfraestructuraException {
        try {
            clienteSocket.enviarPeticion(creadorPeticiones.verificarPartidaCreada());
        } catch (IOException ex) {
            throw new InfraestructuraException("Hubo un error al enviar la petición de terminar partida");
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void enviarJugadorAnfitrion(JugadorDTO jugador) throws InfraestructuraException {
        try {
            clienteSocket.enviarPeticion(creadorPeticiones.enviarJugadorAnfitrion(jugador));
        } catch (IOException ex) {
            throw new InfraestructuraException("Hubo un error al enviar la petición de terminar partida");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void establecerConexion() {
        clienteSocket.establecerConexionServidor();
    }
}
