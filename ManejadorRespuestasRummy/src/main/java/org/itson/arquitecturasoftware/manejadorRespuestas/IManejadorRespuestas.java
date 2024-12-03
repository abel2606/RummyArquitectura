/*
 * IManejadorRespuesta
 */
package org.itson.arquitecturasoftware.manejadorRespuestas;

import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 * @author Equipo4
 */
public interface IManejadorRespuestas {
    
    public PartidaDTO getPartida();
    
    public JugadorDTO getJugador();
    
    public boolean getSolicitudUnirseEvaluada();
    
}
