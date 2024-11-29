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
import unirsePartidaMVC.ControlUnirsePartida;
import unirsePartidaMVC.ModeloUnirsePartida;

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
        
        ModeloUnirsePartida modeloUnirsePartida = ModeloUnirsePartida.getInstance();
        ControlUnirsePartida controlUnirsePartida = ControlUnirsePartida.getInstance();
        PantallaConfigurarPartida pantallaUnirsePartida = PantallaConfigurarPartida.getInstance();
        
        modeloInicio.crearParametrosMVC();
        controlInicio.crearParametrosMVC();
        pantallaInicio.crearParametrosMVC();
        
        modeloConfigurarPartida.crearParametrosMVC();
        controlConfigurarPartida.crearParametrosMVC();
        pantallaConfigurarPartida.crearParametrosMVC();
        
        modeloUnirsePartida.crearParametrosMVC();
        controlUnirsePartida.crearParametrosMVC();
        pantallaUnirsePartida.crearParametrosMVC();
    }
    
}
