package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 *
 * @author Equipo4
 */
public class PartidaCreada implements Serializable {

    private PartidaDTO partida;

    public PartidaCreada(PartidaDTO partida) {
        this.partida = partida;
    }

    public PartidaDTO getPartida() {
        return partida;
    }

}
