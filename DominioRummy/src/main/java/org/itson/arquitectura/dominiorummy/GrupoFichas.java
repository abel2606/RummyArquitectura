package org.itson.arquitectura.dominiorummy;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un grupo de fichas de al menos 3 fichas.
 *
 * @author Equipo4
 */
public class GrupoFichas {

    /**
     * Las fichas del grupo.
     */
    protected List<Ficha> fichas;

    /**
     * Constructor.
     */
    public GrupoFichas() {
        fichas = new ArrayList<>();
    }

    /**
     * Permite obtener las fichas del grupo.
     *
     * @return Las fichas del grupo
     */
    public List<Ficha> getFichas() {
        return fichas;
    }

    /**
     * Permite establecer las fichas del grupo.
     *
     * @param fichas Las fichas del grupo
     */
    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    /**
     * Permite agregar una ficha al grupo.
     *
     * @param ficha La ficha a agregar
     * @return true si se agregó la ficha, false en caso contrario.
     */
    public boolean agregarFicha(Ficha ficha) {
        fichas.add(ficha);
        return true;
    }

}
