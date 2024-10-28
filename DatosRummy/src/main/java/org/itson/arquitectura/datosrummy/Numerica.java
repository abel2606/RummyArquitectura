package org.itson.arquitectura.datosrummy;

/**
 * @author Equipo4
 */
public class Numerica extends Ficha {

    private int numero;
    private Color color;
    private NumeroConjuntoFichas numeroConjunto;

    /**
     * Constructor de la ficha numerica
     * @param numero valor del numero de la ficha
     * @param numeroConjunto numero de conjunto de la ficha
     * @param color el color de la ficha
     */
    public Numerica(int numero, NumeroConjuntoFichas numeroConjunto, Color color) {
        this.numero = numero;
        this.numeroConjunto = numeroConjunto;
        this.color = color;
    }

    /**
     * regresa el color de la ficha numerica
     * @return valor del color
     */
    public Color getColor() {
        return color;
    }

    /**
     * EStablecel el color de la ficha numerica
     * @param color color de la ficha
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * regresa el numero de la ficha numerica
     * @return valor del numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el numero 
     * @param numero numero a establecer
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Regresa el tipo de conjunto de la ficha numerica
     * @return regresa el tipo de conjunto
     */
    public NumeroConjuntoFichas getNumeroConjunto() {
        return numeroConjunto;
    }

    /**
     * establece el tipo de conjunto
     * @param numeroConjunto valor del conjunto
     */
    public void setNumeroConjunto(NumeroConjuntoFichas numeroConjunto) {
        this.numeroConjunto = numeroConjunto;
    }

    @Override
    public String toString() {
        return "Numerica{" + "numero=" + numero + ", color=" + color + '}';
    }
    
}
