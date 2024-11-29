/*
 * SolicitarUnirsePartida.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;

/**
 * Clase que representa la petición de solicitar unirse a la partida.
 *
 * @author Equipo4
 */
public class SolicitarUnirsePartida extends PeticionCliente implements Serializable {

    /**
     * Constructor que recibe el jugador que solicita unirse a la partida.
     *
     */
    public SolicitarUnirsePartida() {
        super.tipoPeticion = "SOLICITAR_UNIRSE_PARTIDA";
    }

}
