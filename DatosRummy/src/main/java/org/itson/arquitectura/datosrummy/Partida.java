package org.itson.arquitectura.datosrummy;

import java.util.List;
import java.util.Random;

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
        this.numeroComodines = 0;
        this.rangoFichas = 13;
    }

    public Ficha tomarFicha() {
        Random random = new Random();
        return mazo.remove(random.nextInt(mazo.size()));
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
