/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import inicioMVC.ControlInicio;
import inicioMVC.ModeloInicio;
import inicioMVC.PantallaInicio;
import javax.swing.JFrame;

/**
 *
 * @author ricar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PantallaInicio pantallaInicio = null;
        
        ModeloInicio modeloInicio = ModeloInicio.getInstance(pantallaInicio);
        ControlInicio controlInicio = ControlInicio.getInstance(modeloInicio, null, null);
        PantallaInicio inicio = PantallaInicio.getInstance(controlInicio);
        
    }
    
}
