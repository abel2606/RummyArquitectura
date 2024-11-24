package org.itson.arquitectura.dominiorummy;

import java.util.Objects;

/**
 * Representa una ficha que tiene un número.
 *
 * @author Equipo4
 */
public class Numerica extends Ficha {

    /**
     * El número.
     */
    private int numero;
    
    /**
     * El color asignado.
     */
    private Color color;
    
    /**
     * El conjunto al que pertenece.
     */
    private TipoConjunto numeroConjunto;

    /**
     * Constructor que recibe el número de la ficha, el conjunto al que pertence
     * y el color asignado.
     *
     * @param numero El número de la ficha
     * @param numeroConjunto EL conjunto al que pertenece la ficha
     * @param color El color de la ficha
     */
    public Numerica(int numero, TipoConjunto numeroConjunto, Color color) {
        this.numero = numero;
        this.numeroConjunto = numeroConjunto;
        this.color = color;
    }

    /**
     * Permite obtener el color de la ficha.
     *
     * @return El color de la ficha
     */
    public Color getColor() {
        return color;
    }

    /**
     * Permite establecer el color de la ficha.
     *
     * @param color El color de la ficha
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Permite obtener el número de la ficha.
     *
     * @return El número de la ficha
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Permite obtener el conjunto al que pertenece la ficha.
     *
     * @return El conjunto al que pertenece
     */
    public TipoConjunto getNumeroConjunto() {
        return numeroConjunto;
    }

    /**
     * Permite establecer conjunto al que pertenece la ficha.
     *
     * @param numeroConjunto El conjunto al que pertenece
     */
    public void setNumeroConjunto(TipoConjunto numeroConjunto) {
        this.numeroConjunto = numeroConjunto;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero;
        hash = 97 * hash + Objects.hashCode(this.color);
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
        final Numerica other = (Numerica) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.color.equals(other.color);
    }

    @Override
    public String toString() {
        return "Numerica{" + "numero=" + numero + ", color=" + color.getCodigoHex()+'}';
    }
    

}
