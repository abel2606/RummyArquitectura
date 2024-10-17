/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccionColorMVC;

import salaEsperaMVC.ControlSalaEspera;

/**
 *
 * @author Abe
 */
public class ControlColores {
    
    private ControlSalaEspera controlSalaEspera;
    private ModeloColores modelo;
    
    public ControlColores(){
        modelo = new ModeloColores();
        controlSalaEspera = new ControlSalaEspera();
    }
    
    public void agregarColoresJugador(int[] colores){
        modelo.agregarColores(colores);
    }
    
    public void iniciarConfiguracion(String nombre, String avatar, ControlColores controlColores){
        modelo.agregarNombreYAvatar(nombre, avatar, controlColores);
    }
    
    public void continuar(){
        controlSalaEspera.mostrarPantalla();
    }
   
}
