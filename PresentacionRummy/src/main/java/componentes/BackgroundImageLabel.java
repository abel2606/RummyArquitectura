package componentes;

import javax.swing.*;
import java.awt.*;
import java.beans.*;

public class BackgroundImageLabel extends JLabel {
    private Image backgroundImage;

    public BackgroundImageLabel() {
        super();
        setOpaque(false); // Permitir transparencia si no hay imagen de fondo
    }

    /**
     * Establece la imagen de fondo.
     *
     * @param image Imagen a establecer.
     */
    public void setBackgroundImage(Image image) {
        this.backgroundImage = image;
        repaint(); // Redibujar el componente al cambiar la imagen
    }

    /**
     * Obtiene la imagen de fondo.
     *
     * @return Imagen de fondo.
     */
    public Image getBackgroundImage() {
        return this.backgroundImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            // Dibujar la imagen escalada al tamaño del JLabel
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
