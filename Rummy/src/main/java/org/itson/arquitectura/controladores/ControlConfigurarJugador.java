/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitectura.controladores;

import com.mycompany.rummydtos.ConfiguracionPartidaDTO;
import org.itson.arquitectura.modelos.ModeloConfigurarJugador;

/**
 *
 * @author ricar
 */
public class ControlConfigurarJugador {
    
    private ModeloConfigurarJugador modelo;
    
    public ControlConfigurarJugador() {
        modelo = new ModeloConfigurarJugador();
    }
    
    public void iniciarConfiguracion(ConfiguracionPartidaDTO configuracion) {
        modelo.mostrarVista();
    }
    
}
