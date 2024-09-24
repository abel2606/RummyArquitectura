package org.itson.arquitectura.rummy;

import componentes.FichaComponente;
import java.util.ArrayList;
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

/**
 *
 * @author ricar
 */
public class ModeloAuxiliar {
    
    private Partida partida;
    private PantallaPartida pantalla;

    public ModeloAuxiliar(PantallaPartida pantalla) {
        partida = Partida.getInstance();
        this.pantalla = pantalla;
    }
    
    public Jugador getJugadorActual(){
        return partida.getJugadores().getFirst();
    }
    
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
    
    public void anadirJugadores(){
        Jugador jugador1 = new Jugador();
        List<Color> colores1 = new LinkedList<>();
        colores1.add(new Color(0x000000, new TipoConjunto(1)));
        colores1.add(new Color(0x0014CB, new TipoConjunto(2)));
        colores1.add(new Color(0xD40000, new TipoConjunto(3)));
        colores1.add(new Color(0x008309, new TipoConjunto(4)));
        jugador1.setColores(colores1);
        
        Jugador jugador2 = new Jugador();
        List<Color> colores2 = new LinkedList<>();
        colores2.add(new Color(0x000000, new TipoConjunto(1)));
        colores2.add(new Color(0x0014CB, new TipoConjunto(2)));
        colores2.add(new Color(0xD40000, new TipoConjunto(3)));
        colores2.add(new Color(0x008309, new TipoConjunto(4)));
        jugador2.setColores(colores2);
        
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        
        partida.setJugadores(jugadores);
    }

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
                colorearFicha(numerica, jugadorActual.getColores());
            }

            // Remueve la ficha del mazo
            partida.getMazo().remove(numero);
            
            pantalla.modificarTamanioMazo(partida.getMazo().size());
        }
    }

    public void colorearFicha(Numerica ficha, List<Color> colores) {
        for (Color color : colores) {
            if (ficha.getTipoConjunto().getTipo() == color.getTipoConjunto().getTipo()) {
                ficha.setColor(color);
            }
        }
    }

    void dibujarMano() {
        List<Ficha> fichas = partida.getJugadores().getFirst().getManoFichas();
        for (Ficha ficha : fichas) {
            FichaComponente fichaComponente = convertirFicha(ficha);
            pantalla.update(pantalla.getGraphics(), fichaComponente);
        }
    }
    
    public FichaComponente convertirFicha(Ficha ficha) {
        if (ficha instanceof Numerica numerica) {
            int numero = numerica.getNumero();
            int color = numerica.getColor().getCodigoHex();
            FichaComponente fichaComponente = new FichaComponente(numero, color);
            return fichaComponente;
        }
        return null;
    }
}
