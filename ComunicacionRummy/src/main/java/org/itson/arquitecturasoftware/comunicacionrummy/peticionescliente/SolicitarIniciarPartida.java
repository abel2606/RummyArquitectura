/*
 * SolicitarIniciarPartida.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;

/**
 * Clase que representa la petición de solicitar iniciar la partida.
 *
 * @author Equipo4
 */
public class SolicitarIniciarPartida extends PeticionCliente implements Serializable {

    /**
     * Constructor vacío.
     */
    public SolicitarIniciarPartida() {
        super.tipoPeticion = "SolicitarIniciarPartida";
    }

}
