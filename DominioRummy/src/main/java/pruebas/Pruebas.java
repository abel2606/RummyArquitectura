package pruebas;

import java.util.List;
import org.itson.arquitectura.dominiorummy.Ficha;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitectura.dominiorummy.Partida;

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

        Partida partida = new Partida(2, 13);
        
        partida.agregarJugador(new Jugador("licoreeee", "Path"));
        partida.agregarJugador(new Jugador("imnotrichi", "Path"));
        
        partida.iniciarPartida();
        
        List<Ficha> mazo = partida.getMazo();

        for (int i = 0; i < mazo.size(); i++) {
            Ficha ficha = mazo.get(i);
            
            System.out.println(ficha.toString());
        }
    }

}
