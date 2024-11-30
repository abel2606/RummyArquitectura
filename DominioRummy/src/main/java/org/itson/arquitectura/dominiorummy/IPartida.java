/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.arquitectura.dominiorummy;

import java.util.List;

/**
 *
 * @author Abe
 */
public interface IPartida {
    public void setRangoFichas(int rangoFichas);
    public void setNumeroComodines(int numeroComodines);
    public void aniadirJugador(IJugador jugador);
    public int getRangoFichas();
    public int getNumeroComodines();
    public List<Jugador> getJugadores();
}
