/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaEsperaMVC;

import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaInfraestructura;
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
    private ControlSalaEspera() {
    }

    public void asignarNombreAvatarJugador(String nombre, String avatar) {
        modeloSalaEspera.asignarNombreAvatarJugador(nombre, avatar);
    }

    public void mostrarVista() {
        modeloSalaEspera.suscribirse();
        modeloSalaEspera.notificar();
    }

    public void solicitarIniciarPartida(JugadorDTO jugador) {
        modeloSalaEspera.solicitarIniciarPartida(jugador);
    }

    public void salirPartida() {

    }

    public void iniciarPartida() {

    }

    public void evaluarSolicitudUnirse(boolean respuesta) {
        try {
            infraestructura.evaluarSolicitudUnirsePartida(respuesta);
        } catch (InfraestructuraException ex) {
            modeloSalaEspera.setError("Ocurrió un error al evaluar la solicitud, intenta de nuevo más tarde.");
            notificar();
        }
    }

    public void notificarSolicitudUnirse() {

    }

    public void notificar() {

    }

    // Método público para obtener la instancia única
    public static ControlSalaEspera getInstance() {
        if (instance == null) {
            instance = new ControlSalaEspera();
        }
        return instance;
    }

    public void crearParametrosMVC() {
        modeloSalaEspera = ModeloSalaEspera.getInstance();
        infraestructura = new FachadaInfraestructura();
    }
}
