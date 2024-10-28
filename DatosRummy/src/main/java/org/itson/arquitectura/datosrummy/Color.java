package org.itson.arquitectura.datosrummy;

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
    public String toString() {
        return "Color{" + "codigoHex=" + codigoHex + '}';
    }

}
