/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitectura.configurarpartida.componentesgraficos;

/**
 *
 * @author Abe
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BotonConImagen extends JButton {

    private ImageIcon imagenFondo;

    public BotonConImagen() {
        configurarBoton();
    }

    public BotonConImagen(ImageIcon imagen) {
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

