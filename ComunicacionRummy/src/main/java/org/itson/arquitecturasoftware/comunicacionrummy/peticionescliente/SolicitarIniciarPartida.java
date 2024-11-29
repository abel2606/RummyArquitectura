/*
 * SolicitarIniciarPartida.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 * Clase que representa la petición de solicitar iniciar la partida.
 *
 * @author Equipo4
 */
public class SolicitarIniciarPartida extends PeticionCliente implements Serializable {

    private JugadorDTO jugador;

    /**
     * Constructor vacío.
     */
    public SolicitarIniciarPartida(JugadorDTO jugador) {
        super.tipoPeticion = "SolicitarIniciarPartida";
        this.jugador = jugador;
    }

    /**
     * Permite obtener el jugador que está solicitando que inicie la partida.
     *
     * @return El jugador.
     */
    public JugadorDTO getJugador() {
        return jugador;
    }

}
