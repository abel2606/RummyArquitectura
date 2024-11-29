package manejadorRespuestas;

import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.JugadorUnidoPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaCreada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaIniciada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.PartidaTerminada;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudIniciarPartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.SolicitudUnirsePartida;
import org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor.TurnoTerminado;

/**
 *
 * @author Equipo4
 */
public class ManejadorRespuestas {
    
    private IOyenteManejadorRespuestas manejadorRespuestas;

    public ManejadorRespuestas(IOyenteManejadorRespuestas manejadorRespuestas) {
        this.manejadorRespuestas = manejadorRespuestas;
    }
    
    public void subscribe(IOyenteManejadorRespuestas manejadorRespuestas){
        
    }
    
    public void unsubscribe(IOyenteManejadorRespuestas manejadorRespuestas){
        
    }
    
    public void manejarSolicitudUnirsePartida(SolicitudUnirsePartida solicitud){
        
    }
    
    public void manejarSolicitudIniciarPartida(SolicitudIniciarPartida solicitud){
        
    }
    
    public void manejarJugadorUnidoPartida(JugadorUnidoPartida jugador){
        
    }
    
    public void manejarPartidaCreada(PartidaCreada partidaCreada){
        
    }
    
    public void manejarPartidaIniciada(PartidaIniciada partidaIniciada){
        
    }
    
    public void manejarTurnoTerminado(TurnoTerminado turnoTerminado){
        
    }
    
    public void manejarPartidaTerminada(PartidaTerminada partidaTerminada){
        
    }
    
    public void manejarSolicitudUnirseEvaluada(){
        
    }
    
    public void notificar(){
        
    }
    
}
