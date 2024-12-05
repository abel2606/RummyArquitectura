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
import seleccionColorMVC.ControlColores;
import seleccionColorMVC.ModeloColores;
import seleccionColorMVC.PantallaSeleccionarColor;
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

        ModeloColores modeloColores = ModeloColores.getInstance();
        ControlColores controlColores = ControlColores.getInstance();
        PantallaSeleccionarColor pantallaColores = PantallaSeleccionarColor.getInstance();

        ModeloConfigurarJugador modeloConfigurarJugador = ModeloConfigurarJugador.getInstance();
        ControlConfigurarJugador controlConfigurarJugador = ControlConfigurarJugador.getInstance();
        PantallaConfigurarJugador pantallaConfigurarJugador = PantallaConfigurarJugador.getInstance();

        ModeloConfigurarPartida modeloConfigurarPartida = ModeloConfigurarPartida.getInstance();
        ControlConfigurarPartida controlConfigurarPartida = ControlConfigurarPartida.getInstance();
        PantallaConfigurarPartida pantallaConfigurarPartida = PantallaConfigurarPartida.getInstance();

        ModeloUnirsePartida modeloUnirsePartida = ModeloUnirsePartida.getInstance();
        ControlUnirsePartida controlUnirsePartida = ControlUnirsePartida.getInstance();
        PantallaUnirsePartida pantallaUnirsePartida = PantallaUnirsePartida.getInstance();

        ModeloInicio modeloInicio = ModeloInicio.getInstance();
        ControlInicio controlInicio = ControlInicio.getInstance();
        PantallaInicio pantallaInicio = PantallaInicio.getInstance();

        modeloInicio.crearParametrosMVC();
        controlInicio.crearParametrosMVC();
        pantallaInicio.crearParametrosMVC();

        modeloConfigurarPartida.crearParametrosMVC();
        controlConfigurarPartida.crearParametrosMVC();
        pantallaConfigurarPartida.crearParametrosMVC();

        modeloUnirsePartida.crearParametrosMVC();
        controlUnirsePartida.crearParametrosMVC();
        pantallaUnirsePartida.crearParametrosMVC();

        modeloConfigurarJugador.crearParametrosMVC();
        controlConfigurarJugador.crearParametrosMVC();
        pantallaConfigurarJugador.crearParametrosMVC();

        modeloColores.crearParametrosMVC();
        controlColores.crearParametrosMVC();
        pantallaColores.crearParametrosMVC();
    }

}
