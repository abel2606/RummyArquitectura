/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package partidaMVC;

import componentes.FichaComponente;
import java.util.List;

/**
 *
 * @author Diego Valenzuela Parra
 */
public interface IModelo {
    public FichaComponente getFicha();
    public List<String> getAvatares();
    public List<String> getNombreJugadores();
    
}
