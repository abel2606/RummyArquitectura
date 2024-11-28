/*
 * TerminarPartida.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 * Clase que representa la petición de terminar la partida.
 *
 * @author Equipo4
 */
public class TerminarPartida extends PeticionCliente implements Serializable {

    private PartidaDTO partida;

    /**
     * Constructor que recibe la partida terminada.
     *
     * @param partida La partida terminada
     */
    public TerminarPartida(PartidaDTO partida) {
        super.tipoPeticion = "TerminarPartida";
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
