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

    public String getTipoPeticion() {
        return tipoPeticion;
    }

}
