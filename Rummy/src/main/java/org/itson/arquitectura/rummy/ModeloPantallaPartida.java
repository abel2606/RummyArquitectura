package org.itson.arquitectura.rummy;

import org.itson.arquitectura.vistas.PantallaPartida;
import componentes.FichaComponente;
import java.util.ArrayList;
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
 * @author Equipo4
 */
public class ModeloPantallaPartida {

    private Partida partida;
    private Jugador jugador;
    private PantallaPartida pantalla;

    /**
     * Constructor del modelo que crea una partida
     * @param pantalla pantantalla de la vista
     */
    public ModeloPantallaPartida(PantallaPartida pantalla) {
        partida = Partida.getInstance();
        this.pantalla = pantalla;
        jugador = new Jugador();

        List<Color> colores1 = new LinkedList<>();
        colores1.add(new Color(0x000000, new TipoConjunto(1)));
        colores1.add(new Color(0x0014CB, new TipoConjunto(2)));
        colores1.add(new Color(0xD40000, new TipoConjunto(3)));
        colores1.add(new Color(0x008309, new TipoConjunto(4)));
        jugador.setColores(colores1);

        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador);

        partida.setJugadores(jugadores);
    }

    /**
     * Regresa el mazo de fichas de la partida
     * @return 
     */
    public Ficha obtenerFichaMazo() {
        return partida.tomarFicha();
    }

    /**
     * Agrega una ficha al jugador
     * @param jugador valor del jugador
     * @param ficha ficha a agregar
     */
    public void agregarFichaJugador(Jugador jugador, Ficha ficha) {
        jugador.agregarFicha(ficha);
        FichaComponente fichaComponente = convertirFicha(ficha);
        notify(fichaComponente);
    }

    /**
     * Regresa el componente de ficha a la vista
     * @param ficha ficha a crear
     * @return regresa el componente de la ficha creada
     */
    public FichaComponente convertirFicha(Ficha ficha) {
        if (ficha instanceof Numerica numerica) {
            colorearFicha(numerica);
            int numero = numerica.getNumero();
            int color = numerica.getColor().getCodigoHex();
            FichaComponente fichaComponente = new FichaComponente(numero, color);
            return fichaComponente;
        }
        return null;
    }

    /**
     * Agrega el color a la ficha
     * @param ficha ficha a dibujar color
     */
    public void colorearFicha(Numerica ficha) {
        for (Color color : jugador.getColores()) {
            if (ficha.getTipoConjunto().getTipo() == color.getTipoConjunto().getTipo()) {
                ficha.setColor(color);
            }
        }
    }
    
    /**
     * Obtiene el tamaño del mazo
     * @return valor de la cantidad de fichas del mazo
     */
    public int obtenerTamanioMazo(){
        return partida.getMazo().size();
    }

    /**
     * Nofica a la vista la actualización de los datos
     * @param ficha valor de la ficha a actualizar
     */
    private void notify(FichaComponente ficha) {
        pantalla.update(pantalla.getGraphics(), ficha);
        pantalla.modificarTamanioMazo(obtenerTamanioMazo());
    }
}
