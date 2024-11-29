/*
 * ModeloInicio
 */
package inicioMVC;

/**
 *
 * @author ricar
 */
public class ModeloInicio {

    private static ModeloInicio modelo;
    private IPantallaInicio pantalla;

    private ModeloInicio() {
    }
    
    public void crearParametrosMVC() {
        pantalla = PantallaInicio.getInstance();
    }

    public void notificar() {
        pantalla.update();
    }

    public static ModeloInicio getInstance() {
        if (modelo == null) {
            modelo = new ModeloInicio();
        }
        return modelo;
    }
}
