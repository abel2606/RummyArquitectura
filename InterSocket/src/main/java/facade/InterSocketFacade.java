package facade;

/**
 *
 * @author Diego Valenzuela Parra
 */
public class InterSocketFacade implements IInterSocketFacade{

    private CtrlInterSocketFacade ctrlInterSocketFacade;

    public InterSocketFacade() {
        this.ctrlInterSocketFacade = new CtrlInterSocketFacade();
    }
    
    @Override
    public void aceptarInicio() {
        ctrlInterSocketFacade.iniciarPartida();
    }
    
}
