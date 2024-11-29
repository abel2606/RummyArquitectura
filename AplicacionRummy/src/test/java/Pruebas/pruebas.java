/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import org.itson.arquitectura.aplicacionrummy.fachada.AplicacionFachada;
import org.itson.arquitectura.aplicacionrummy.fachada.IAplicacionFachada;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Partida;

/**
 *
 * @author Abe
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IAplicacionFachada aplicacion = new AplicacionFachada();

        int rango = 12;
        int numComodines = 3;

        IPartida partida = Partida.getInstance(numComodines, rango);
        aplicacion.configurarPartida(partida);
        
    }

}
