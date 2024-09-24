package org.itson.arquitectura.datosrummy;

/**
 *
 * @author Abe
 */
public class Color {

    private String codigoHex;
    private TipoConjunto tipoConjunto;

    public Color(String codigoHex, TipoConjunto tipo) {
        this.codigoHex = codigoHex;
        this.tipoConjunto = tipo;
    }

    public String getCodigoHex() {
        return codigoHex;
    }

    public TipoConjunto getTipoConjunto() {
        return tipoConjunto;
    }

}
