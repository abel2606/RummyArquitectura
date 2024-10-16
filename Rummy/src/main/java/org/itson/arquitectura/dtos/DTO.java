package org.itson.arquitectura.dtos;

import componentes.FichaComponente;
import org.itson.arquitectura.datosrummy.Ficha;

/**
 *
 * @author Diego Valenzuela Parra
 */
public class DTO {
    
    private FichaComponente ficha;
    private int tamanioMazo;

    public int getTamanioMazo() {
        return tamanioMazo;
    }

    public void setTamanioMazo(int tamanioMazo) {
        this.tamanioMazo = tamanioMazo;
    }

    public FichaComponente getFicha() {
        return ficha;
    }

    public void setFicha(FichaComponente ficha) {
        this.ficha = ficha;
    }
    
    
}
