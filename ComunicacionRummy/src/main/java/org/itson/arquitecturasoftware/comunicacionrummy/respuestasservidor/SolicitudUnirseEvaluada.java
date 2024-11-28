/*
 * SolicitudUnirseEvaluada.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import java.io.Serializable;

/**
 * Clase que representa la respuesta de solicitud de unirse a partida evaluada.
 *
 * @author Equipo4
 */
public class SolicitudUnirseEvaluada implements Serializable {

    private boolean solicitudEvaluada;

    /**
     * Constructor que recibe la solicitud de unirse a partida evaluada.
     *
     * @param solicitudEvaluada La solicitud evaluada
     */
    public SolicitudUnirseEvaluada(boolean solicitudEvaluada) {
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
