/*
 * JugadorDTO.java
 */
package org.itson.arquitecturasoftware.dtorummy.dto;

import java.io.Serializable;

/**
 * Clase que representa un jugador de una partida.
 *
 * @author Equipo4
 */
public class JugadorDTO implements Serializable {

    private int cantidadFichas;
    private int puntuacion;
    private String nombre;
    private String avatar;
    private boolean listoParaJugar;

    /**
     * Constructor que se usa cuando un jugador solicita unirse a una partida.
     * Utiliza el nombre y el avatar del jugador para poder ser obtenidos cuando
     * sea necesario.
     *
     * @param nombre El nombre del jugador
     * @param avatar El avatar del jugador
     */
    public JugadorDTO(String nombre, String avatar) {
        this.nombre = nombre;
        this.avatar = avatar;
        this.listoParaJugar = false;
    }

    /**
     * Constructor que se usa cuando un jugador termina un turno. Utiliza el
     * nombre, el avatar y el total de fichas de un jugador para poder ser
     * obtenidos cuando sea necesario.
     *
     * @param cantidadFichas La cantidad de fichas que tiene el jugador en su
     * mano
     * @param nombre El nombre del jugador
     * @param avatar El avatar del jugador
     */
    public JugadorDTO(int cantidadFichas, String nombre, String avatar) {
        this.cantidadFichas = cantidadFichas;
        this.nombre = nombre;
        this.avatar = avatar;
    }

    /**
     * Constructor que se usa cuando se termina la partida y se necesitan
     * obtener los resultados de los jugadores para mostrarlos.
     *
     * @param cantidadFichas La cantidad de fichas del jugador
     * @param puntuacion La suma de los números de las fichas con las que se
     * quedó el jugador
     * @param nombre El nombre del jugador
     * @param avatar El avatar del jugador
     */
    public JugadorDTO(int cantidadFichas, int puntuacion, String nombre, String avatar) {
        this.cantidadFichas = cantidadFichas;
        this.puntuacion = puntuacion;
        this.nombre = nombre;
        this.avatar = avatar;
    }

    /**
     * Permite obtener la cantidad de fichas del jugador.
     *
     * @return La cantidad de fichas del jugador
     */
    public int getCantidadFichas() {
        return cantidadFichas;
    }

    /**
     * Permite obtener la puntuación calculada a partir de la suma de las fichas
     * con las que se quedó el jugador.
     *
     * @return La puntuación del jugador
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * Permite obtener el nombre del jugador.
     *
     * @return El nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite obtener el avatar del jugador.
     *
     * @return El avatar del jugador
     */
    public String getAvatar() {
        return avatar;
    }

    public boolean isListoParaJugar() {
        return listoParaJugar;
    }

    public void setListoParaJugar(boolean listoParaJugar) {
        this.listoParaJugar = listoParaJugar;
    }
}
