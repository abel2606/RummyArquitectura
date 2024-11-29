/*
 * IDominioFacahda.java
 */
package org.itson.arquitectura.dominiorummy.fachada;

import java.util.List;
import org.itson.arquitectura.dominiorummy.Ficha;
import org.itson.arquitectura.dominiorummy.GrupoFichas;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Jugador;

/**
 * @author Equipo4
 */
public interface IDominioFachada {

    /**
     * Verifica si la partida ha sido iniciada.
     *
     * @return true si la partida ha comenzado, false en caso contrario
     */
    public boolean isPartidaIniciada();

    /**
     * Permite agregar un jugador nuevo a la partida.
     *
     * @param jugador El jugador a agregar
     * @return true si se pudo agregar el jugador, false en caso contrario
     */
    public boolean agregarJugador(Jugador jugador);

    /**
     * Agrega una ficha a un grupo de fichas en la partida.
     *
     * @param ficha La ficha a agregar
     * @param grupoFichas El grupo de fichas al que se agregará la ficha
     * @return true si se pudo agregar la ficha al grupo, false en caso
     * contrario
     */
    public boolean agregarFichaGrupo(Ficha ficha, GrupoFichas grupoFichas);

    /**
     * Crea un grupo de fichas para ser usado en la partida.
     *
     * @param grupoFichas Lista de grupos de fichas que se van a crear
     * @return true si los grupos fueron creados exitosamente, false en caso
     * contrario
     */
    public GrupoFichas crearGrupoFichas(List<Ficha> grupoFichas);

    /**
     * Permite obtener una ficha del mazo de la partida.
     *
     * @return La ficha obtenida del mazo
     */
    public Ficha tomarFichaMazo();


    /**
     * Permite finalizar el turno del jugador actual.
     *
     * @return true si el turno fue terminado con éxito, false en caso contrario
     */
    public boolean terminarTurno();

    /**
     * Permite terminar la partida.
     *
     * @return true si la partida fue terminada con éxito, false en caso
     * contrario
     */
    public boolean terminarPartida();

    /**
     * Permite iniciar la partida.
     */
    public void iniciarPartida(IPartida partida);

    /**
     * Permite agregar una ficha al tablero de la partida.
     *
     * @param ficha La ficha a agregar
     * @param grupoFichas El grupo de fichas en el que se colocará la ficha
     * @return true si la ficha fue agregada al tablero con éxito, false en caso
     * contrario
     */
    public boolean agregarFichaTablero(Ficha ficha, GrupoFichas grupoFichas);

    /**
     * Permite agregar una ficha a la mano de un jugador.
     *
     * @param ficha La ficha a agregar
     * @param jugador El jugador al que se le agregará la ficha
     * @return true si la ficha fue agregada a la mano del jugador, false en
     * caso contrario
     */
    public boolean agregarFichaJugador(Ficha ficha, Jugador jugador);

}
