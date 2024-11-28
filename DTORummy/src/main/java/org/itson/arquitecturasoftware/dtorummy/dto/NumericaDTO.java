/*
 * NumericaDTO.java
 */
package org.itson.arquitecturasoftware.dtorummy.dto;

import java.io.Serializable;

/**
 * Clase que representa una ficha de tipo numérica.
 *
 * @author Equipo4
 */
public class NumericaDTO extends FichaDTO implements Serializable {

    private int numero;

    /**
     * Constructor que permite crear fichas numéricas.
     *
     * @param numero El número de la ficha
     */
    public NumericaDTO(int numero) {
        this.numero = numero;
    }

    /**
     * Permite obtener el número de la ficha.
     *
     * @return El número de la ficha
     */
    public int getNumero() {
        return numero;
    }

}
