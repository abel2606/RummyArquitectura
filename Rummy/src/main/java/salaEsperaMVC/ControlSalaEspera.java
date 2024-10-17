/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaEsperaMVC;

import partidaMVC.ControlPartida;

/**
 *
 * @author Abe
 */
public class ControlSalaEspera {
    public ModeloSalaEspera modeloSala;
    public ControlPartida controlPartida;
    
    public ControlSalaEspera(){
        modeloSala = new ModeloSalaEspera();
        controlPartida = ControlPartida.getInstance();
    }
    
    public void mostrarPantalla(){
        modeloSala.mostrar();
    }
    
    public void iniciarPartida() {
        controlPartida.iniciarPartida(controlPartida);
    }
}
