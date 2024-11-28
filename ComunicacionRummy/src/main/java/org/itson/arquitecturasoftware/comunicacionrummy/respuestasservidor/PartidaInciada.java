/*
 * PartidaIniciada.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 * Clase que representa la respuesta de partida inciada.
 *
 * @author Equipo4
 */
public class PartidaInciada implements Serializable {

    private PartidaDTO partida;

    /**
     * Constructor que recibe la partida ya iniciada.
     *
     * @param partida La partida iniciada
     */
    public PartidaInciada(PartidaDTO partida) {
        this.partida = partida;
    }

    /**
     * Permite obtener la partida
     *
     * @return La partida
     */
    public PartidaDTO getPartida() {
        return partida;
    }

}
