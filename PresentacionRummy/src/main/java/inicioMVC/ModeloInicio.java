/*
 * ModeloInicio
 */
package inicioMVC;

import org.itson.arquitecturasoftware.manejadorRespuestas.IManejadorRespuestas;
import org.itson.arquitecturasoftware.manejadorRespuestas.IOyenteManejadorRespuestas;
import org.itson.arquitecturasoftware.manejadorRespuestas.ManejadorRespuestas;

/**
 * @author Equipo4
 */
public class ModeloInicio implements IModeloInicio, IOyenteManejadorRespuestas {

    private static ModeloInicio modelo;
    private IPantallaInicio vista;

    private ManejadorRespuestas manejador;
    private Boolean isPartidaCreada;
    private String error;

    private ModeloInicio() {
    }

    public void crearParametrosMVC() {
        manejador = ManejadorRespuestas.getInstance();
        vista = PantallaInicio.getInstance();
    }

    public void notificar() {
        vista.update(this);
    }

    public static ModeloInicio getInstance() {
        if (modelo == null) {
            modelo = new ModeloInicio();
        }
        return modelo;
    }

    @Override
    public Boolean isPartidaCreada() {
        return isPartidaCreada;
    }

    @Override
    public void update(IManejadorRespuestas contexto) {
        this.isPartidaCreada = contexto.isPartidaCreada();
        notificar();
    }
        
    public void setError(String error) {
        this.error = error;
    }

    void suscribirse() {
        manejador.subscribe(this);
    }
}
