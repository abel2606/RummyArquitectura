/*
 * TurnoTerminado.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 * Clase que representa la respuesta de turno terminado.
 *
 * @author Equipo4
 */
public class TurnoTerminado implements Serializable {

    private PartidaDTO partida;

    /**
     * Constructor que recibe la partida después de que un jugador terminó su
     * turno.
     *
     * @param partida La partida que modificó un jugador
     */
    public TurnoTerminado(PartidaDTO partida) {
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
