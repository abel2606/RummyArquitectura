package org.itson.arquitectura.controladores;

import org.itson.arquitectura.modelos.ModeloIniciarPartida;
import org.itson.arquitectura.vistas.PantallaPartida;

/**
 *
 * @author Diego Valenzuela Parra
 */
public class ControlIniciarPartida {
    
    private ModeloIniciarPartida modelo;
    
    public void iniciarPartida(/*Aquí van parámetros de configuración de la partida*/) {
        PantallaPartida pantallaPartida = new PantallaPartida(null, true);
        modelo = new ModeloIniciarPartida(pantallaPartida);
        modelo.iniciarPartida();
        pantallaPartida.setVisible(true);
    }
}
