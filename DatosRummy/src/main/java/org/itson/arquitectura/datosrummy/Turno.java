package org.itson.arquitectura.datosrummy;

/**
 * @author Equipo4
 */
public class Turno {

    private int turno;
    private Jugador jugador;

    /**
     * Constructor del turno
     *
     * @param jugador valor del jugador
     * @param turno valor del turno
     */
    public Turno(Jugador jugador, int turno) {
        this.jugador = jugador;
        this.turno = turno;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.turno;
        return hash;
    }

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
        final Turno other = (Turno) obj;
        return this.turno == other.turno;
    }

}
