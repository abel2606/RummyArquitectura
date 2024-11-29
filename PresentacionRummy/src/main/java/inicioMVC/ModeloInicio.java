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

    private ModeloInicio(PantallaInicio pantalla) {
        this.pantalla = pantalla;
    }

    public void notificar() {
        pantalla.update();
    }

    public static ModeloInicio getInstance(PantallaInicio pantalla) {
        if (modelo == null) {
            modelo = new ModeloInicio(pantalla);
        }
        return modelo;
    }
}
