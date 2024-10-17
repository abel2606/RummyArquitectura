/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrarJugadorMVC;

import org.itson.arquitectura.datosrummy.Partida;

/**
 *
 * @author Abe
 */
public class ModeloConfigurarJugador {

    PantallaConfigurarJugador pantalla;

    public ModeloConfigurarJugador() {
        pantalla = new PantallaConfigurarJugador(null, true);

    }

    public void mostrarVista() {
        PantallaConfigurarJugador pantallaConfigurar = new PantallaConfigurarJugador(null, false);
        pantallaConfigurar.setVisible(true);
        
    }

    public Partida crearPartida(int rangoFichas, int numeroComodines) {
        Partida partida = new Partida();
        
        partida.setRangoFichas(rangoFichas);
        partida.setNumeroComodines(numeroComodines);
        
        return partida;
    }
}
