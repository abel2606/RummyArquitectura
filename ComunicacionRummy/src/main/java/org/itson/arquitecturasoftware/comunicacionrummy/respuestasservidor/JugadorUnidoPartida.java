package org.itson.arquitecturasoftware.comunicacionrummy.respuestasservidor;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 *
 * @author Equipo4
 */
public class JugadorUnidoPartida implements Serializable {
    
    private JugadorDTO jugador;

    public JugadorUnidoPartida(JugadorDTO jugador) {
        this.jugador = jugador;
    }

    public JugadorDTO getJugador() {
        return jugador;
    }
    
}
