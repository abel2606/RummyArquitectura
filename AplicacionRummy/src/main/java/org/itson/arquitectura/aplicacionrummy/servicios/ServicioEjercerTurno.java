/*
 * ServicioEjercerTurno.java
 */
package org.itson.arquitectura.aplicacionrummy.servicios;

import org.itson.arquitectura.dominiorummy.Ficha;
import org.itson.arquitectura.dominiorummy.GrupoFichas;
import org.itson.arquitectura.dominiorummy.fachada.DominioFachada;
import org.itson.arquitectura.dominiorummy.fachada.IDominioFachada;

/**
 * @author Equipo4
 */
public class ServicioEjercerTurno {
    
    
    private IDominioFachada dominio;

    public ServicioEjercerTurno() {
        this.dominio = new DominioFachada(0, 0);
    }
    
    public Ficha tomarFicha(){
        return dominio.tomarFichaMazo();
    }
    
    public boolean agregarFichaGrupo(Ficha ficha, GrupoFichas grupofichas){
        return dominio.agregarFichaGrupo(ficha, grupofichas);
    }
    
    public boolean terminarTurno(){
        return dominio.terminarTurno();
    }
    
    
    
}
