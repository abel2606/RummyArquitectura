package org.itson.arquitectura.controladores;

import org.itson.arquitectura.modelos.ModeloIniciarPartida;
import partidaMVC.PantallaPartida;

/**
 *
 * @author Diego Valenzuela Parra
 */
public class ControlIniciarPartida {
    
    private ModeloIniciarPartida modelo;

    public ControlIniciarPartida() {
        this.modelo = new ModeloIniciarPartida();
    }
    
    public void iniciarPartida(/*Aquí van parámetros de configuración de la partida*/) {
        modelo.mostrarVista();
        modelo.iniciarPartida();
    }
}
