/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaEsperaMVC;

/**
 *
 * @author Abe
 */
public class ModeloSalaEspera {
    private PantallaSalaEspera salaEspera;
    
    public ModeloSalaEspera(){
        
    }
    
    public void mostrar(){
        salaEspera = new PantallaSalaEspera(null, true);
        salaEspera.setVisible(true);
    }
}
