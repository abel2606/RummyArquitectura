package org.itson.arquitectura.dominiorummy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Equipo4
 */
public class GrupoFichas {

    protected List<Ficha> fichas;

    /**
     * Constructor.
     */
    public GrupoFichas() {
        fichas = new ArrayList<>();
    }

    /**
     * Regresa una lista de fichas
     *
     * @return lista de fichas
     */
    public List<Ficha> getFichas() {
        return fichas;
    }

    /**
     * Establece el valor de la lista de fichas
     *
     * @param fichas lista de fichas a establecer
     */
    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    /**
     * Permite agregar una ficha al grupo.
     * @param ficha La ficha a agregar
     * @return true si se agregó la ficha, false en caso contrario.
     */
    public boolean agregarFicha(Ficha ficha) {
        fichas.add(ficha);
        return true;
    }

}
