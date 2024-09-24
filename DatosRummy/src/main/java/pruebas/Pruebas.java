package pruebas;

import org.itson.arquitectura.datosrummy.Ficha;
import org.itson.arquitectura.datosrummy.Numerica;
import org.itson.arquitectura.datosrummy.Partida;

/**
 *
 * @author ricar
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Partida partida = new Partida(2, 13);
        
        Ficha ficha = partida.tomarFicha();
        
        if (ficha instanceof Numerica) {
            System.out.println("Numerica");
        } else {
            System.out.println("Comodin");
        }
    }

}
