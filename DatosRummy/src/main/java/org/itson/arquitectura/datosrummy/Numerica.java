package org.itson.arquitectura.datosrummy;

/**
 *
 * @author Abe
 */
public class Numerica extends Ficha {

    private Color color;
    private int numero;
    private TipoConjunto tipoConjunto;

    /**
     * Constructor de la ficha numerica
     * @param numero valor del numero de la ficha
     * @param tipoConjunto tipo de conjunto de la ficha
     * @param color el color de la ficha
     */
    public Numerica(int numero, TipoConjunto tipoConjunto, Color color) {
        this.numero = numero;
        this.tipoConjunto = tipoConjunto;
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
    public TipoConjunto getTipoConjunto() {
        return tipoConjunto;
    }

    /**
     * establece el tipo de conjunto
     * @param tipoConjunto valor del conjunto
     */
    public void setTipoConjunto(TipoConjunto tipoConjunto) {
        this.tipoConjunto = tipoConjunto;
    }
    
}
