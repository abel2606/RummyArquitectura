/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaEsperaMVC;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.arquitecturasoftware.manejadorRespuestas.IOyenteManejadorRespuestas;
import org.itson.arquitectura.aplicacionrummy.fachada.AplicacionFachada;
import org.itson.arquitectura.aplicacionrummy.fachada.IAplicacionFachada;
import org.itson.arquitectura.dominiorummy.Jugador;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;
import org.itson.arquitecturasoftware.infraestructurarummy.excepciones.InfraestructuraException;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.FachadaInfraestructura;
import org.itson.arquitecturasoftware.infraestructurarummy.subsistemasocket.IFachadaInfraestructura;

/**
 *
 * @author Abe
 */
public class ModeloSalaEspera implements IModeloSalaEspera, IOyenteManejadorRespuestas {

    private static ModeloSalaEspera instance;
    private IPantallaSalaEspera pantallaSalaEspera;
    private List<JugadorDTO> jugadores = new ArrayList<>();
    private boolean haySolicitudUnirse;
    private IAplicacionFachada aplicacionFachada = new AplicacionFachada();
    private IFachadaInfraestructura infraestructura = new FachadaInfraestructura();

    // Constructor privado para evitar la creación directa de objetos
    private ModeloSalaEspera(IPantallaSalaEspera pantallaSalaEspera) {
        this.pantallaSalaEspera = pantallaSalaEspera;
    }

    public void solicitarIniciarPartida(JugadorDTO jugadorDTO) {
        // Crear una nueva instancia con el estado actualizado
        JugadorDTO nuevoJugadorDTO = new JugadorDTO(
                jugadorDTO.getNombre(),
                jugadorDTO.getAvatar(),
                !jugadorDTO.isListoParaJugar());

        Jugador jugador = new Jugador(nuevoJugadorDTO.getNombre(), nuevoJugadorDTO.getAvatar());
        jugador.setIsListo(nuevoJugadorDTO.isListoParaJugar());

        jugadorDTO.setListoParaJugar(aplicacionFachada.solicitarIniciarPartida(jugador));
        try {
            infraestructura.solicitarInicioPartida(nuevoJugadorDTO);
        } catch (InfraestructuraException ex) {
            Logger.getLogger(ModeloSalaEspera.class.getName()).log(Level.SEVERE, null, ex);
        }
        notificar();
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
        pantallaSalaEspera.update(this);
    }

    // Método público para obtener la instancia única
    public static ModeloSalaEspera getInstance(IPantallaSalaEspera pantalla) {
        if (instance == null) {
            instance = new ModeloSalaEspera(pantalla);
        }
        return instance;
    }

    @Override
    public List<JugadorDTO> getJugadores() {
        return this.jugadores;
    }

    @Override
    public boolean getSolicitudUnirse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setPantalla(IPantallaSalaEspera pantalla) {
        this.pantallaSalaEspera = pantalla;
    }
}
