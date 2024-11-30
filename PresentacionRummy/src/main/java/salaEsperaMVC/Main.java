/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salaEsperaMVC;

import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 *
 * @author Diego Valenzuela Parra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JugadorDTO jugador = new JugadorDTO("Ricardo", "");
        IPantallaSalaEspera pantalla = null;
        ModeloSalaEspera modelo = ModeloSalaEspera.getInstance(pantalla);
        ControlSalaEspera control = ControlSalaEspera.getInstance(modelo);
        pantalla = PantallaSalaEspera.getInstance(control, jugador);
        modelo.setPantalla(pantalla);
        modelo.getJugadores().add(jugador);
    }

}
