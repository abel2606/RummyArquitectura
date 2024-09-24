package org.itson.arquitectura.datosrummy;

/**
 *
 * @author ricar
 */
public class Turno {
    
    private Jugador jugador;
    private int turno;
    
    /**
     * Constructor del turno
     * @param jugador valor del jugador
     * @param turno valor del turno
     */
    public Turno(Jugador jugador, int turno){
        this.jugador = jugador;
        this.turno = turno;
    }
}
