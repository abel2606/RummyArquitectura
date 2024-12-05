/*
 * VerificarPartidaCreada.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;

/**
 * Clase que representa la petición de verificar si hay una partida creada. Se
 * usa cuando un jugador quiere crear una partida y el sistema necesita revisar
 * si hay una partida creada por otro jugador.
 *
 * @author Equipo4
 */
public class VerificarPartidaCreada extends PeticionCliente implements Serializable {

    /**
     * Constructor.
     */
    public VerificarPartidaCreada() {
        this.tipoPeticion = "VERIFICAR_PARTIDA_CREADA";
    }

}
