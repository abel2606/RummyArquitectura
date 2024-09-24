package org.itson.arquitectura.datosrummy;

/**
 *
 * @author ricar
 */
public class Turno {
    
    private Jugador jugador;
    private int turno;
    
    public Turno(Jugador jugador, int turno){
        this.jugador = jugador;
        this.turno = turno;
    }
}
