package org.itson.arquitectura.datosrummy;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Equipo4
 */
public class Partida {

    private static Partida instance;
    private List<Ficha> mazo;
    private List<Jugador> jugadores;
    private int numeroComodines;
    private int rangoFichas;
    private List<Turno> turnos;
//    private int codigo;
//    private Tablero tablero;

    /**
     * Constructor sin parametros de la partida
     */
    private Partida() {
        this.numeroComodines = 0;
        this.rangoFichas = 13;
    }

    /**
     * toma una ficha
     * @return regresa el valor de la ficha tomada
     */
    public Ficha tomarFicha() {
        Random random = new Random();
        return mazo.remove(random.nextInt(mazo.size()));
    }

    /**
     * Regresa la lista de jugadores
     * @return lista de los jugadores
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Establece los jugadores
     * @param jugadores valor de los jugadores
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * obtiene el numero de comodines
     * @return valor del numero de comodines
     */
    public int getNumeroComodines() {
        return numeroComodines;
    }

    /**
     * Obtiene el rango de las fichas 
     * @return rango de las fichas
     */
    public int getRangoFichas() {
        return rangoFichas;
    }

    /**
     * Obtiene el mazo
     * @return regresa el mazo
     */
    public List<Ficha> getMazo() {
        return mazo;
    }

    /**
     * establece el mazo
     * @param mazo valor del mazo
     */
    public void setMazo(List<Ficha> mazo) {
        this.mazo = mazo;
    }

    /**
     * Añade una ficha al mazo
     * @param ficha valor de la ficha
     */
    public void addFicha(Ficha ficha) {
        mazo.add(ficha);
    }

    /**
     * Regresa una instancia de la partida
     * @return valor de la isntancia de partida
     */
    public static Partida getInstance() {
        if (instance == null) {
            instance = new Partida();
        }
        return instance;
    }

}
