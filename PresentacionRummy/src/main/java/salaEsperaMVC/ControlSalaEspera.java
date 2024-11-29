/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaEsperaMVC;

import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.IFachadaInfraestructura;
import partidaMVC.ControlPartida;

/**
 *
 * @author Abe
 */
public class ControlSalaEspera {

    private static ControlSalaEspera instance;
    private IFachadaInfraestructura infraestructura;
    private ControlPartida partida;
    public ModeloSalaEspera modeloSalaEspera;

    // Constructor privado para evitar la creación directa de objetos
    private ControlSalaEspera(ModeloSalaEspera modeloSalaEspera) {
        this.modeloSalaEspera = modeloSalaEspera;
    }

    public void mostrarVista() {
//        modeloSala.mostrar();
    }

    public void solicitarIniciarPartida(JugadorDTO jugador) {
        modeloSalaEspera.solicitarIniciarPartida(jugador);
    }

    public void salirPartida() {

    }

    public void iniciarPartida() {

    }

    public void evaluarSolicitudUnirse(boolean respuesta) {

    }

    public void notificarSolicitudUnirse() {

    }

    public void notificar() {

    }

    // Método público para obtener la instancia única
    public static ControlSalaEspera getInstance(ModeloSalaEspera modeloSalaEspera) {
        if (instance == null) {
            instance = new ControlSalaEspera(modeloSalaEspera);
        }
        return instance;
    }
}
