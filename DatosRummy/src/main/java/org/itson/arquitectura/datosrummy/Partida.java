package org.itson.arquitectura.datosrummy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Equipo4
 */
public class Partida {

    private boolean iniciada;
    private int numeroComodines;
    private int rangoFichas;
    private String codigo;
    private Tablero tablero;
    private List<Ficha> mazo;
    private List<Jugador> jugadores;
    private List<Turno> turnos;

    /**
     * Constructor sin parametros de la partida
     *
     * @param numeroComodines
     * @param rangoFichas
     */
    public Partida(int numeroComodines, int rangoFichas) {
        this.numeroComodines = numeroComodines;
        this.rangoFichas = rangoFichas;

        mazo = new ArrayList<>();
        jugadores = new ArrayList<>();
        turnos = new ArrayList<>();
        codigo = generarCodigo();
    }

    public List<Ficha> getMazo() {
        return mazo;
    }

    public void setMazo(List<Ficha> mazo) {
        this.mazo = mazo;
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

    public boolean isIniciada() {
        return iniciada;
    }

    public int getRangoFichas() {
        return rangoFichas;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean agregarJugador(Jugador jugador) {
        if (jugadores.size() < 4) {
            jugadores.add(jugador);
            return true;
        }
        return false;
    }

    public Ficha obtenerFicha() {
        Random random = new Random();
        return mazo.remove(random.nextInt(mazo.size()));
    }

    public void agregarFichaTablero(Ficha ficha, GrupoFichas grupoFichas) {
        tablero.agregarFicha(ficha, grupoFichas);
    }

    public boolean iniciarPartida() {
        if (jugadores.size() >= 2) {
            tablero = new Tablero();
            mazo = generarMazo();
            turnos = repartirTurnos();
            repartirFichas();
            iniciada = true;

            return true;
        }
        return false;
    }

    private String generarCodigo() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder nuevoCodigo = new StringBuilder(6);
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(caracteres.length());
            nuevoCodigo.append(caracteres.charAt(index));
        }

        return nuevoCodigo.toString();
    }

    private void repartirFichas() {
        for (Jugador jugador : jugadores) {
            for (int i = 0; i < 14; i++) {
                jugador.agregarFicha(obtenerFicha());
            }
        }
    }

    private List<Ficha> generarMazo() {
        List<Ficha> fichasGeneradas = new LinkedList<>();

        NumeroConjuntoFichas conjuntoNegro = new NumeroConjuntoFichas(1);
        NumeroConjuntoFichas conjuntoAzul = new NumeroConjuntoFichas(2);
        NumeroConjuntoFichas conjuntoRojo = new NumeroConjuntoFichas(3);
        NumeroConjuntoFichas conjuntoVerde = new NumeroConjuntoFichas(4);

        Color negro = new Color("00000", conjuntoNegro);
        Color azul = new Color("0014CB", conjuntoAzul);
        Color rojo = new Color("D40000", conjuntoRojo);
        Color verde = new Color("008309", conjuntoVerde);

        for (int i = 0; i < rangoFichas; i++) {
            fichasGeneradas.add(new Numerica(i + 1, conjuntoNegro, negro));
            fichasGeneradas.add(new Numerica(i + 1, conjuntoNegro, negro));

            fichasGeneradas.add(new Numerica(i + 1, conjuntoAzul, azul));
            fichasGeneradas.add(new Numerica(i + 1, conjuntoAzul, azul));

            fichasGeneradas.add(new Numerica(i + 1, conjuntoRojo, rojo));
            fichasGeneradas.add(new Numerica(i + 1, conjuntoRojo, rojo));

            fichasGeneradas.add(new Numerica(i + 1, conjuntoVerde, verde));
            fichasGeneradas.add(new Numerica(i + 1, conjuntoVerde, verde));
        }

        for (int i = 0; i < numeroComodines; i++) {
            fichasGeneradas.add(new Comodin());
        }

        return fichasGeneradas;
    }

    private List<Turno> repartirTurnos() {
        Random random = new Random();

        List<Turno> turnos = new ArrayList<>();

        for (int i = 0; i < jugadores.size(); i++) {
            turnos.add(new Turno(jugadores.get(random.nextInt(jugadores.size())), i + 1));
        }

        return turnos;
    }

}
