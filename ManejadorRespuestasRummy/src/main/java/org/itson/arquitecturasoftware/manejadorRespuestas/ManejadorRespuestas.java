package org.itson.arquitecturasoftware.manejadorRespuestas;

import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.JugadorUnidoPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaIniciada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaTerminada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudIniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirseEvaluada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirsePartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.TurnoTerminado;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.VerificacionPartidaCreada;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 * @author Equipo4
 */
public class ManejadorRespuestas implements IManejadorRespuestas {

    private static ManejadorRespuestas manejador;
    private IOyenteManejadorRespuestas oyente;
    private PartidaDTO partida;
    private JugadorDTO jugador;
    private boolean solicitudUnirseEvaluada;
    private boolean isPartidaCreada;
    

    private ManejadorRespuestas() {
    }

    public void subscribe(IOyenteManejadorRespuestas oyente) {
        this.oyente = oyente;
    }

    public void manejarSolicitudUnirsePartida(SolicitudUnirsePartida solicitud) {

    }

    public void manejarSolicitudIniciarPartida(SolicitudIniciarPartida solicitud) {

    }

    public void manejarJugadorUnidoPartida(JugadorUnidoPartida jugador) {

    }

    public void manejarPartidaIniciada(PartidaIniciada partidaIniciada) {
        this.partida = partidaIniciada.getPartida();
        notificar();
        
    }

    public void manejarTurnoTerminado(TurnoTerminado turnoTerminado) {

    }

    public void manejarPartidaTerminada(PartidaTerminada partidaTerminada) {

    }

    public void manejarSolicitudUnirseEvaluada(SolicitudUnirseEvaluada peticion) {
        this.solicitudUnirseEvaluada = peticion.isSolicitudEvaluada();
        notificar();
    }
    
    public void manejarVerificacionPartidaCreada(VerificacionPartidaCreada verificacion) {
        this.isPartidaCreada = verificacion.isPartidaCreada();
        notificar();
    }

    public void notificar() {
        oyente.update(this);
    }

    @Override
    public PartidaDTO getPartida() {
        return partida;
    }

    @Override
    public JugadorDTO getJugador() {
        return jugador;
    }

    @Override
    public boolean getSolicitudUnirseEvaluada() {
        return solicitudUnirseEvaluada;
    }

    @Override
    public boolean isPartidaCreada() {
        return this.isPartidaCreada;
    }

    public static ManejadorRespuestas getInstance() {
        if (manejador == null) {
            manejador = new ManejadorRespuestas();
        }
        return manejador;
    }
}
