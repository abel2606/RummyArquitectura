/*
 * IniciarPartida.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 * Clase que representa la petición de iniciar la partida.
 *
 * @author Equipo4
 */
public class IniciarPartida extends PeticionCliente implements Serializable {

    private PartidaDTO partida;

    /**
     * Constructor que recibe la partida iniciada.
     *
     * @param partida La partida iniciada
     */
    public IniciarPartida(PartidaDTO partida) {
        super.tipoPeticion = "IniciarPartida";
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
