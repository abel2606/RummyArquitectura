/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccionColorMVC;

/**
 *
 * @author Abe
 */
public class ModeloColores implements IModeloColores {
    public PantallaSeleccionColor pantalla;
    private String nombre;
    private String avatar;
    
    public ModeloColores(){
        pantalla = new PantallaSeleccionColor(null, true);
    }
    
    public void crearJugador(String nombre, String avatar){
        
    }
    
    public void notificar(){
        
    }
    
    public void agregarColores(String[] colores){
        
    }

    public void agregarJugadorPartida(){
        
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getAvatar() {
        return this.avatar;
    }
}
