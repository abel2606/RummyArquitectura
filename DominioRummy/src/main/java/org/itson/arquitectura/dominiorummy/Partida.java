package org.itson.arquitectura.dominiorummy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Representa una partida del juego.
 *
 * @author Equipo4
 */
public class Partida {

    /**
     * Si la partida se encuentra iniciada o no.
     */
    private boolean iniciada;

    /**
     * El número total de comodines.
     */
    private int numeroComodines;

    /**
     * El rango máximo de las fichas.
     */
    private int rangoFichas;

    /**
     * El código de la partida.
     */
    private String codigo;

    /**
     * El tablero donde se colocarán las fichas.
     */
    private Tablero tablero;

    /**
     * El mazo de fichas disponibles para jalar.
     */
    private List<Ficha> mazo;

    /**
     * Los jugadores presentes en la partida.
     */
    private List<Jugador> jugadores;

    /**
     * Los turnos en los que juegan los jugadores.
     */
    private List<Turno> turnos;

    /**
     * Constructor que recibe el número de comodines y el rango de fichas.
     *
     * @param numeroComodines El número de comodines
     * @param rangoFichas El rango de fichas
     */
    public Partida(int numeroComodines, int rangoFichas) {
        this.numeroComodines = numeroComodines;
        this.rangoFichas = rangoFichas;

        mazo = new ArrayList<>();
        jugadores = new ArrayList<>();
        turnos = new ArrayList<>();
        codigo = generarCodigo();
    }

    /**
     * Permite obtener el mazo de fichas disponibles para jalar.
     *
     * @return El mazo de fichas disponibles
     */
    public List<Ficha> getMazo() {
        return mazo;
    }

    /**
     * Permite obtener la lista de jugadores que hay de la partida.
     *
     * @return La lista de jugadores que hay
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Permite establecer la lista de jugadores.
     *
     * @param jugadores La lista de jugadores
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * Permite obtener el número de comodines.
     *
     * @return El número de comodines
     */
    public int getNumeroComodines() {
        return numeroComodines;
    }

    /**
     * Permite saber si una partida está iniciada o no.
     *
     * @return true si la partida está iniciada, false en caso contrario
     */
    public boolean isIniciada() {
        return iniciada;
    }

    /**
     * Permite obtener el rango de fichas que puede haber
     *
     * @return El rango de fichas
     */
    public int getRangoFichas() {
        return rangoFichas;
    }

    /**
     * Permite obtener los turnos en que juegan los jugadores
     *
     * @return Los turnos en que juegan los jugadores
     */
    public List<Turno> getTurnos() {
        return turnos;
    }

    /**
     * Permite obtener el código de la partida
     *
     * @return El código de la partida
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Permite agregar a un jugador a la partida siempre y cuanto haya menos de
     * 4 jugadores
     *
     * @param jugador El jugador a agregar
     * @return true si se agregó el jugador, false en caso contario
     */
    public boolean agregarJugador(Jugador jugador) {
        if (jugadores.size() < 4) {
            jugadores.add(jugador);
            return true;
        }
        return false;
    }

    /**
     * Permite obtener una ficha del mazo.
     *
     * @return La ficha obtenida
     */
    public Ficha obtenerFicha() {
        Random random = new Random();
        return mazo.remove(random.nextInt(mazo.size()));
    }

    /**
     * Permite agregar una ficha a un grupo del tablero.
     *
     * @param ficha La ficha a agregar
     * @param grupoFichas El grupo al que se quiere agregar la ficha
     */
    public void agregarFichaTablero(Ficha ficha, GrupoFichas grupoFichas) {
        tablero.agregarFicha(ficha, grupoFichas);
    }

    /**
     * Permite realizar las operaciones necesarias para iniciar la partida
     */
    public void iniciarPartida() {
        if (jugadores.size() >= 2) {
            tablero = new Tablero();
            mazo = generarMazo();
            turnos = repartirTurnos();
            repartirFichas();
            iniciada = true;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.codigo);
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
        final Partida other = (Partida) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    /**
     * Permite generar un código de 6 caracteres alfanuméricos.
     *
     * @return El código generado
     */
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

    /**
     * Permite repartir las fichas a los jugadores.
     */
    private void repartirFichas() {
        for (Jugador jugador : jugadores) {
            for (int i = 0; i < 14; i++) {
                jugador.agregarFicha(obtenerFicha());
            }
        }
    }

    /**
     * Permite crear un mazo de fichas.
     *
     * @return El mazo creado
     */
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

    /**
     * Permite repartir los turnos a los jugadores.
     *
     * @return Los turnos repartidos
     */
    private List<Turno> repartirTurnos() {
        Random random = new Random();

        List<Turno> turnos = new ArrayList<>();

        for (int i = 0; i < jugadores.size(); i++) {
            turnos.add(new Turno(jugadores.get(random.nextInt(jugadores.size())), i + 1));
        }

        return turnos;
    }

}