/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unirsePartidaMVC;

/**
 *
 * @author Dell
 */
public class ControlUnirsePartida {

    private static ControlUnirsePartida control;
    
    private ControlUnirsePartida() {
        
    }
    
    public void verificarCodigoPartida(String codigo){
        
    }
    
    public void enviarSolicitudNuevoJugador(){
        
    }
    
    public void siguientePantalla(){
        
    }
    
    public static ControlUnirsePartida getInstance() {
        if (control == null) {
            control = new ControlUnirsePartida();
        }
        return control;
    }
    
}
