package org.itson.arquitectura.datosrummy;

/**
 *
 * @author Equipo4
 */
public class TipoConjunto {

    private int tipo;

    /**
     * Constructor vacio
     */
    public TipoConjunto() {
    }

    /**
     * tipo de conjunto
     * @param tipo numero del tipo de conjunto
     */
    public TipoConjunto(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el tipo de conjunto
     * @return valor del tipo de conjunto
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de conjunto
     * @param tipo regresa el valor del tipo de conjunto
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
