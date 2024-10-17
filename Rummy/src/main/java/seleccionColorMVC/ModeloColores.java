/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccionColorMVC;

import java.util.ArrayList;
import java.util.List;
import org.itson.arquitectura.datosrummy.Color;
import org.itson.arquitectura.datosrummy.Jugador;
import org.itson.arquitectura.datosrummy.TipoConjunto;

/**
 *
 * @author Abe
 */
public class ModeloColores {

    private Jugador jugador;

    public PantallaSeleccionColor pantalla;

    public ModeloColores() {
    }

    public void agregarColores(int[] colores) {
        List<Color> listaColores = new ArrayList<>();
        for (int i = 1; i < colores.length; i++) {
            listaColores.add(new Color(colores[i], new TipoConjunto(i)));
        }
        jugador.setColores(listaColores);
        siguientePantalla();
    }

    public void mostrarPantalla(ControlColores controlColores) {
        pantalla = new PantallaSeleccionColor(null, true, controlColores);
        this.pantalla.setVisible(true);
    }

    public void agregarNombreYAvatar(String nombre, String avatar, ControlColores controlColores) {
        jugador = new Jugador();
        jugador.setNombre(nombre);
        jugador.setAvatar(avatar);
        mostrarPantalla(controlColores);
    }

    public void siguientePantalla() {
        pantalla.continuarFlujo();
    }
}
