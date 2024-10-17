package org.itson.arquitectura.datosrummy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Equipo4
 */
public class Partida {

    private List<Ficha> mazo;
    private List<Jugador> jugadores;
    private int numeroComodines;
    private boolean isIniciada;
    private int rangoFichas;
    private List<Turno> turnos;
    private int codigo;
    private Tablero tablero;

    /**
     * Constructor sin parametros de la partida
     */
    public Partida() {
        mazo = new ArrayList<>();
        jugadores = new ArrayList<>();
        turnos = new ArrayList<>();
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

    public void setNumeroComodines(int numeroComodines) {
        this.numeroComodines = numeroComodines;
    }

    public boolean isIsIniciada() {
        return isIniciada;
    }

    public void setIsIniciada(boolean isIniciada) {
        this.isIniciada = isIniciada;
    }

    public int getRangoFichas() {
        return rangoFichas;
    }

    public void setRangoFichas(int rangoFichas) {
        this.rangoFichas = rangoFichas;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    
    private void generarCodigo(){
        
    }
    
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public void repartirFichas(){
        for (Jugador jugador : jugadores) {
            if (rangoFichas == 10) {
                for (int i = 0; i < 10; i++) {
                    jugador.agregarFicha(obtenerFicha());
                }
            } else if (rangoFichas == 13) {
                for (int i = 0; i < 13; i++) {
                    jugador.agregarFicha(obtenerFicha());
                }
            }
        }
    }

    public Ficha obtenerFicha() {
        Random random = new Random();
        return mazo.remove(random.nextInt(mazo.size()));
    }
    
    public void agregarFichaTablero(Ficha ficha, GrupoFichas grupoFichas) {
        tablero.agregarFicha(ficha, grupoFichas);
    }
}
