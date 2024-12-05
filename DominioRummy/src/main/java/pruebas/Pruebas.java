package pruebas;

import java.util.ArrayList;
import java.util.List;
import org.itson.arquitectura.dominiorummy.Color;
import org.itson.arquitectura.dominiorummy.Comodin;
import org.itson.arquitectura.dominiorummy.Ficha;
import org.itson.arquitectura.dominiorummy.GrupoFichas;
import org.itson.arquitectura.dominiorummy.Numerica;
import org.itson.arquitectura.dominiorummy.Partida;
import org.itson.arquitectura.dominiorummy.TipoConjunto;
import org.itson.arquitectura.dominiorummy.Secuencia;
import org.itson.arquitectura.dominiorummy.fachada.DominioFachada;
import org.itson.arquitectura.dominiorummy.fachada.IDominioFachada;

/**
 * @author Equipo4
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        TipoConjunto conjunto1 = new TipoConjunto(1);
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
//        Ficha numerica1 = new Numerica(7, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2)));
//        Ficha numerica2 = new Numerica(8, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2)));
//        Ficha numerica3 = new Numerica(9, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2)));
//        List<Ficha> fichas = new ArrayList<>();
//        fichas.add(numerica1);
//        fichas.add(numerica2);
//        fichas.add(numerica3);
//        
//        
//        GrupoFichas grupoNumero = GrupoFichas.crearGrupo(fichas, 13);
//        System.out.println(grupoNumero.toString());
//        
//        
//            Ficha comodin = new Comodin();
//            if(grupoNumero.agregarFicha(comodin)){
//                System.out.println(grupoNumero.toString());
//            }
//            else{
//                System.out.println("No se puede añadir el comodin");
//            }
//        
//        System.out.println(grupoNumero.agregarFicha(new Numerica(7, new TipoConjunto(1), new Color("0014CB", new TipoConjunto(1)))));
//        System.out.println(grupoNumero.agregarFicha(new Numerica(7, new TipoConjunto(3), new Color("D40000", new TipoConjunto(3)))));
//        System.out.println(grupoNumero.agregarFicha(new Numerica(7, new TipoConjunto(4), new Color("008309", new TipoConjunto(4)))));
//        GrupoFichas grupoSecuencia = new Secuencia(0);
//
//        grupoSecuencia.agregarFicha(new Numerica(1, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2))));
//        grupoSecuencia.agregarFicha(new Numerica(2, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2))));
//        grupoSecuencia.agregarFicha(new Numerica(3, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2))));
//        grupoSecuencia.agregarFicha(new Numerica(4, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2))));
//        grupoSecuencia.agregarFicha(new Numerica(5, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2))));
//        grupoSecuencia.agregarFicha(new Numerica(6, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2))));
//        grupoSecuencia.agregarFicha(new Numerica(7, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2))));
//        grupoSecuencia.agregarFicha(new Numerica(8, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2))));
//        grupoSecuencia.agregarFicha(new Numerica(9, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2))));
//        System.out.println(grupoSecuencia.agregarFicha(new Numerica(10, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2)))));
//        System.out.println(grupoSecuencia.agregarFicha(new Numerica(11, new TipoConjunto(2), new Color(0x000000, new TipoConjunto(2)))));


        IDominioFachada dominio = new DominioFachada(2, 10);
        
        Partida.getInstance().iniciarPartida();
        
        System.out.println(Partida.getInstance().isIniciada());


    }

}
