/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaEsperaMVC;

import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaInfraestructura;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.IFachadaInfraestructura;
import partidaMVC.ControlPartida;

/**
 *
 * @author Abe
 */
public class ControlSalaEspera {
    
    private IFachadaInfraestructura infraestructura;
    private ControlPartida partida;
    
    public ModeloSalaEspera modeloSala;
    
    public ControlSalaEspera(){
        infraestructura = new FachadaInfraestructura();
        partida = new ControlPartida();
        modeloSala = new ModeloSalaEspera();
    }
    
    public void mostrarVista(){
        modeloSala.mostrar();
    }
    
//    public void solicitudInicioPartida(){
//        mostrarMensajeDeRespuesta(infraestructura.solicitarInicioPartida());
//    }
//    
//    public void mostrarMensajeDeRespuesta(boolean respuesta){
//        if (respuesta==true){
//            partida.mostrarPantalla();
//        }
//    }
}
