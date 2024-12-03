/*
 * Principal.java
 */
package principal;

import configurarPartidaMVC.ControlConfigurarPartida;
import configurarPartidaMVC.ModeloConfigurarPartida;
import configurarPartidaMVC.PantallaConfigurarPartida;
import inicioMVC.ControlInicio;
import inicioMVC.ModeloInicio;
import inicioMVC.PantallaInicio;
import registrarJugadorMVC.ControlConfigurarJugador;
import registrarJugadorMVC.ModeloConfigurarJugador;
import registrarJugadorMVC.PantallaConfigurarJugador;
import unirsePartidaMVC.ControlUnirsePartida;
import unirsePartidaMVC.ModeloUnirsePartida;
import unirsePartidaMVC.PantallaUnirsePartida;

/**
 *
 * @author Equipo4
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ModeloInicio modeloInicio = ModeloInicio.getInstance();
        ControlInicio controlInicio = ControlInicio.getInstance();
        PantallaInicio pantallaInicio = PantallaInicio.getInstance();
        
        ModeloConfigurarPartida modeloConfigurarPartida = ModeloConfigurarPartida.getInstance();
        ControlConfigurarPartida controlConfigurarPartida = ControlConfigurarPartida.getInstance();
        PantallaConfigurarPartida pantallaConfigurarPartida = PantallaConfigurarPartida.getInstance();
        
        ModeloConfigurarJugador modeloConfigurarJugador = ModeloConfigurarJugador.getInstance();
        ControlConfigurarJugador controlConfigurarJugador = ControlConfigurarJugador.getInstance();
        PantallaConfigurarJugador pantallaConfigurarJugador = PantallaConfigurarJugador.getInstance();
        
        ModeloUnirsePartida modeloUnirsePartida = ModeloUnirsePartida.getInstance();
        ControlUnirsePartida controlUnirsePartida = ControlUnirsePartida.getInstance();
        PantallaUnirsePartida pantallaUnirsePartida = PantallaUnirsePartida.getInstance();
        
        modeloInicio.crearParametrosMVC();
        controlInicio.crearParametrosMVC();
        pantallaInicio.crearParametrosMVC();
        
        modeloConfigurarPartida.crearParametrosMVC();
        controlConfigurarPartida.crearParametrosMVC();
        pantallaConfigurarPartida.crearParametrosMVC();
        
        modeloConfigurarJugador.crearParametrosMVC();
        controlConfigurarJugador.crearParametrosMVC();
        pantallaConfigurarJugador.crearParametrosMVC();
        
        modeloUnirsePartida.crearParametrosMVC();
        controlUnirsePartida.crearParametrosMVC();
        pantallaUnirsePartida.crearParametrosMVC();
    }
    
}
