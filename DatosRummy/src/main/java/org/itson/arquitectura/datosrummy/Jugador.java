package org.itson.arquitectura.datosrummy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abe
 */
public class Jugador {

    private String nombre;
    private List<Color> colores;
//    private int puntuacion;
    private String avatar;
    private Turno turno;
//    private boolean estado;
    private List<Ficha> manoFichas;

    /**
     *  Constructor sin parametros de jugador
     */
    public Jugador() {
        manoFichas = new ArrayList<>();
    }

    /**
     * Agrega una ficha a la mano del jugador
     * @param ficha ficha a agregar
     */
    public void agregarFicha(Ficha ficha) {
        manoFichas.add(ficha);
    }

    /**
     * Obtiene la lista de la mano del jugador
     * @return regresa la mano de fichas del jugador
     */
    public List<Ficha> getManoFichas() {
        return manoFichas;
    }

    /**
     * Establece la mano de fichas del jugador
     * @param fichas mano de fichas a establecer
     */
    public void setManoFichas(List<Ficha> fichas) {
        manoFichas = fichas;
    }

    /**
     * Obtiene los colores del jugador
     * @return valor de los colores del jugador
     */
    public List<Color> getColores() {
        return colores;
    }

    /**
     * Establece los colores del jugadores
     * @param colores valor de los colores
     */
    public void setColores(List<Color> colores) {
        this.colores = colores;
    }
    
    /**
     * Esetablece un turno al jugador
      * @param turn valor del turno a establecer
     */
    public void setTurno(Turno turno){
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
