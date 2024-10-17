package org.itson.arquitectura.datosrummy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abe
 */
public class GrupoFichas {

    protected List<Ficha> fichas;

    public GrupoFichas() {
        fichas = new ArrayList<>();
    }
    
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
    
    public boolean agregarFicha(Ficha ficha) {
        fichas.add(ficha);
        return true;
    }

}
