/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaEsperaMVC;

/**
 *
 * @author Abe
 */
public class ControlSalaEspera {
    public ModeloSalaEspera modeloSala;
    
    public ControlSalaEspera(){
        modeloSala = new ModeloSalaEspera();
    }
    
    public void mostrarPantalla(){
        modeloSala.mostrar();
    }
}
