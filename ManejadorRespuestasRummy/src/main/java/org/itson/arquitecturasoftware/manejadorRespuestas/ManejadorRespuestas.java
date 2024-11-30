package org.itson.arquitecturasoftware.manejadorRespuestas;

import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.JugadorUnidoPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaCreada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaIniciada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaTerminada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudIniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirseEvaluada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirsePartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.TurnoTerminado;

/**
 *
 * @author Equipo4
 */
public class ManejadorRespuestas {

    private static ManejadorRespuestas instance;
    private IOyenteManejadorRespuestas oyente;

    private ManejadorRespuestas() {
        
    }
    
    public static ManejadorRespuestas getInstance() {
        if (instance == null) {
            instance = new ManejadorRespuestas();
        }
        return instance;
    }
    
    public void subscribe(IOyenteManejadorRespuestas oyente) {
        this.oyente = oyente;
    }

    public void unsubscribe(IOyenteManejadorRespuestas oyente) {

    }

    public void manejarSolicitudUnirsePartida(SolicitudUnirsePartida solicitud) {

    }

    public void manejarSolicitudIniciarPartida(SolicitudIniciarPartida solicitud) {

    }

    public void manejarJugadorUnidoPartida(JugadorUnidoPartida jugador) {

    }

    public void manejarPartidaCreada(PartidaCreada partidaCreada) {
        notificar();
    }

    public void manejarPartidaIniciada(PartidaIniciada partidaIniciada) {

    }

    public void manejarTurnoTerminado(TurnoTerminado turnoTerminado) {

    }

    public void manejarPartidaTerminada(PartidaTerminada partidaTerminada) {

    }

    public void manejarSolicitudUnirseEvaluada(SolicitudUnirseEvaluada peticion) {

    }

    public void notificar() {
        oyente.update();
    }

}
