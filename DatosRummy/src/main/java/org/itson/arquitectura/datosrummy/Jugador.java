package org.itson.arquitectura.datosrummy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * @author Equipo4
 */
public class Jugador {

    private int puntuacion;
    private boolean estado;
    private String nombre;
    private String rutaAvatar;
    private Turno turno;
    private List<Color> colores;
    private List<Ficha> manoFichas;

    /**
     * Constructor que recibe el nombre del jugador y la ruta donde se encuentra
     * su avatar.
     *
     * @param nombre
     * @param rutaAvatar
     */
    public Jugador(String nombre, String rutaAvatar) {
        this.nombre = nombre;
        this.rutaAvatar = rutaAvatar;
        colores = new ArrayList<>();
        manoFichas = new ArrayList<>();
    }

    /**
     * Agrega una ficha a la mano del jugador
     *
     * @param ficha ficha a agregar
     */
    public void agregarFicha(Ficha ficha) {
        manoFichas.add(ficha);
    }

    public Ficha obtenerFicha() {
        Random random = new Random();
        return manoFichas.remove(random.nextInt(manoFichas.size()));
    }

    /**
     * Obtiene la lista de la mano del jugador
     *
     * @return regresa la mano de fichas del jugador
     */
    public List<Ficha> getManoFichas() {
        return manoFichas;
    }

    /**
     * Establece la mano de fichas del jugador
     *
     * @param fichas mano de fichas a establecer
     */
    public void setManoFichas(List<Ficha> fichas) {
        manoFichas = fichas;
    }

    /**
     * Obtiene los colores del jugador
     *
     * @return valor de los colores del jugador
     */
    public List<Color> getColores() {
        return colores;
    }

    /**
     * Establece los colores del jugadores
     *
     * @param colores valor de los colores
     */
    public void setColores(List<Color> colores) {
        this.colores = colores;
    }

    /**
     * Esetablece un turno al jugador
     *
     * @param turno valor del turno a establecer
     */
    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

}
