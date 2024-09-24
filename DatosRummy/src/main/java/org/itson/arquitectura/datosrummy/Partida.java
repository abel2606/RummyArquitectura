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

        TipoConjunto conjunto = new TipoConjunto();
        for (int i = 0; i < 4; i++) {
            conjunto.setTipo(i+1);
            for (int j = 0; j < rangoFichas; j++) {
                mazo.add(new Numerica(j + 1, conjunto));
                mazo.add(new Numerica(j + 1, conjunto));
            }
        }
        
    }

    public Ficha tomarFicha() {
        return mazo.getFirst();
    }

}
