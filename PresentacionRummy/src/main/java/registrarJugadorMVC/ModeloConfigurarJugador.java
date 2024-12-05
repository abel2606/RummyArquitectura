package registrarJugadorMVC;

/**
 *
 * @author Equipo4
 */
public class ModeloConfigurarJugador implements IModeloConfigurarJugador {

    private static ModeloConfigurarJugador modelo;
    private IPantallaConfigurarJugador pantalla;
    private Boolean host;
    private String error;

    public ModeloConfigurarJugador() {
    }

    public void crearParametrosMVC() {
        pantalla = PantallaConfigurarJugador.getInstance();
    }

    public void crearJugador() {
    }

    public void setHost(boolean isHost) {
        this.host = isHost;
    }
    
    public void setError(String error) {
        this.error = error;
    }

    public void notificar() {
        pantalla.update(this);
    }

    public static ModeloConfigurarJugador getInstance() {
        if (modelo == null) {
            modelo = new ModeloConfigurarJugador();
        }
        return modelo;
    }

    @Override
    public Boolean isHost() {
        return this.host;
    }

    @Override
    public String getError() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
