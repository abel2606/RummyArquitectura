/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * @author Equipo4
 */
public class BotonIcono extends JButton{
    /**
     * Constructor que crea un botón con icono
     */
    public BotonIcono() {
        setColor(new Color(161,233,255));
        colorOver = new Color(115,199,225);
        colorClick = new Color(110,190,215);
        borderColor = new Color(161,233,255);

        setContentAreaFilled(false);
        setIcon(this.getIcon());
        setText(this.getText());
        setVerticalTextPosition(SwingConstants.BOTTOM);
        setHorizontalTextPosition(SwingConstants.CENTER);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        //event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(color);
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }

        });
    }

    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    /**
     * Sobrescribe el método paintComponent para personalizar la apariencia del botón.
     * Dibuja un botón con bordes redondeados y aplica el color de fondo.
     *
     * @param grphcs los gráficos del componente.
     */
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        setBorder(null);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        super.paintComponent(grphcs);

    }

    /**
     * @return true si el ratón está sobre el botón, false de lo contrario.
     */
    public boolean isOver() {
        return over;
    }

    /**
     * Establece el estado de la propiedad over.
     *
     * @param over true si el ratón está sobre el botón, false de lo contrario.
     */
    public void setOver(boolean over) {
        this.over = over;
    }
    
    /**
     * @return el color del botón.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Establece el color del botón y actualiza su fondo.
     *
     * @param color el nuevo color del botón.
     */
    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    /**
     * @return el color cuando el ratón pasa sobre el botón.
     */
    public Color getColorOver() {
        return colorOver;
    }

    /**
     * Establece el color del botón cuando el ratón pasa sobre él.
     *
     * @param colorOver el nuevo color de hover.
     */
    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    /**
     * @return el color cuando se hace clic en el botón.
     */
    public Color getColorClick() {
        return colorClick;
    }

    /**
     * Establece el color del botón cuando se hace clic.
     *
     * @param colorClick el nuevo color de clic.
     */
    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    /**
     * @return el color del borde del botón.
     */
    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * Establece el color del borde del botón.
     *
     * @param borderColor el nuevo color del borde.
     */
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    
    /**
     * @return el radio de los bordes redondeados.
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Establece el radio de los bordes redondeados del botón.
     *
     * @param radius el nuevo valor del radio.
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
