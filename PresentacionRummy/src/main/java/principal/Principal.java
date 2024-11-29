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
        
        ModeloUnirsePartida modeloUnirsePartida = ModeloUnirsePartida.getInstance();
        ControlUnirsePartida controlUnirsePartida = ControlUnirsePartida.getInstance();
        PantallaConfigurarPartida pantallaUnirsePartida = PantallaConfigurarPartida.getInstance();
        
       
        ModeloConfigurarPartida modeloConfigurarPartida = ModeloConfigurarPartida.getInstance();
        ControlConfigurarPartida controlConfigurarPartida = ControlConfigurarPartida.getInstance();
        PantallaConfigurarPartida pantallaConfigurarPartida = PantallaConfigurarPartida.getInstance();
        
        ModeloInicio modeloInicio = ModeloInicio.getInstance();
        ControlInicio controlInicio = ControlInicio.getInstance();
        PantallaInicio pantallaInicio = PantallaInicio.getInstance();
        
        modeloUnirsePartida.crearParametrosMVC();
        controlUnirsePartida.crearParametrosMVC();
        pantallaUnirsePartida.crearParametrosMVC();
        
        modeloConfigurarPartida.crearParametrosMVC();
        controlConfigurarPartida.crearParametrosMVC();
        pantallaConfigurarPartida.crearParametrosMVC();
        
        modeloInicio.crearParametrosMVC();
        controlInicio.crearParametrosMVC();
        pantallaInicio.crearParametrosMVC();
    }
    
}
