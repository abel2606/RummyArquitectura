/*
 * CrearPartida.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.PartidaDTO;

/**
 * Clase que representa la petición de crear partida.
 *
 * @author Equipo4
 */
public class CrearPartida extends PeticionCliente implements Serializable {

    /**
     * Constructor que recibe la partida creada.
     *
     * @param partida La partida creada
     */
    public CrearPartida() {
        super.tipoPeticion = "CREAR_PARTIDA";
    }

}
