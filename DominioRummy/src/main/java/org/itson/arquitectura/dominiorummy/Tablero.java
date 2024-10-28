package org.itson.arquitectura.dominiorummy;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Equipo4
 */
public class Tablero {
    
    private List<GrupoFichas> gruposFichas;
    
    public Tablero() {
        gruposFichas = new LinkedList<>();
    }
    
    public boolean agregarFicha(Ficha ficha, GrupoFichas grupoFichas) {
        GrupoFichas grupoFichasTablero = gruposFichas.get(gruposFichas.indexOf(grupoFichas));
        return grupoFichasTablero.agregarFicha(ficha);
    }

}
