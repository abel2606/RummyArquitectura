package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import java.io.Serializable;

/**
 *
 * @author Equipo4
 */
public class PartidaCreada implements Serializable {

    private boolean partidaCreada;

    public PartidaCreada(boolean partidaCreada) {
        this.partidaCreada = partidaCreada;
    }

    public boolean isPartidaCreada() {
        return partidaCreada;
    }

}
