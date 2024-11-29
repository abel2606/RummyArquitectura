/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaEsperaMVC;

import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaSocket;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.IFachadaSocket;
import partidaMVC.ControlPartida;

/**
 *
 * @author Abe
 */
public class ControlSalaEspera {
    private IFachadaSocket socket;
    private ControlPartida partida;
    
    public ModeloSalaEspera modeloSala;
    
    public ControlSalaEspera(){
        socket = new FachadaSocket();
        partida = new ControlPartida();
        modeloSala = new ModeloSalaEspera();
    }
    
    public void mostrarVista(){
        modeloSala.mostrar();
    }
    
    public void solicitudInicioPartida(){
        mostrarMensajeDeRespuesta(socket.obtenerRespuestaJugadores());
    }
    
    public void mostrarMensajeDeRespuesta(boolean respuesta){
        if (respuesta==true){
            partida.mostrarPantalla();
        }
    }
}
