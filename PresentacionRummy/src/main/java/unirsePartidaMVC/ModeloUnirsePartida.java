/*
 * ModeloUnirsePartida.java
 */
package unirsePartidaMVC;

import org.itson.arquitecturasoftware.manejadorRespuestas.IManejadorRespuestas;
import org.itson.arquitecturasoftware.manejadorRespuestas.IOyenteManejadorRespuestas;
import org.itson.arquitecturasoftware.manejadorRespuestas.ManejadorRespuestas;

/**
 * @author Equipo4
 */
public class ModeloUnirsePartida implements IModeloUnirsePartida, IOyenteManejadorRespuestas { 

    private static ModeloUnirsePartida modelo;
    private IPantallaUnirsePartida pantalla;
    private ManejadorRespuestas manejador;
    
    private String error;
    private boolean solicitudUnirseEvaluada;

    private ModeloUnirsePartida() {
    }

    public void crearParametrosMVC() {
        pantalla = PantallaUnirsePartida.getInstance();
    }

    public void notificar() {
        manejador = ManejadorRespuestas.getInstance();
        pantalla.update(this);
    }

    public static ModeloUnirsePartida getInstance() {
        if (modelo == null) {
            modelo = new ModeloUnirsePartida();
        }
        return modelo;
    }
    
    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String getError() {
        return error;
    }

    @Override
    public boolean getSolicitudUnirseEvaluada() {
        return solicitudUnirseEvaluada;
    }

    @Override
    public void update(IManejadorRespuestas contexto) {
        this.solicitudUnirseEvaluada = contexto.getSolicitudUnirseEvaluada();
        notificar();
    }
    
    
}
