/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrarJugadorMVC;

import seleccionColorMVC.ControlColores;

/**
 *
 * @author Abe
 */
public class ControlConfigurarJugador {

    private ControlColores controlColores;

    public ControlConfigurarJugador() {
        this.controlColores = new ControlColores();
    }

    void continuarConfiguracion(String nombreUsuario, String rutaAvatar) {
        controlColores.iniciarConfiguracion(nombreUsuario, rutaAvatar, controlColores);
    }
    
}
