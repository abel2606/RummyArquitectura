/*
 * PeticionCliente.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;

/**
 * Clase que representa una petición que le hace un cliente al servidor.
 *
 * @author Equipo4
 */
public class PeticionCliente implements Serializable {

    protected String tipoPeticion;

    /**
     * Permite obtener el tipo de la petición.
     *
     * @return El tipo de la petición
     */
    public String getTipoPeticion() {
        return tipoPeticion;
    }

}
