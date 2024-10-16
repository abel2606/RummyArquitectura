/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.arquitectura.vistas;

import org.itson.arquitectura.controladores.ControlIniciarPartida;

/**
 *
 * @author Familia
 */
public class NewMain {

    /**
     * ESTA CLASE MAIN ES PARA PRUEBAS, NOMÁS COMO PARA SIMULAR UNA PARTIDA Y
     * QUE TODO EL SETUP FUNCIONA BIEN. LUEGO LA PODEMOS BORRAR.
     */
    public static void main(String[] args) {
        ControlIniciarPartida c = new ControlIniciarPartida();
        c.iniciarPartida();
    }

}
