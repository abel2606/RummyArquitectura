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

    private String ipAnfitrion;
    private PartidaDTO partida;

    /**
     * Constructor que recibe la partida creada y la IP del anfitrion de la
     * partida.
     *
     * @param ipAnfitrion La dirección IP del anfitrión
     * @param partida La partida creada
     */
    public CrearPartida(String ipAnfitrion, PartidaDTO partida) {
        super.tipoPeticion = "CrearPartida";
        this.ipAnfitrion = ipAnfitrion;
        this.partida = partida;
    }

}
