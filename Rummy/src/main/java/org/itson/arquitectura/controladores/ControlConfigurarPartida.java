/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitectura.controladores;

import com.mycompany.rummydtos.ConfiguracionPartidaDTO;

/**
 *
 * @author ricar
 */
public class ControlConfigurarPartida {

    private ControlConfigurarJugador otroControl;

    public ControlConfigurarPartida() {
        otroControl = new ControlConfigurarJugador();
    }

    public void continuarConfiguracion(ConfiguracionPartidaDTO configuracion) {
        otroControl.iniciarConfiguracion(configuracion);
    }
}
