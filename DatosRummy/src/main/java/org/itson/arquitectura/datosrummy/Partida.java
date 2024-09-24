package org.itson.arquitectura.datosrummy;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Abe
 */
public class Partida {

    private List<Ficha> mazo;
//    private List<Jugador> jugadores;
    private int numeroComodines;
    private int rangoFichas;
//    private int codigo;
//    private Tablero tablero;

    public Partida(int numeroComodines, int rangoFichas) {
        this.numeroComodines = numeroComodines;
        this.rangoFichas = rangoFichas;
        generarMazo();
    }

    private void generarMazo() {
        mazo = new LinkedList<>();

        for (int i = 0; i < numeroComodines; i++) {
            mazo.add(new Comodin());
        }

        TipoConjunto[] conjuntos = new TipoConjunto[4];
        conjuntos[0] = new TipoConjunto(1);
        conjuntos[1] = new TipoConjunto(2);
        conjuntos[2] = new TipoConjunto(3);
        conjuntos[3] = new TipoConjunto(4);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < rangoFichas; j++) {
                mazo.add(new Numerica(j + 1, conjuntos[i]));
                mazo.add(new Numerica(j + 1, conjuntos[i]));
            }
        }

    }

    public Ficha tomarFicha() {
        return mazo.removeFirst();
    }

}
