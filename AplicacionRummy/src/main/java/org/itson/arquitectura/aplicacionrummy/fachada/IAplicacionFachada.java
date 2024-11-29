/*
 * IAplicacionFachada.java
 */
package org.itson.arquitectura.aplicacionrummy.fachada;

import java.util.List;
import org.itson.arquitectura.dominiorummy.Ficha;
import org.itson.arquitectura.dominiorummy.GrupoFichas;
import org.itson.arquitectura.dominiorummy.IJugador;
import org.itson.arquitectura.dominiorummy.IPartida;

/**
 * @author Equipo4
 */
public interface IAplicacionFachada {
    
    public void configurarPartida(IPartida partida);
    public void registrarJugador(IJugador jugador);
    public void solicitarUnirsePartida();
    public void solicitarIniciarPartida();
    public void tomarFichaMazo();
    public void agregarFichaGrupo(Ficha ficha, GrupoFichas grupoFichas);
    public void crearGrupoFichas(List<Ficha> fichas);
    public void isPartidaIniciada();
    public void iniciarPartida(IPartida partida);
    
}
