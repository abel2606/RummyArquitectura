package org.itson.arquitectura.datosrummy;

import java.util.List;

/**
 *
 * @author Abe
 */
public class Partida {

    private static Partida instance;
    private List<Ficha> mazo;
    private List<Jugador> jugadores;
    private int numeroComodines;
    private int rangoFichas;
//    private int codigo;
//    private Tablero tablero;

    private Partida() {
        this.numeroComodines = 2;
        this.rangoFichas = 10;
    }

    public Ficha tomarFicha() {
        return mazo.removeFirst();
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getNumeroComodines() {
        return numeroComodines;
    }

    public int getRangoFichas() {
        return rangoFichas;
    }

    public List<Ficha> getMazo() {
        return mazo;
    }

    public void setMazo(List<Ficha> mazo) {
        this.mazo = mazo;
    }

    public void addFicha(Ficha ficha) {
        mazo.add(ficha);
    }

    public static Partida getInstance() {
        if (instance == null) {
            instance = new Partida();
        }
        return instance;
    }

}
