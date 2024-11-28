/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket;

/**
 *
 * @author Dell
 */
public interface IFachadaSocket {
    
    public boolean obtenerRespuestaJugadores();
    
    public void buscarPartida(String codigo);
    
    public void iniciarPartida();
    
    public void avisaTodos();
    
    public void pasarTurno();
    
    public void terminarPartida();
    
}
