package pruebas;

import org.itson.arquitectura.dominiorummy.Color;
import org.itson.arquitectura.dominiorummy.GrupoFichas;
import org.itson.arquitectura.dominiorummy.Numerica;
import org.itson.arquitectura.dominiorummy.NumeroConjuntoFichas;
import org.itson.arquitectura.dominiorummy.Secuencia;

/**
 * @author Equipo4
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        NumeroConjuntoFichas conjunto1 = new NumeroConjuntoFichas(1);
//        Color color1 = new Color("BAB400", conjunto1);
//
//        Ficha ficha1 = new Numerica(10, conjunto1, color1);
//
//        Jugador jugador = new Jugador("imnotrichi", "path");
//        jugador.agregarFicha(ficha1);
//
//        Ficha fichaObtenida = jugador.obtenerFicha();
//
//        System.out.println(((Numerica) fichaObtenida).getNumero());
//        
//        Partida partida = new Partida(2, 13);
//        
//        partida.agregarJugador(new Jugador("licoreeee", "Path"));
//        partida.agregarJugador(new Jugador("bortcrab", "Path"));
//        partida.agregarJugador(new Jugador("abel_san", "Path"));
//        partida.agregarJugador(new Jugador("madero_jl", "Path"));
//        
//        boolean resultado = partida.agregarJugador(jugador);
//        
//        System.out.println(resultado + ", " + partida.getCodigo());
//        Partida partida = new Partida(2, 13);
//
//        partida.agregarJugador(new Jugador("licoreeee", "Path"));
//        partida.agregarJugador(new Jugador("imnotrichi", "Path"));
//
//        partida.iniciarPartida();
//
//        List<Ficha> mazo = partida.getMazo();
//        
//        GrupoFichas grupo = new Numero();
//        
//        for (int i = 0; i < mazo.size(); i++) {
//            Ficha ficha = mazo.get(i);
//
//            System.out.println(ficha.toString());
//        }
//        GrupoFichas grupoNumero = new Numero();
//        
//        grupoNumero.agregarFicha(new Numerica(7, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2))));
//        System.out.println(grupoNumero.agregarFicha(new Numerica(7, new NumeroConjuntoFichas(1), new Color("0014CB", new NumeroConjuntoFichas(1)))));
//        System.out.println(grupoNumero.agregarFicha(new Numerica(7, new NumeroConjuntoFichas(3), new Color("D40000", new NumeroConjuntoFichas(3)))));
//        System.out.println(grupoNumero.agregarFicha(new Numerica(7, new NumeroConjuntoFichas(4), new Color("008309", new NumeroConjuntoFichas(4)))));
        GrupoFichas grupoSecuencia = new Secuencia(10);

        grupoSecuencia.agregarFicha(new Numerica(1, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2))));
        grupoSecuencia.agregarFicha(new Numerica(2, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2))));
        grupoSecuencia.agregarFicha(new Numerica(3, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2))));
        grupoSecuencia.agregarFicha(new Numerica(4, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2))));
        grupoSecuencia.agregarFicha(new Numerica(5, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2))));
        grupoSecuencia.agregarFicha(new Numerica(6, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2))));
        grupoSecuencia.agregarFicha(new Numerica(7, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2))));
        grupoSecuencia.agregarFicha(new Numerica(8, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2))));
        grupoSecuencia.agregarFicha(new Numerica(9, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2))));
        System.out.println(grupoSecuencia.agregarFicha(new Numerica(10, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2)))));
        System.out.println(grupoSecuencia.agregarFicha(new Numerica(11, new NumeroConjuntoFichas(2), new Color("000000", new NumeroConjuntoFichas(2)))));
    }

}
