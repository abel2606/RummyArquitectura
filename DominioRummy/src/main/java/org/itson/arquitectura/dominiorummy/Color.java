package org.itson.arquitectura.dominiorummy;

import java.util.Objects;

/**
 * Representa el color de una ficha numérica.
 * 
 * @author Equipo4
 */
public class Color {

    /**
     * El código hexadecimal del color.
     */
    private int codigoHex;
    
    /**
     * El conjunto de fichas asociado al color.
     */
    private TipoConjunto numeroConjunto;

    /**
     * Constructor que recibe el código hexadecimal y el conjunto asociado al
     * color.
     *
     * @param codigoHex El código hexadecimal del color
     * @param numeroConjunto El conjunto de fichas asociado al color
     */
    public Color(int codigoHex, TipoConjunto numeroConjunto) {
        this.codigoHex = codigoHex;
        this.numeroConjunto = numeroConjunto;
    }

    /**
     * Permite obtener el código hexadecimal del color.
     *
     * @return El código del color
     */
    public int getCodigoHex() {
        return codigoHex;
    }

    /**
     * Permite obtener el conjunto de fichas asociado al color.
     *
     * @return El conjunto de fichas asociado
     */
    public TipoConjunto getNumeroConjunto() {
        return numeroConjunto;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.codigoHex);
        return hash;
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
        final Color other = (Color) obj;
        return this.codigoHex == other.codigoHex;
    }

    
    

}
