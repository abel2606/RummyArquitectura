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

    private ClienteSocket cliente;
    private CreadorPeticiones creadorPeticiones = new CreadorPeticiones();

    /**
     * Constructor.
     */
    public FachadaInfraestructura() {
        cliente = new ClienteSocket();
        creadorPeticiones = new CreadorPeticiones();
        cliente.establecerConexionServidor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void solicitarInicioPartida(JugadorDTO jugador) throws InfraestructuraException {
        try {
            cliente.enviarPeticion(creadorPeticiones.crearPeticionSolicitarIniciarPartida(jugador));
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
            cliente.enviarPeticion(creadorPeticiones.crearPeticionSolicitarUnirsePartida());
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
            cliente.enviarPeticion(creadorPeticiones.crearPeticionSolicitudUnirseEvaluada(solicitudEvaluada));
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
            cliente.enviarPeticion(creadorPeticiones.crearPeticionIniciarPartida(partida));
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
            cliente.enviarPeticion(creadorPeticiones.crearPeticionCrearPartida());
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
            cliente.enviarPeticion(creadorPeticiones.crearPeticionTerminarTurno(partida));
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
            cliente.enviarPeticion(creadorPeticiones.crearPeticionTerminarTurno(partida));
        } catch (IOException ex) {
            throw new InfraestructuraException("Hubo un error al enviar la petición de terminar partida");
        }
    }

}
