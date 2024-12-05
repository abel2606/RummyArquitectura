/*
 * IInfraestructuraFachada.java
 */
package org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket;

import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;

/**
 * Clase que permite conectarse con la infraestructura para comunicarse con el
 * servidor.
 *
 * @author Equipo4
 */
public interface IFachadaInfraestructura {

    /**
     * Permite enviar la petición de solicitar inicio de partida. Debe usarse
     * cuando lso jgadores que se encuentran en la sala de espera desean iniciar
     * la partida.
     *
     * @param jugador Jugador que está solicitando iniciar la partida.
     * @throws InfraestructuraException Si al sale mal al enviar la petición
     */
    public void solicitarInicioPartida(JugadorDTO jugador) throws InfraestructuraException;

    /**
     * Permite enviar la petición de solicitar unirse a la partida. Debe usarse
     * cuando un jugador nuevo desea unirse a la partida.
     *
     * @throws InfraestructuraException Si al sale mal al enviar la petición
     */
    public void solicitarUnirsePartida() throws InfraestructuraException;

    /**
     * Permite enviar la petición de solicitud de unirse a partida evaluada.
     * Debe usarse cuando el anfitrión de la partida evalua la solicitud de otro
     * jugador de unirse a la partida.
     *
     * @param solicitudEvaluada La evaluación de la solicitud
     * @throws InfraestructuraException Si al sale mal al enviar la petición
     */
    public void evaluarSolicitudUnirsePartida(boolean solicitudEvaluada) throws InfraestructuraException;

    /**
     * Permite enviar la petición de iniciar partida. Debe usarse cuando todos
     * los jugadores aceptaron iniciar la partidao cuando hay 4 jugadores en la
     * sala de espera. Envía la partida con sus configuraciones para que todos
     * puedan empezar a jugar.
     *
     * @param partida La partida iniciada
     * @throws InfraestructuraException Si al sale mal al enviar la petición
     */
    public void iniciarPartida(PartidaDTO partida) throws InfraestructuraException;

    /**
     * Permite enviar la petición de crear partida. Debe usarse cuando un
     * anfitrión configura una partida para que otros jugadores puedan unirse.
     *
     * @throws InfraestructuraException Si al sale mal al enviar la petición
     */
    public void crearPartida() throws InfraestructuraException;

    /**
     * Permite enviar la petición de terminar turno. Debe usarse cuando un
     * jugador ya ejerció su turno y se necesita pasar el turno a otro jugador.
     *
     * @param partida La partida modificada por el jugador
     * @throws InfraestructuraException Si al sale mal al enviar la petición
     */
    public void terminarTurno(PartidaDTO partida) throws InfraestructuraException;

    /**
     * Permite enviar la solicitud de terminar partida. Debe usarse cuando un
     * jugador se quedó sin fichas y se termina la partida.
     *
     * @param partida La partida terminada
     * @throws InfraestructuraException Si al sale mal al enviar la petición
     */
    public void terminarPartida(PartidaDTO partida) throws InfraestructuraException;

    /**
     * Permite enviar una solicitud para verificar si ya hay una partida creada.
     *
     * @throws InfraestructuraException Si al sale mal al enviar la petición
     */
    public void verificarPartidaCreada() throws InfraestructuraException;

    /**
     * Permite enviar un jugador que se quiere unir al host.
     *
     * @param jugador Jugador que se quiere unir a la partida.
     * @throws InfraestructuraException Si al sale mal al enviar la petición
     */
    public void enviarJugadorAnfitrion(JugadorDTO jugador) throws InfraestructuraException;

}
