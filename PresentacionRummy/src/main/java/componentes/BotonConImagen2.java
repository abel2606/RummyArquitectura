/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

/**
 *
 * @author Abe
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BotonConImagen2 extends JButton {

    private ImageIcon imagenFondo;

    public BotonConImagen2() {
        configurarBoton();
    }

    public BotonConImagen2(ImageIcon imagen) {
        this.imagenFondo = imagen;
        configurarBoton();
    }

    private void configurarBoton() {
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false); 
        setLayout(null);
    }

    public void setImagenFondo(ImageIcon imagen) {
        this.imagenFondo = imagen;
        repaint(); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (imagenFondo != null) {
            g.drawImage(imagenFondo.getImage(), 0, 0, getWidth(), getHeight(), this);
        }
        super.paintComponent(g);
    }
}

