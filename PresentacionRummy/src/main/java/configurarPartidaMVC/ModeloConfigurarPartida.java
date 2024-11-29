/*
 * ModeloConfigurarPartida.java
 */
package configurarPartidaMVC;

/**
 * @author Equipo4
 */public class ModeloConfigurarPartida {

    private static ModeloConfigurarPartida modelo;
    private IPantallaConfigurarPartida vista;

    private ModeloConfigurarPartida() {
    }
    
    public void crearParametrosMVC() {
        vista = PantallaConfigurarPartida.getInstance();
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
