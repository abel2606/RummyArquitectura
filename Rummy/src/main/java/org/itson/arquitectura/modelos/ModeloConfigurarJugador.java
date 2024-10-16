/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitectura.modelos;

import org.itson.arquitectura.vistas.PantallaDatosJugador;

/**
 *
 * @author ricar
 */
public class ModeloConfigurarJugador {

    private PantallaDatosJugador vista;
    
    public ModeloConfigurarJugador() {
        vista = new PantallaDatosJugador(new javax.swing.JFrame(), true);
    }
    
    public void mostrarVista() {
        vista.setVisible(true);
    }

}
