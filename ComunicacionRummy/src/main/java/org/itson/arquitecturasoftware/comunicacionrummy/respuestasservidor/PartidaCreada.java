package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 *
 * @author Equipo4
 */
public class PartidaCreada {
    
    private PartidaDTO partida;

    public PartidaCreada(PartidaDTO partida) {
        this.partida = partida;
    }

    public PartidaDTO getPartida() {
        return partida;
    }
    
    
    
}
