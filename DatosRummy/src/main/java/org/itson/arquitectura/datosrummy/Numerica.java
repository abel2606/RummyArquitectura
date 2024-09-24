package org.itson.arquitectura.datosrummy;

/**
 *
 * @author Abe
 */
public class Numerica extends Ficha {

    private Color color;
    private int numero;
    private TipoConjunto tipoConjunto;

    public Numerica(int numero, TipoConjunto tipoConjunto) {
        this.numero = numero;
        this.tipoConjunto = tipoConjunto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoConjunto getTipoConjunto() {
        return tipoConjunto;
    }

    public void setTipoConjunto(TipoConjunto tipoConjunto) {
        this.tipoConjunto = tipoConjunto;
    }
    
}
