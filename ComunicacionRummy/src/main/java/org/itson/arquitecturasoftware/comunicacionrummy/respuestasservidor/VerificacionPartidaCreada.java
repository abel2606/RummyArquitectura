/*
 * VerificacionPartidaCreada.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import java.io.Serializable;

/**
 * Clase que representa la respuesta del servidor de verificar partida creada.
 * Esta respuesta se usa cuando un jugador solicitó verificar si hay una partida
 * creada y el servidor necesita responder la petición.
 *
 * @author Equipo4
 */
public class VerificacionPartidaCreada implements Serializable {

    private boolean partidaCreada;

    /**
     * Constructor que recibe la información de si hay una partida creada o no.
     *
     * @param partidaCreada Si hay una partida creada o no
     */
    public VerificacionPartidaCreada(boolean partidaCreada) {
        this.partidaCreada = partidaCreada;
    }

    /**
     * Permite conocer si hay una partida creada o no.
     *
     * @return true si hay una partida creada, false en caso contrario.
     */
    public boolean isPartidaCreada() {
        return partidaCreada;
    }

}
