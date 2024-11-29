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

/**
 *
 * @author Equipo4
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ModeloConfigurarPartida modeloConfigurarPartida = ModeloConfigurarPartida.getInstance();
        ControlConfigurarPartida controlConfigurarPartida = ControlConfigurarPartida.getInstance();
        PantallaConfigurarPartida pantallaConfigurarPartida = PantallaConfigurarPartida.getInstance();
        
        ModeloInicio modeloInicio = ModeloInicio.getInstance();
        ControlInicio controlInicio = ControlInicio.getInstance();
        PantallaInicio pantallaInicio = PantallaInicio.getInstance();
        
        modeloConfigurarPartida.crearParametrosMVC();
        controlConfigurarPartida.crearParametrosMVC();
        pantallaConfigurarPartida.crearParametrosMVC();
        
        modeloInicio.crearParametrosMVC();
        controlInicio.crearParametrosMVC();
        pantallaInicio.crearParametrosMVC();
    }
    
}
