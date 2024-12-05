/*
 * CreadorPeticiones.java
 */
package org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket;

import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.CrearPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.EnviarJugadorAnfitrion;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.IniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.PeticionCliente;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.SolicitarIniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.SolicitarUnirsePartida;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.EvaluarSolicitud;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.TerminarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.TerminarTurno;
import org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente.VerificarPartidaCreada;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 * Clase que se usa para crear las diferentes peticiones que le puede hacer un
 * cliente al servidor.
 *
 * @author Equipo4
 */
public class CreadorPeticiones {

    /**
     * Permite crear la petición de solicitar inicio de la partida.
     *
     * @param jugador Jugadoe que está solicitando iniciar la partida.
     * @return La petición de solicitar inicio de partida
     *
     */
    public PeticionCliente crearPeticionSolicitarIniciarPartida(JugadorDTO jugador) {
        return new SolicitarIniciarPartida(jugador);
    }

    /**
     * Permite crear la petición de solicitar unirse a la partida.
     *
     * @return La petición de solicitar unirse a la partida
     */
    public PeticionCliente crearPeticionSolicitarUnirsePartida() {
        return new SolicitarUnirsePartida();
    }

    /**
     * Permite crear la petición de solicitud evaluada de unirse a la partida.
     *
     * @param solicitudEvaluada la solicitud evaluada
     * @return La petición de solicitud evaluada de unirse a la partida
     */
    public PeticionCliente crearPeticionSolicitudUnirseEvaluada(boolean solicitudEvaluada) {
        return new EvaluarSolicitud(solicitudEvaluada);
    }

    /**
     * Permite crear la petición de iniciar partida.
     *
     * @param partida La partida iniciada
     * @return La petición de iniciar partida
     */
    public PeticionCliente crearPeticionIniciarPartida(PartidaDTO partida) {
        return new IniciarPartida(partida);
    }

    /**
     * Permite crear la petición de crear partida.
     *
     * @return La petición de crear partida
     */
    public PeticionCliente crearPeticionCrearPartida() {
        return new CrearPartida();
    }

    /**
     * Permite crear la petición de terminar turno.
     *
     * @param partida La partida modificada por el jugador que termina su turno
     * @return La petición de terminar turno
     */
    public PeticionCliente crearPeticionTerminarTurno(PartidaDTO partida) {
        return new TerminarTurno(partida);
    }

    /**
     * Permite crear la petición de terminar partida.
     *
     * @param partida La partida terminada
     * @return La petición de partida terminda
     */
    public PeticionCliente crearPeticionTerminarPartida(PartidaDTO partida) {
        return new TerminarPartida(partida);
    }

    PeticionCliente verificarPartidaCreada() {
        return new VerificarPartidaCreada();
    }

    PeticionCliente enviarJugadorAnfitrion(JugadorDTO jugador) {
        return new EnviarJugadorAnfitrion(jugador);
    }

}
