/*
 * ServicioIniciarPartida.java
 */
package org.itson.arquitectura.aplicacionrummy.servicios;

import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.fachada.DominioFachada;
import org.itson.arquitectura.dominiorummy.fachada.IDominioFachada;

/**
 * @author Equipo4
 */
public class ServicioIniciarPartida {
    
    private IDominioFachada dominio;

    public ServicioIniciarPartida() {
        this.dominio = new DominioFachada(0, 0);
        
    }
    
    public void solicitarInicioPartida(){
      
    }
    
    public void iniciarPartida(IPartida partida){
        dominio.iniciarPartida(partida);
    }
    
}
