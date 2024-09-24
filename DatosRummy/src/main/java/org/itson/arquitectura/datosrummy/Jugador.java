package org.itson.arquitectura.datosrummy;

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
//    private Turno turno;
//    private boolean estado;
    private List<Ficha> manoFichas;

    public Jugador() {
    }
    
    public void agregarFicha(Ficha ficha){
        manoFichas.add(ficha);
    }
}
