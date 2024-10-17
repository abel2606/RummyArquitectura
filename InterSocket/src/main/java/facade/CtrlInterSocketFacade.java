package facade;

import partidaMVC.ControlPartida;

/**
 *
 * @author Diego Valenzuela Parra
 */
public class CtrlInterSocketFacade {

    private ControlPartida controlPartida;
    
    public CtrlInterSocketFacade() {
        this.controlPartida = new ControlPartida();
    }
    
    public void iniciarPartida() {
        controlPartida.iniciarPartida(controlPartida);
    }
    
}
