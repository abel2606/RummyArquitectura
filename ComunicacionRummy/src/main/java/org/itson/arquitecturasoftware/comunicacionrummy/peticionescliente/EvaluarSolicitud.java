/*
 * EvaluarSolicitud.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;

/**
 * Clase que representa la petición de solicitud de unirse evaluada.
 *
 * @author Equipo4
 */
public class EvaluarSolicitud extends PeticionCliente implements Serializable {

    private boolean aceptado;

    /**
     * Constructor que recibe la evaluación de la solicitud de unirse a la
     * partida.
     *
     * @param aceptado Valor que refleja si el jugador fue aceptado en la partida o no.
     */
    public EvaluarSolicitud(boolean aceptado) {
        super.tipoPeticion = "SolicitudUnirseEvaluada";
        this.aceptado = aceptado;
    }

    /**
     * Permite obtener la respuesta del host de si se acepta o rechaza un jugador.
     *
     * @return true si se acepta al jugador, false en caso contrario.
     */
    public boolean isAceptado() {
        return aceptado;
    }

}
