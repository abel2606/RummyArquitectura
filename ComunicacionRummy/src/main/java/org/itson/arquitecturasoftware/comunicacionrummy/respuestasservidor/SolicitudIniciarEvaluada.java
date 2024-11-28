/*
 * SolicitudIniciarEvaluada.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import java.io.Serializable;

/**
 * Clase que representa la respuesta de solicitud de iniciar partida evaluada.
 *
 * @author Equipo4
 */
public class SolicitudIniciarEvaluada implements Serializable {

    private boolean solicitudEvaluada;

    /**
     * Constructor que recibe la solicitud evaluada de inciar partida.
     *
     * @param solicitudEvaluada La solicitud evaluada
     */
    public SolicitudIniciarEvaluada(boolean solicitudEvaluada) {
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
