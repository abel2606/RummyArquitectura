package partidaMVC;

import partidaMVC.PantallaPartida;
import componentes.FichaComponente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.itson.arquitectura.datosrummy.Color;
import org.itson.arquitectura.datosrummy.Comodin;
import org.itson.arquitectura.datosrummy.Ficha;
import org.itson.arquitectura.datosrummy.Jugador;
import org.itson.arquitectura.datosrummy.Numerica;
import org.itson.arquitectura.datosrummy.Partida;
import org.itson.arquitectura.datosrummy.TipoConjunto;
import org.itson.arquitectura.datosrummy.Turno;

/**
 *
 * @author Equipo4
 */
public class ModeloPartida implements IModeloPartida {

    private Partida partida;
    private Jugador jugador;
    private IPantalla pantalla;
    private FichaComponente fichaComponente;
    private int tamanioMazo;

    /**
     * Constructor del modelo que crea una partida
     */
    public ModeloPartida() {
        partida = Partida.getInstance();
        jugador = new Jugador();
    }

    public void iniciarPartida() {
        partida = Partida.getInstance();
        PantallaPartida pantallaPartida = new PantallaPartida(null, true);
        pantallaPartida.setVisible(true);
        generarMazo();
        repartirFichas();
        repartirTurnos();
        notify(this);
    }

    /**
     * Genera un mazo a la partida
     */
    public void generarMazo() {
        partida.setMazo(new LinkedList<>());

        for (int i = 0; i < partida.getNumeroComodines(); i++) {
            partida.addFicha(new Comodin());
        }

        TipoConjunto[] conjuntos = new TipoConjunto[4];
        conjuntos[0] = new TipoConjunto(1);
        conjuntos[1] = new TipoConjunto(2);
        conjuntos[2] = new TipoConjunto(3);
        conjuntos[3] = new TipoConjunto(4);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < partida.getRangoFichas(); j++) {
                partida.addFicha(new Numerica(j + 1, conjuntos[i]));
                partida.addFicha(new Numerica(j + 1, conjuntos[i]));
            }
        }
    }

    /**
     * Reparte las fichas a cadda jugador
     */
    public void repartirFichas() {
        Random random = new Random();
        int cantidadJugadores = partida.getJugadores().size();
        int fichasPorJugador = 14;

        // Para cada jugador se repartirán 14 fichas
        for (int i = 0; i < fichasPorJugador * cantidadJugadores; i++) {
            // Selecciona una ficha aleatoria del mazo
            int numero = random.nextInt(partida.getMazo().size());
            Ficha fichaSeleccionada = partida.getMazo().get(numero);

            // Asigna la ficha al jugador correspondiente
            Jugador jugadorActual = partida.getJugadores().get(i % cantidadJugadores);
            jugadorActual.agregarFicha(fichaSeleccionada);
            if (fichaSeleccionada instanceof Numerica numerica) {
                colorearFichas(numerica, jugadorActual.getColores());
            }

            // Remueve la ficha del mazo
            partida.getMazo().remove(numero);
        }
    }

    /**
     * Establece los colores de las fichas
     *
     * @param ficha el valor de la ficha a colorear
     * @param colores lista de los 4 colore a establecer
     */
    public void colorearFichas(Numerica ficha, List<Color> colores) {
        for (Color color : colores) {
            if (ficha.getTipoConjunto().getTipo() == color.getTipoConjunto().getTipo()) {
                ficha.setColor(color);
            }
        }
    }

    public void repartirTurnos() {
        partida.setTurnos(new LinkedList<>());

        List<Jugador> jugadores = partida.getJugadores();
        Collections.shuffle(jugadores);
        int numJugadores = jugadores.size();
        for (int i = 1; i < numJugadores; i++) {
            Jugador jugador = jugadores.get(i);
            Turno turno = new Turno(jugador, i);
            partida.anadirTurno(turno);
        }
    }

    /**
     * Regresa el mazo de fichas de la partida
     *
     * @return
     */
    public Ficha obtenerFichaMazo() {
        return partida.tomarFicha();
    }

    /**
     * Agrega una ficha al jugador
     *
     * @param jugador valor del jugador
     * @param ficha ficha a agregar
     */
    public void agregarFichaJugador(Jugador jugador, Ficha ficha) {
        jugador.agregarFicha(ficha);
        FichaComponente fichaComponente = convertirFicha(ficha);
        setFicha(fichaComponente);
        setTamanioMazo();
        notify(this);
    }

    /**
     * Regresa el componente de ficha a la vista
     *
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
     *
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
     * Nofica a la vista la actualización de los datos
     *
     * @param ficha valor de la ficha a actualizar
     */
    private void notify(IModeloPartida modelo) {
        pantalla.update(modelo);
    }

    private void setFicha(FichaComponente fichaComponente) {
        this.fichaComponente = fichaComponente;
    }

    private void setTamanioMazo() {
        this.tamanioMazo = partida.getMazo().size();
    }

    @Override
    public FichaComponente getFicha() {
        return fichaComponente;
    }

    @Override
    public int getTamanioMazo() {
        return tamanioMazo;
    }
}
