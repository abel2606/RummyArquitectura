/*
 * NumeroDTO.java
 */
package org.itson.arquitecturasoftware.dtorummy.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Clase que permite crear grupos de fichas del mismo número.
 *
 * @author Equipo4
 */
public class NumeroDTO extends GrupoFichasDTO implements Serializable {

    /**
     * Constructor que recibe una lista de fichas del mismo número.
     *
     * @param fichas Las fichas del grupo
     */
    public NumeroDTO(List<FichaDTO> fichas) {
        super(fichas);
    }

}
