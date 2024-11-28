/*
 * PartidaTerminada.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 * Clase que representa la respuesta de partida terminada.
 *
 * @author Equipo4
 */
public class PartidaTerminada implements Serializable {

    private PartidaDTO partida;

    /**
     * Constructor que recibe la partida terminada.
     *
     * @param partida La partida terminada
     */
    public PartidaTerminada(PartidaDTO partida) {
        this.partida = partida;
    }

    /**
     * Permite obtener la partida.
     *
     * @return La partida
     */
    public PartidaDTO getPartida() {
        return partida;
    }

}
