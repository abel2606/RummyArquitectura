package org.itson.arquitectura.datosrummy;

/**
 *
 * @author Abe
 */
public class Color {

    private String codigoHex;
    private TipoConjunto tipo;

    public Color(String codigoHex, TipoConjunto tipo) {
        this.codigoHex = codigoHex;
        this.tipo = tipo;
    }

    public String getCodigoHex() {
        return codigoHex;
    }

    public TipoConjunto getTipo() {
        return tipo;
    }

}
