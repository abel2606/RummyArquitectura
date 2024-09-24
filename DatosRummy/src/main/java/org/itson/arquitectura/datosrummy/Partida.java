/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitectura.datosrummy;

import java.util.List;

/**
 *
 * @author Abe
 */
public class Partida {
    private List<Ficha> mazo;
    private List<Jugador> jugadores;
    private int numeroComodines;
    private String rangoFichas;
    private int codigo;
    private Tablero tablero;

    public Partida(List<Ficha> mazo, List<Jugador> jugadores, int numeroComodines, String rangoFichas, int codigo, Tablero tablero) {
        this.mazo = mazo;
        this.jugadores = jugadores;
        this.numeroComodines = numeroComodines;
        this.rangoFichas = rangoFichas;
        this.codigo = codigo;
        this.tablero = tablero;
    }

    
    public Ficha tomarFicha(){
        return mazo.getFirst();
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

    public String getRangoFichas() {
        return rangoFichas;
    }

    public void setRangoFichas(String rangoFichas) {
        this.rangoFichas = rangoFichas;
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
    
    
}
