/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.arquitectura.vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Dell
 */
public class PantallaSeleccionColor extends javax.swing.JDialog {

    /**
     * Creates new form PantallaSeleccionColor
     */
    public PantallaSeleccionColor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dibujarComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAjustes = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        checkColorNegro = new javax.swing.JCheckBox();
        checkColorAmarillo = new javax.swing.JCheckBox();
        checkColorAzul = new javax.swing.JCheckBox();
        checkColorRojo = new javax.swing.JCheckBox();
        checkColorVerde = new javax.swing.JCheckBox();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1042, 643));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tuerca.png"))); // NOI18N
        btnAjustes.setText("jButton11");
        btnAjustes.setBorder(null);
        btnAjustes.setContentAreaFilled(false);
        getContentPane().add(btnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 110, 80));

        btnVolver.setBackground(new java.awt.Color(100, 0, 143));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 48, 196), 3, true));
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 200, 50));

        btnConfirmar.setBackground(new java.awt.Color(100, 0, 143));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 48, 196), 3, true));
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 200, 50));
        getContentPane().add(checkColorNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));
        getContentPane().add(checkColorAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, -1, -1));
        getContentPane().add(checkColorAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));
        getContentPane().add(checkColorRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));
        getContentPane().add(checkColorVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoSeleccionarColor.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void dibujarComponentes(){
        ImageIcon negro = new ImageIcon("src\\main\\resources\\colorNegro.png");
        ImageIcon azul = new ImageIcon("src\\main\\resources\\colorAzul.png");
        ImageIcon rojo = new ImageIcon("src\\main\\resources\\colorRojo.png");
        ImageIcon verde = new ImageIcon("src\\main\\resources\\colorVerde.png");
        ImageIcon amarillo = new ImageIcon("src\\main\\resources\\colorAmarillo.png");
        
        checkColorNegro.setIcon(negro);
        checkColorAzul.setIcon(azul);
        checkColorRojo.setIcon(rojo);
        checkColorVerde.setIcon(verde);
        checkColorAmarillo.setIcon(amarillo);
        
        checkColorNegro.setBorderPainted(false);
        checkColorAzul.setBorderPainted(false);
        checkColorRojo.setBorderPainted(false);
        checkColorVerde.setBorderPainted(false);
        checkColorAmarillo.setBorderPainted(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaDatosJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaDatosJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaDatosJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaDatosJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaSeleccionColor dialog = new PantallaSeleccionColor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox checkColorAmarillo;
    private javax.swing.JCheckBox checkColorAzul;
    private javax.swing.JCheckBox checkColorNegro;
    private javax.swing.JCheckBox checkColorRojo;
    private javax.swing.JCheckBox checkColorVerde;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}