/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Equipo4
 */
public class PanelImagen extends JPanel {

   private Image backgroundImage;

   /**
     * Constructor del panel que permite colocar imagenes de fondo
     * @param ruta ruta de la imagen de fondo
     */
    public PanelImagen(String ruta) {
        backgroundImage = new ImageIcon(getClass().getResource(ruta)).getImage();
    }

    /**
     * Pinta el componente con el fondo
     * @param g valor de los gráficos
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar la imagen de fondo
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
