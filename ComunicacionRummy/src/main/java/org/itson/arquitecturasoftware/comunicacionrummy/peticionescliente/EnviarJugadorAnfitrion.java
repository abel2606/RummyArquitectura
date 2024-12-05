package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 *
 * @author Diego Valenzuela Parra
 */
public class EnviarJugadorAnfitrion extends PeticionCliente {

    private JugadorDTO jugador;

    public EnviarJugadorAnfitrion(JugadorDTO jugador) {
        super.tipoPeticion = "ENVIAR_JUGADOR_ANFITRION";
        this.jugador = jugador;
    }
}
