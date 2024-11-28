/*
 * TableroDTO.java
 */
package org.itson.arquitecturasoftware.dtorummy.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Clase que se usa para transmitir los cambios hechos al tablero de la partida.
 *
 * @author Equipo4
 */
public class TableroDTO implements Serializable {

    private List<GrupoFichasDTO> gruposFichas;

    /**
     * Constructor que recibe los grupos de fichas presentes en la partida.
     *
     * @param gruposFichas Los grupos de fichas presentes en la partida
     */
    public TableroDTO(List<GrupoFichasDTO> gruposFichas) {
        this.gruposFichas = gruposFichas;
    }

    /**
     * Permite obtener los grupos de fichas.
     *
     * @return Los grupos de fichas
     */
    public List<GrupoFichasDTO> getGruposFichas() {
        return gruposFichas;
    }

}
