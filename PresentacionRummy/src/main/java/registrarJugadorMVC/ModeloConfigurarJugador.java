package registrarJugadorMVC;

import org.itson.arquitectura.dominiorummy.IJugador;

/**
 *
 * @author Equipo4
 */
public class ModeloConfigurarJugador {
    
    private static ModeloConfigurarJugador modelo;
    private IPantallaConfigurarJugador pantalla;

    public ModeloConfigurarJugador() {
//        pantalla = new PantallaConfigurarJugador(null, true);

    }
    
    public void crearParametrosMVC() {
        pantalla = PantallaConfigurarJugador.getInstance();
    }
    
    public void crearJugador(IJugador jugador){
        
    }

    public void mostrarVista() {
//        PantallaConfigurarJugador pantallaConfigurar = new PantallaConfigurarJugador(null, false);
//        pantallaConfigurar.setVisible(true);
        
    }

//    public Partida crearPartida(int rangoFichas, int numeroComodines) {
//        Partida partida = new Partida();
//        
//        partida.setRangoFichas(rangoFichas);
//        partida.setNumeroComodines(numeroComodines);
//        
//        return partida;
//    }
    
    public void notificar(){
        pantalla.update();
    }
    
    public static ModeloConfigurarJugador getInstance() {
        if (modelo == null) {
            modelo = new ModeloConfigurarJugador();
        }
        return modelo;
    }
}
