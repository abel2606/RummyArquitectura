/*
 * IAplicacionFachada.java
 */
package org.itson.arquitectura.aplicacionrummy.fachada;

import java.util.List;
import org.itson.arquitectura.dominiorummy.Ficha;
import org.itson.arquitectura.dominiorummy.GrupoFichas;
import org.itson.arquitectura.dominiorummy.IJugador;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.Partida;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 * @author Equipo4
 */
public interface IAplicacionFachada {
    
    public Partida configurarPartida(IPartida partida);
    public void registrarJugador(IJugador jugador);
    public void solicitarUnirsePartida(JugadorDTO jugador);
    public boolean solicitarIniciarPartida(Jugador jugador);
    public void tomarFichaMazo();
    public void agregarFichaGrupo(Ficha ficha, GrupoFichas grupoFichas);
    public void crearGrupoFichas(List<Ficha> fichas);
    public void isPartidaIniciada();
    public void iniciarPartida(IPartida partida);
    
}
