/*
 * InfraestructuraException.java
 */
package org.itson.arquitecturasoftware.infraestructurarummy.excepciones;

/**
 * Clase que permite crear excepciones a partir de fallos en la infraestructura.
 *
 * @author Equipo4
 */
public class InfraestructuraException extends Exception {

    /**
     * Constructor vacío.
     */
    public InfraestructuraException() {
    }

    /**
     * Constructor que recibe el mensaje de la excepción.
     *
     * @param message El mensaje de la excepción
     */
    public InfraestructuraException(String message) {
        super(message);
    }

}
