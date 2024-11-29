/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salaEsperaMVC;

import java.util.List;
import manejadorRespuestas.IOyenteManejadorRespuestas;
import org.itson.arquitectura.aplicacionrummy.fachada.AplicacionFachada;
import org.itson.arquitectura.aplicacionrummy.fachada.IAplicacionFachada;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 *
 * @author Abe
 */
public class ModeloSalaEspera implements IModeloSalaEspera, IOyenteManejadorRespuestas {
    
    private static ModeloSalaEspera instance;
    private IPantallaSalaEspera pantallaSalaEspera;
    private List<String> nombresJugadores;
    private List<String> avataresJugadores;
    private boolean haySolicitudUnirse;
    private IAplicacionFachada aplicacionFachada = new AplicacionFachada();
    
    // Constructor privado para evitar la creación directa de objetos
    private ModeloSalaEspera() {
    }
    
    public void solicitarIniciarPartida(JugadorDTO jugador) {
//        aplicacionFachada.solicitarIniciarPartida(jugador);
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
    public static ModeloSalaEspera getInstance() {
        if (instance == null) {
            instance = new ModeloSalaEspera();
        }
        return instance;
    }

    @Override
    public List<String> getNombresJugadores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> getAvataresJugadores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean getSolicitudUnirse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
