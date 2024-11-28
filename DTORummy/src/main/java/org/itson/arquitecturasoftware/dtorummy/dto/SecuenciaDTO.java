/*
 * SecuenciaDTO.java
 */
package org.itson.arquitecturasoftware.dtorummy.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Clase que permite crear grupos de fichas en secuencia
 *
 * @author Equipo4
 */
public class SecuenciaDTO extends GrupoFichasDTO implements Serializable {

    /**
     * Constructor que recibe una lista de fichas ordenadas en secuencia.
     *
     * @param fichas Las fichas de la secuencia
     */
    public SecuenciaDTO(List<FichaDTO> fichas) {
        super(fichas);
    }

}
