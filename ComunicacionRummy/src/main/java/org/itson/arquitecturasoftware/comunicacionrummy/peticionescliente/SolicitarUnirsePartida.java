/*
 * SolicitarUnirsePartida.java
 */
package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

import java.io.Serializable;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 * Clase que representa la petición de solicitar unirse a la partida.
 *
 * @author Equipo4
 */
public class SolicitarUnirsePartida extends PeticionCliente implements Serializable {

    private JugadorDTO jugador;

    /**
     * Constructor que recibe el jugador que solicita unirse a la partida.
     *
     * @param jugador El jugador que solicita unirse a la partida
     */
    public SolicitarUnirsePartida(JugadorDTO jugador) {
        super.tipoPeticion = "SolicitarUniserPartida";
        this.jugador = jugador;
    }

    /**
     * Permite obtener el jugador.
     *
     * @return El jugador
     */
    public JugadorDTO getJugador() {
        return jugador;
    }

}
