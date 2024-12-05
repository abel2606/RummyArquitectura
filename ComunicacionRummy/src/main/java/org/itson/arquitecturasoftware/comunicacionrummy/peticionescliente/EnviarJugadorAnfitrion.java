/*
 * EnviarJugadorAnfitrion.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 * Clase que representa la petición de enviar jugador al anfitrión. Esta
 * petición se usa cuando un jugador que se unió a la partida se termina de
 * configurar y necesita enviar su información al anfitrión.
 *
 * @author Equipo4
 */
public class EnviarJugadorAnfitrion extends PeticionCliente implements Serializable {

    private JugadorDTO jugador;

    /**
     * Constructor que recibe la información del jugador.
     *
     * @param jugador El jugador
     */
    public EnviarJugadorAnfitrion(JugadorDTO jugador) {
        this.tipoPeticion = "ENVIAR_JUGADOR_ANFITRION";
        this.jugador = jugador;
    }

    /**
     * Permite obtener el jugador con su información.
     *
     * @return El jugador
     */
    public JugadorDTO getJugador() {
        return jugador;
    }

}
