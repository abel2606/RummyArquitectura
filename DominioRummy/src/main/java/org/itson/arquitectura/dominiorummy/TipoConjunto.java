package org.itson.arquitectura.dominiorummy;

/**
 * Representa el conjunto al que pertenecen las fichas númericas. Sirve para
 * asignarles un color.
 *
 * @author Equipo4
 */
public class TipoConjunto {

    /**
     * El número del conjunto
     */
    private int numero;

    /**
     * Constructor que recibe el número del conjunto.
     *
     * @param numero El número de. conjunto
     */
    public TipoConjunto(int numero) {
        this.numero = numero;
    }

    /**
     * Permite obtener el número dl conjunto
     *
     * @return El número de conjunto
     */
    public int getNumero() {
        return numero;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.numero;
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
        final TipoConjunto other = (TipoConjunto) obj;
        return this.numero == other.numero;
    }

}
