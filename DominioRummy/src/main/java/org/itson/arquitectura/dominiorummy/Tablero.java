package org.itson.arquitectura.dominiorummy;

import java.util.LinkedList;
import java.util.List;

/**
 * Representa el tablero donde se colocan las fichas.
 *
 * @author Equipo4
 */
public class Tablero {

    /**
     * Los grupos de fichas que hay en el tablero.
     */
    private List<GrupoFichas> gruposFichas;

    /**
     * Constructor.
     */
    public Tablero() {
        gruposFichas = new LinkedList<>();
    }

    /**
     * Permite agregar una ficha a un grupo de fichas.
     *
     * @param ficha La ficha a agregar
     * @param grupoFichas El grupo al que se quiere agregar la ficha
     * @return true si se pudo agregar la ficha, false en caso contrario
     */
    public boolean agregarFicha(Ficha ficha, GrupoFichas grupoFichas) {
        GrupoFichas grupoFichasTablero = gruposFichas.get(gruposFichas.indexOf(grupoFichas));
        return grupoFichasTablero.agregarFicha(ficha);
    }

}
