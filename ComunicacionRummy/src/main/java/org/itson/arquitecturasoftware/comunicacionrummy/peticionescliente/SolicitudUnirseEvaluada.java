/*
 * SolicitudUnirseEvaluada.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;

/**
 * Clase que representa la petición de solicitud de unirse evaluada.
 *
 * @author Equipo4
 */
public class SolicitudUnirseEvaluada extends PeticionCliente implements Serializable {

    private boolean solicitudEvaluada;

    /**
     * Constructor que recibe la evaluación de la solicitud de unirse a la
     * partida.
     *
     * @param solicitudEvaluada La solicitud evaluada.
     */
    public SolicitudUnirseEvaluada(boolean solicitudEvaluada) {
        super.tipoPeticion = "SolicitudUnirseEvaluada";
        this.solicitudEvaluada = solicitudEvaluada;
    }

    /**
     * Permite obtener la solicitud evaluada.
     *
     * @return true si la solicitud fue aceptada, false en caso contrario
     */
    public boolean isSolicitudEvaluada() {
        return solicitudEvaluada;
    }

}
