package pruebas;

import java.util.LinkedList;
import java.util.List;
import org.itson.arquitectura.datosrummy.Color;
import org.itson.arquitectura.datosrummy.Ficha;
import org.itson.arquitectura.datosrummy.Jugador;
import org.itson.arquitectura.datosrummy.Numerica;
import org.itson.arquitectura.datosrummy.Partida;
import org.itson.arquitectura.datosrummy.TipoConjunto;

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

        Jugador jugador = new Jugador();
        List<Color> colores = new LinkedList<>();
        colores.add(new Color("000000", new TipoConjunto(1)));
        colores.add(new Color("0014CB", new TipoConjunto(2)));
        colores.add(new Color("D40000", new TipoConjunto(3)));
        colores.add(new Color("008309", new TipoConjunto(4)));
        jugador.setColores(colores);
        
        for (Ficha ficha : jugador.getManoFichas()) {
            if (ficha instanceof Numerica) {
                for (Color color : jugador.getColores()) {
                    if (((Numerica) ficha).getTipoConjunto() == color.getTipo()){
                        ((Numerica) ficha).setColor(color);
                    }
                }
            }
        }

    }

}
