package org.itson.arquitectura.datosrummy;

import java.util.List;

/**
 *
 * @author Abe
 */
public class GrupoFichas {

    private List<Ficha> fichas;

    /**
     * Regresa una lista de fichas
     * @return lista de fichas
     */
    public List<Ficha> getFichas() {
        return fichas;
    }

    /**
     * Establece el valor de la lista de fichas
     * @param fichas lista de fichas a establecer
     */
    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

}
