package org.itson.arquitectura.datosrummy;

/**
 *
 * @author Equipo4
 */
public class Color {

    private int codigoHex;
    private TipoConjunto tipoConjunto;

    /**
     * Constructor del color
     * @param codigoHex valor hexadecimal del color
     * @param tipo tipo del color
     */
    public Color(int codigoHex, TipoConjunto tipo) {
        this.codigoHex = codigoHex;
        this.tipoConjunto = tipo;
    }

    /**
     * Regresa el codigo hexadecimal del color
     * @return codigo hexadecimal del color
     */
    public int getCodigoHex() {
        return codigoHex;
    }

    /**
     * Regresa el tipo de conjunto del color
     * @return valor del tipo de conjunto
     */
    public TipoConjunto getTipoConjunto() {
        return tipoConjunto;
    }

}
