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
public class Jugador implements IJugador {

    /**
     * El nombre del jugador.
     */
    private String nombre;

    /**
     * Puntuación del jugador
     */
    private int puntacion;

    /**
     * El avatar del jugador.
     */
    private String avatar;

    /**
     * El turno en el que juega.
     */
    private Turno turno;

    /**
     * Si el jugador está listo para iniciar la partida o no.
     */
    private boolean isListo;

    /**
     * Las fichas que puede usar el jugador.
     */
    private List<Ficha> manoFichas;

    /**
     * Los colores que seleccionó el jugador para las fichas.
     */
    private List<Color> colores;

    public Jugador() {
    }

    /**
     * Constructor que recibe el nombre del jugador y la ruta donde se encuentra
     * su avatar.
     *
     * @param nombre
     * @param avatar
     */
    public Jugador(String nombre, String avatar) {
        this.nombre = nombre;
        this.avatar = avatar;
        colores = new ArrayList<>();
        manoFichas = new ArrayList<>();
    }

    /**
     * Permite establecer el nombre del jugador
     * 
     * @param nombre  nombre del jugador
     */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite establecer el avatar del jugador
     * 
     * @param avatar ruta de imagen del avatar a elegir
     */
    @Override
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * Permite establecer los colores de las fichas que verá el jugador.
     *
     * @param colores Los colores de las fichas
     */
    @Override
    public void setColores(List<Color> colores) {
        this.colores = colores;
    }

    /**
     * Agrega una ficha a la mano del jugador
     *
     * @param ficha ficha a agregar
     * @return true si se pudo agregar la ficha a la mano, false en caso
     * contrario
     */
    public boolean agregarFicha(Ficha ficha) {
        return manoFichas.add(ficha);
    }

    /**
     * Permite obtener una ficha de la mano del jugador.
     *
     * @return La ficha obtenida
     */
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
     * Permite establecer el turno del jugador.
     *
     * @param turno El turno del jugador
     */
    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntacion() {
        return puntacion;
    }

    public void setPuntacion(int puntacion) {
        this.puntacion = puntacion;
    }

    public String getAvatar() {
        return avatar;
    }

    public boolean isIsListo() {
        return isListo;
    }

    public void setIsListo(boolean isListo) {
        this.isListo = isListo;
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
