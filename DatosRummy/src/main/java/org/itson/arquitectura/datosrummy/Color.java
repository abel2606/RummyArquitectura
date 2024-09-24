package org.itson.arquitectura.datosrummy;

/**
 *
 * @author Abe
 */
public class Color {

    private int codigoHex;
    private TipoConjunto tipoConjunto;

    public Color(int codigoHex, TipoConjunto tipo) {
        this.codigoHex = codigoHex;
        this.tipoConjunto = tipo;
    }

    public int getCodigoHex() {
        return codigoHex;
    }

    public TipoConjunto getTipoConjunto() {
        return tipoConjunto;
    }

}
