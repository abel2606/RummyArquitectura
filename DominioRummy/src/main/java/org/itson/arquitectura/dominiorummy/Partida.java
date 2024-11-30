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
public class Partida implements IPartida {

    private static Partida partida;
    /**
     * Los jugadores presentes en la partida.
     */
    private List<Jugador> jugadores;

    /**
     * Los turnos en los que juegan los jugadores.
     */
    private List<Turno> turnos;

    /**
     * Turno actual de la partida
     */
    private Turno turnoActual;

    /**
     * El número total de comodines.
     */
    private int numeroComodines;

    /**
     * Si la partida se encuentra iniciada o no.
     */
    private boolean isIniciada;

    /**
     * El rango máximo de las fichas.
     */
    private int rangoFichas;

    /**
     * El mazo de fichas disponibles para jalar.
     */
    private List<Ficha> mazo;

    /**
     * El tablero donde se colocarán las fichas.
     */
    private Tablero tablero;

    /**
     * Constructor que recibe el número de comodines y el rango de fichas.
     *
     * @param numeroComodines El número de comodines
     * @param rangoFichas El rango de fichas
     */
    public Partida() {
        this.numeroComodines = numeroComodines;
        this.rangoFichas = rangoFichas;

        mazo = new ArrayList<>();
        jugadores = new ArrayList<>();
        turnos = new ArrayList<>();
    }

    public static Partida getInstance() {
        if (partida == null) {
            partida = new Partida();
        }
        return partida;
    }

    @Override
    public void setRangoFichas(int rangoFichas) {
        this.rangoFichas = rangoFichas;
    }

    @Override
    public void setNumeroComodines(int numeroComodines) {
        this.numeroComodines = numeroComodines;
    }
    
    @Override
    public void aniadirJugador(IJugador jugador) {
        this.jugadores.add((Jugador) jugador);
    }

    /**
     * Permite saber si una partida está iniciada o no.
     *
     * @return true si la partida está iniciada, false en caso contrario
     */
    public boolean isIniciada() {
        return isIniciada;
    }

    /**
     * Permite obtener una ficha del mazo.
     *
     * @return La ficha obtenida
     */
    public Ficha obtenerFichaMazo() {
        Random random = new Random();
        return mazo.remove(random.nextInt(mazo.size()));
    }

    public boolean terminarTurno() {
        int siguienteTurno = turnoActual.getTurno();
        if (siguienteTurno == getTurnos().size() - 1) {
            turnoActual = (getTurnos().get(0));
        } else {
            turnoActual = (getTurnos().get(siguienteTurno + 1));
        }
        return true;
    }

    /**
     * Permite agregar una ficha a la mano de un jugador presente en la partida.
     *
     * @param ficha La ficha a agregar
     * @param jugador El jugador al que se le agregará la ficha
     * @return true si se agregó la ficha, false en caso contrario
     */
    public boolean agregarFichaJugador(Ficha ficha, Jugador jugador) {
        if (jugadores.contains(jugador)) {
            return jugador.agregarFicha(ficha);
        }
        return false;
    }

    public boolean agregarFichaGrupo(Ficha ficha, GrupoFichas grupoFichas) {
        return tablero.agregarFicha(ficha, grupoFichas);
    }

    public GrupoFichas crearGrupoFichas(List<Ficha> fichas) {
        return GrupoFichas.crearGrupo(fichas, rangoFichas);
    }

    public boolean terminarPartida() {
        for (Jugador jugador : jugadores) {
            if (jugador.getManoFichas().isEmpty()) {

                System.out.println("El jugador " + jugador.getNombre() + " ha ganado!");
                isIniciada = false;
                reiniciarPartida();
                return true;
            }
        }
        return false;
    }

    private void reiniciarPartida() {
        this.isIniciada = false;
        this.turnos.clear();
        this.jugadores.clear();
        this.mazo.clear();
        this.tablero = null;

        this.numeroComodines = 0;
        this.rangoFichas = 0;


    }

    public Partida actualizarConfiguracion(IPartida partida) {
        this.setRangoFichas(partida.getRangoFichas());
        this.setNumeroComodines(partida.getNumeroComodines());
        this.setJugadores(partida.getJugadores());
        return getInstance();
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
    @Override
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
     * Permite agregar una ficha a un grupo del tablero.
     *
     * @param ficha La ficha a agregar
     * @param grupoFichas El grupo al que se quiere agregar la ficha
     * @return true si se pudo agregar la ficha al tablero, false en caso
     * contrario
     */
    public boolean agregarFichaTablero(Ficha ficha, GrupoFichas grupoFichas) {
        return tablero.agregarFicha(ficha, grupoFichas);
    }

    /**
     * Permite realizar las operaciones necesarias para iniciar la partida.
     */
    public void iniciarPartida() {
        if (jugadores.size() >= 2) {
            tablero = new Tablero();
            mazo = generarMazo();
            turnos = repartirTurnos();
            repartirFichas();
            isIniciada = true;
        }
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
        return Objects.equals(this.partida, other.partida);
    }

    /**
     * Permite repartir las fichas a los jugadores.
     */
    private void repartirFichas() {
        for (Jugador jugador : jugadores) {
            for (int i = 0; i < 14; i++) {
                jugador.agregarFicha(obtenerFichaMazo());
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

        TipoConjunto conjuntoNegro = new TipoConjunto(1);
        TipoConjunto conjuntoAzul = new TipoConjunto(2);
        TipoConjunto conjuntoRojo = new TipoConjunto(3);
        TipoConjunto conjuntoVerde = new TipoConjunto(4);

        Color negro = new Color(0x000000, conjuntoNegro);
        Color azul = new Color(0x0014CB, conjuntoAzul);
        Color rojo = new Color(0xD40000, conjuntoRojo);
        Color verde = new Color(0x008309, conjuntoVerde);

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

    public boolean solicitarInicioPartida(Jugador jugador) {
        jugador.setIsListo(jugador.isIsListo());
        return jugador.isIsListo();
    }

}
