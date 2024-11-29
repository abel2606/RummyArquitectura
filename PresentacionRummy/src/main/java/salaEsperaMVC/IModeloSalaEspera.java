/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package salaEsperaMVC;

import java.util.List;

/**
 *
 * @author Diego Valenzuela Parra
 */
public interface IModeloSalaEspera {
    public List<String> getNombresJugadores();
    public List<String> getAvataresJugadores();
    public boolean getSolicitudUnirse();
}
