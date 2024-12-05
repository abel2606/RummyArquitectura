/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package salaEsperaMVC;

import java.util.List;
import org.itson.arquitecturasoftware.dtorummy.dto.JugadorDTO;

/**
 *
 * @author Diego Valenzuela Parra
 */
public interface IModeloSalaEspera {
    public List<JugadorDTO> getJugadores();
    public JugadorDTO getJugador();
    public boolean getSolicitudUnirse();
}
