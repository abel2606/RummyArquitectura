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

//    private String ipAnfitrion;
    private PartidaDTO partida;

    /**
     * Constructor que recibe la partida creada.
     *
     * @param partida La partida creada
     */
    public CrearPartida(PartidaDTO partida) {
        super.tipoPeticion = "CREAR_PARTIDA";
        this.partida = partida;
    }

//    /**
//     * Permite obtener la dirección IP del anfitrión de la partida.
//     *
//     * @return La dirección IP del anfitrión
//     */
//    public String getIpAnfitrion() {
//        return ipAnfitrion;
//    }
//
//    /**
//     * Permite establecer la dirección IP del anfitrión de la partida.
//     *
//     * @param ipAnfitrion La dirección IP del anfitrión
//     */
//    public void setIpAnfitrion(String ipAnfitrion) {
//        this.ipAnfitrion = ipAnfitrion;
//    }

    /**
     * Permite obtener la partida.
     *
     * @return La partida
     */
    public PartidaDTO getPartida() {
        return partida;
    }

}
