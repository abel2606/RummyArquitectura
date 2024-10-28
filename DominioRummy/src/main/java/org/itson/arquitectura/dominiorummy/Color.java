package org.itson.arquitectura.dominiorummy;

import java.util.Objects;

/**
 * @author Equipo4
 */
public class Color {

    private String codigoHex;
    private NumeroConjuntoFichas tipoConjunto;

    /**
     * Constructor del color
     * @param codigoHex valor hexadecimal del color
     * @param tipo tipo del color
     */
    public Color(String codigoHex, NumeroConjuntoFichas tipo) {
        this.codigoHex = codigoHex;
        this.tipoConjunto = tipo;
    }

    /**
     * Regresa el codigo hexadecimal del color
     * @return codigo hexadecimal del color
     */
    public String getCodigoHex() {
        return codigoHex;
    }

    /**
     * Regresa el tipo de conjunto del color
     * @return valor del tipo de conjunto
     */
    public NumeroConjuntoFichas getTipoConjunto() {
        return tipoConjunto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.codigoHex);
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
        final Color other = (Color) obj;
        return this.codigoHex.equalsIgnoreCase(other.codigoHex);
    }

    @Override
    public String toString() {
        return "Color{" + "codigoHex=" + codigoHex + '}';
    }

}
