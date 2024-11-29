/*
 * ModeloUnirsePartida.java
 */
package unirsePartidaMVC;

/**
 * @author Equipo4
 */
public class ModeloUnirsePartida implements IModeloUnirsePartida {

    private static ModeloUnirsePartida modelo;
    private IPantallaUnirsePartida pantalla;

    private String error;

    private ModeloUnirsePartida() {
    }

    public void crearParametrosMVC() {
        pantalla = PantallaUnirsePartida.getInstance();
    }

    public void notificar(String error) {
        pantalla.update(this);
    }

    public static ModeloUnirsePartida getInstance() {
        if (modelo == null) {
            modelo = new ModeloUnirsePartida();
        }
        return modelo;
    }

    @Override
    public String getError() {
        return error;
    }
}
