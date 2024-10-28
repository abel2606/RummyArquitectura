package org.itson.arquitectura.datosrummy;

/**
 * @author Equipo4
 */
public class NumeroConjuntoFichas {

    private int numero;

    /**
     * tipo de conjunto
     * @param numero numero del conjunto
     */
    public NumeroConjuntoFichas(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el tipo de conjunto
     * @return valor del tipo de conjunto
     */
    public int getNumero() {
        return numero;
    }

}
