/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package configurarPartidaMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Abe
 */
public class PantallaConfigurarPartida extends javax.swing.JDialog {

    private ControlConfigurarPartida control;

    /**
     * Creates new form Inicio
     */
    public PantallaConfigurarPartida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dibujarComponentes();
        control = new ControlConfigurarPartida();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chk2 = new javax.swing.JCheckBox();
        chk1 = new javax.swing.JCheckBox();
        cbboComodines = new javax.swing.JComboBox<>();
        btnVolver = new componentes.BotonConImagen();
        btnConfirmar = new componentes.BotonConImagen();
        btnConfigurar = new componentes.BotonConImagen();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número de comodines de la partida:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 410, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONFIGURACIÓN DE PARTIDA");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 520, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rango de número de las fichas:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 360, 40));

        chk2.setForeground(new java.awt.Color(255, 255, 255));
        chk2.setText("Holaaa");
        chk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2ActionPerformed(evt);
            }
        });
        jPanel1.add(chk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 118, 67));

        chk1.setForeground(new java.awt.Color(255, 255, 255));
        chk1.setText("Holaaa");
        chk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1ActionPerformed(evt);
            }
        });
        jPanel1.add(chk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 118, 67));

        cbboComodines.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        jPanel1.add(cbboComodines, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 102, 40));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volver.png"))); // NOI18N
        btnVolver.setToolTipText("");
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 262, 52));

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crearPartida.png"))); // NOI18N
        btnConfirmar.setToolTipText("");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 262, 52));

        btnConfigurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settings.png"))); // NOI18N
        jPanel1.add(btnConfigurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 72, 72));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void dibujarComponentes() {
        ImageIcon noSeleccionado = new ImageIcon("src\\main\\resources\\Rectangulo1.png");
        ImageIcon seleccionado = new ImageIcon("src\\main\\resources\\RectanguloSeleccionado1.png");

        ImageIcon noSeleccionado2 = new ImageIcon("src\\main\\resources\\Rectangulo2.png");
        ImageIcon seleccionado2 = new ImageIcon("src\\main\\resources\\RectanguloSeleccionado2.png");

        chk1.setIcon(noSeleccionado);
        chk1.setSelectedIcon(seleccionado);
        chk1.setBorderPainted(false);
        chk1.setFocusPainted(false);

        chk2.setIcon(noSeleccionado2);
        chk2.setSelectedIcon(seleccionado2);
        chk2.setBorderPainted(false);
        chk2.setFocusPainted(false);

        chk1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chk1.isSelected()) {
                    chk2.setSelected(false);
                }
            }
        });

        chk2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chk2.isSelected()) {
                    chk1.setSelected(false);
                }
            }
        });

        ImageIcon crearPartida = new ImageIcon("src\\main\\resources\\crearPartida.png");
        ImageIcon crearPartidaSelect = new ImageIcon("src\\main\\resources\\crearPartidaHover.png");

        ImageIcon volver = new ImageIcon("src\\main\\resources\\volver.png");
        ImageIcon volverSelect = new ImageIcon("src\\main\\resources\\volverHover.png");

        btnVolver.setIcon(volver);
        btnVolver.setSelectedIcon(volverSelect);
        btnVolver.setBorderPainted(false);
        btnVolver.setFocusPainted(false);

        btnConfirmar.setIcon(crearPartida);
        btnConfirmar.setSelectedIcon(crearPartidaSelect);
        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setFocusPainted(false);

        ImageIcon settings = new ImageIcon("src\\main\\resources\\settings.png");
        ImageIcon settingsSelect = new ImageIcon("src\\main\\resources\\settings2.png");

        btnConfigurar.setIcon(settings);
        btnConfigurar.setSelectedIcon(settingsSelect);
        btnConfigurar.setBorderPainted(false);
        btnConfigurar.setFocusPainted(false);

    }
    private void chk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1ActionPerformed

    private void chk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk2ActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        int rangoFichas = 0;

        if (chk1.isSelected()) {
            rangoFichas = 10;

        } else if (chk2.isSelected()) {
            rangoFichas = 13;
        }

        
        String comodines = (String) cbboComodines.getSelectedItem();
        int numComodines = Integer.valueOf(comodines);
        
        control.continuarConfiguracion(rangoFichas, numComodines);
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaConfigurarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaConfigurarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaConfigurarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaConfigurarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaConfigurarPartida dialog = new PantallaConfigurarPartida(new javax.swing.JFrame(), true);
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
    private componentes.BotonConImagen btnConfigurar;
    private componentes.BotonConImagen btnConfirmar;
    private componentes.BotonConImagen btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbboComodines;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}