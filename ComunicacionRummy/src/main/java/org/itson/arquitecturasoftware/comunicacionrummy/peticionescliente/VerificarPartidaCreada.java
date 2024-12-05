package org.itson.arquitecturasoftware.comunicacionrummy.peticionescliente;

/**
 *
 * @author Diego Valenzuela Parra
 */
public class VerificarPartidaCreada extends PeticionCliente {

    /**
     * Constructor que recibe la partida creada.
     */
    public VerificarPartidaCreada() {
        super.tipoPeticion = "VERIFICAR_PARTIDA_CREADA";
    }
}
