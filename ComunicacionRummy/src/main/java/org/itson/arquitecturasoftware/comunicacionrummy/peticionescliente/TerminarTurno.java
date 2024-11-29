/*
 * TerminarTurno.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 * Clase que representa la petición de terminar turno.
 *
 * @author Equipo4
 */
public class TerminarTurno extends PeticionCliente implements Serializable {

    private PartidaDTO partida;

    /**
     * Constructor que recibe la partida en su estado actual después de que un
     * jugador termina su turno.
     *
     * @param partida La partida en su estado actual
     */
    public TerminarTurno(PartidaDTO partida) {
        super.tipoPeticion = "TERMINAR_TURNO";
        this.partida = partida;
    }

    /**
     * Permite obtener la partida actual.
     *
     * @return La partida
     */
    public PartidaDTO getPartida() {
        return partida;
    }

}
