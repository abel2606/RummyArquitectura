/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.itson.arquitectura.vistas;

import javax.swing.ImageIcon;

/**
 *
 * @author Abe
 */
public class PantallaInicio extends javax.swing.JDialog {

    /**
     * Creates new form Inicio
     */
    public PantallaInicio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dibujarComponentes();
    }

    public void dibujarComponentes(){
        ImageIcon crearPartida = new ImageIcon("src\\main\\resources\\crearPartidaInicio.png");
        ImageIcon crearPartidaHover = new ImageIcon("src\\main\\resources\\crearPartidaInicioHover.png");
        
        ImageIcon unirsePartida = new ImageIcon("src\\main\\resources\\unirsePartidaInicio.png");
        ImageIcon unirsePartidaHover = new ImageIcon("src\\main\\resources\\unirsePartidaInicioHover.png");
        
        ImageIcon settings = new ImageIcon("src\\main\\resources\\settings.png");
        ImageIcon settingsSelect = new ImageIcon("src\\main\\resources\\settings2.png");

        btnConfiguracion.setIcon(settings);  
        btnConfiguracion.setSelectedIcon(settingsSelect);  
        btnConfiguracion.setBorderPainted(false);  
        btnConfiguracion.setFocusPainted(false); 
        
        btnCrearPartida.setIcon(crearPartida);  
        btnCrearPartida.setSelectedIcon(crearPartidaHover);  
        btnCrearPartida.setBorderPainted(false);  
        btnCrearPartida.setFocusPainted(false);
        
        btnUnirsePartida.setIcon(unirsePartida);  
        btnUnirsePartida.setSelectedIcon(unirsePartidaHover);  
        btnUnirsePartida.setBorderPainted(false);  
        btnUnirsePartida.setFocusPainted(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUnirsePartida = new org.itson.arquitectura.configurarpartida.componentesgraficos.BotonConImagen();
        btnConfiguracion = new org.itson.arquitectura.configurarpartida.componentesgraficos.BotonConImagen();
        btnCrearPartida = new org.itson.arquitectura.configurarpartida.componentesgraficos.BotonConImagen();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUnirsePartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unirsePartidaInicio.png"))); // NOI18N
        btnUnirsePartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirsePartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnUnirsePartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 525, 117));

        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settings.png"))); // NOI18N
        getContentPane().add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 72, 72));

        btnCrearPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crearPartidaInicio.png"))); // NOI18N
        getContentPane().add(btnCrearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 525, 117));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoInicio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnirsePartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirsePartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUnirsePartidaActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaInicio dialog = new PantallaInicio(new javax.swing.JFrame(), true);
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
    private org.itson.arquitectura.configurarpartida.componentesgraficos.BotonConImagen btnConfiguracion;
    private org.itson.arquitectura.configurarpartida.componentesgraficos.BotonConImagen btnCrearPartida;
    private org.itson.arquitectura.configurarpartida.componentesgraficos.BotonConImagen btnUnirsePartida;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
