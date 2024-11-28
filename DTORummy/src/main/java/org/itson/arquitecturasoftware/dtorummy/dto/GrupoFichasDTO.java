/*
 * GrupoFichasDTO.java
 */
package org.itson.arquitecturasoftware.dtorummy.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Clase que representa las grupos de fichas que se pueden colocar en el tablero
 * de la partida.
 *
 * @author Equipo4
 */
public class GrupoFichasDTO implements Serializable {

    private List<FichaDTO> fichas;

    /**
     * Constructor que permite crear un grupo de fichas.
     *
     * @param fichas Las fichas del grupo
     */
    public GrupoFichasDTO(List<FichaDTO> fichas) {
        this.fichas = fichas;
    }

    /**
     * Permite obtener las fichas del grupo.
     *
     * @return Las fichas del grupo
     */
    public List<FichaDTO> getFichas() {
        return fichas;
    }

}
