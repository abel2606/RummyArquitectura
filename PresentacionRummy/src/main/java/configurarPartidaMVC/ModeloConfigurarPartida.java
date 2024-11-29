/*
 * ModeloConfigurarPartida.java
 */
package configurarPartidaMVC;

/**
 * @author Equipo4
 */
public class ModeloConfigurarPartida {

    private static ModeloConfigurarPartida modelo;
    private IPantallaConfigurarPartida vista = PantallaConfigurarPartida3.getInstance();

    private ModeloConfigurarPartida() {
    }
    
    public void notificar() {
        vista.update();
    }
    
    public static ModeloConfigurarPartida getInstance() {
        if (modelo == null) {
            modelo = new ModeloConfigurarPartida();
        }
        return modelo;
    }

}
