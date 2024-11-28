/*
 * SolicitudInicioEvaluada.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;

/**
 * Clase que representa la petición de solicitud de inicio de partida evaluada.
 *
 * @author Equipo4
 */
public class SolicitudInicioEvaluada extends PeticionCliente implements Serializable {

    private boolean solicitudEvaluada;

    /**
     * Constructor que recibe la evaluación de la solicitud de iniciar la
     * partida.
     *
     * @param solicitudEvaluada La solicitud evaluada
     */
    public SolicitudInicioEvaluada(boolean solicitudEvaluada) {
        super.tipoPeticion = "SolicitudInicioEvaluada";
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
