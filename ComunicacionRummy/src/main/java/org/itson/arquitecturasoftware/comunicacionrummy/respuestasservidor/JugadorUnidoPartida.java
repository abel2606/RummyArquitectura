package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 *
 * @author Equipo4
 */
public class JugadorUnidoPartida {
    
    private PartidaDTO partida;

    public JugadorUnidoPartida(PartidaDTO partida) {
        this.partida = partida;
    }

    public PartidaDTO getPartida() {
        return partida;
    }
    
}
