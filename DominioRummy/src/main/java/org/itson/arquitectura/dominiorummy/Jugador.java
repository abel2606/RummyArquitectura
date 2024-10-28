package org.itson.arquitectura.dominiorummy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Representa un jugador que juega en una partida.
 * 
 * @author Equipo4
 */
public class Jugador {
    
    /**
     * Si el jugador está listo para iniciar la partida o no.
     */
    private boolean estado;
    
    /**
     * El nombre del jugador.
     */
    private String nombre;
    
    /**
     * El avatar del jugador.
     */
    private String rutaAvatar;
    
    /**
     * El turno en el que juega.
     */
    private Turno turno;
    
    /**
     * Los colores que seleccionó el jugador para las fichas.
     */
    private List<Color> colores;
    
    /**
     * Las fichas que puede usar el jugador.
     */
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
     * Permite obtener los colores de las fichas que ve el jugador.
     *
     * @return Los colores de las fichas
     */
    public List<Color> getColores() {
        return colores;
    }

    /**
     * Permite establecer los colores de las fichas que verá el jugador.
     *
     * @param colores Los colores de las fichas
     */
    public void setColores(List<Color> colores) {
        this.colores = colores;
    }

    /**
     * Permite establecer el turno del jugador.
     *
     * @param turno El turno del jugador
     */
    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    /**
     * {@inheritDoc} 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    /**
     * {@inheritDoc} 
     */
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
