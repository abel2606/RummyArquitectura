package org.itson.arquitectura.datosrummy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abe
 */
public class Jugador {

//    private String nombre;
    private List<Color> colores;
//    private int puntuacion;
//    private String avatar;
    private Turno turno;
//    private boolean estado;
    private List<Ficha> manoFichas;

    public Jugador() {
        manoFichas = new ArrayList<>();
    }

    public void agregarFicha(Ficha ficha) {
        manoFichas.add(ficha);
    }

    public List<Ficha> getManoFichas() {
        return manoFichas;
    }

    public void setManoFichas(List<Ficha> fichas) {
        manoFichas = fichas;
    }

    public List<Color> getColores() {
        return colores;
    }

    public void setColores(List<Color> colores) {
        this.colores = colores;
    }

}
