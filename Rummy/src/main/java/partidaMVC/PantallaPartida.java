package partidaMVC;

import org.itson.arquitectura.dominiorummy.Partida;

/**
 *
 * @author Equipo4
 */
public class PantallaPartida extends javax.swing.JDialog implements IVista {

    private ControlPartida controlPartida;
    private Partida partida;

    /**
     * Creates new form Partida
     */
    public PantallaPartida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Rummy - Partida");
        initComponents();
        this.controlPartida = new ControlPartida();
//        this.partida = Partida.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelAceptar = new javax.swing.JPanel();
        botonIcono2 = new componentes.BotonIcono();
        panelMasFicha = new javax.swing.JPanel();
        btnMasFicha = new componentes.BotonIcono();
        panelFila1Tabla = new javax.swing.JPanel();
        panelTablero = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAceptar.setPreferredSize(new java.awt.Dimension(75, 105));
        panelAceptar.setRequestFocusEnabled(false);

        botonIcono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnAceptar.png"))); // NOI18N
        botonIcono2.setPreferredSize(new java.awt.Dimension(75, 105));

        javax.swing.GroupLayout panelAceptarLayout = new javax.swing.GroupLayout(panelAceptar);
        panelAceptar.setLayout(panelAceptarLayout);
        panelAceptarLayout.setHorizontalGroup(
            panelAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAceptarLayout.createSequentialGroup()
                .addComponent(botonIcono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAceptarLayout.setVerticalGroup(
            panelAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonIcono2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, Short.MAX_VALUE)
        );

        jPanel1.add(panelAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 510, -1, 104));

        btnMasFicha.setBackground(new java.awt.Color(40, 34, 107));
        btnMasFicha.setForeground(new java.awt.Color(255, 255, 255));
        btnMasFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonTomarFichaG.png"))); // NOI18N
        btnMasFicha.setText("20");
        btnMasFicha.setBorderColor(new java.awt.Color(40, 34, 107));
        btnMasFicha.setBorderPainted(false);
        btnMasFicha.setColor(new java.awt.Color(40, 34, 107));
        btnMasFicha.setColorClick(new java.awt.Color(40, 34, 107));
        btnMasFicha.setColorOver(new java.awt.Color(40, 34, 107));
        btnMasFicha.setFocusPainted(false);
        btnMasFicha.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnMasFicha.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botonTomarFichaCh.png"))); // NOI18N
        btnMasFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMasFichaLayout = new javax.swing.GroupLayout(panelMasFicha);
        panelMasFicha.setLayout(panelMasFichaLayout);
        panelMasFichaLayout.setHorizontalGroup(
            panelMasFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMasFichaLayout.createSequentialGroup()
                .addComponent(btnMasFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panelMasFichaLayout.setVerticalGroup(
            panelMasFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMasFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(panelMasFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, 75, -1));

        panelFila1Tabla.setOpaque(false);
        panelFila1Tabla.setPreferredSize(new java.awt.Dimension(546, 70));
        jPanel1.add(panelFila1Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 500, 530, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tablero.png"))); // NOI18N

        javax.swing.GroupLayout panelTableroLayout = new javax.swing.GroupLayout(panelTablero);
        panelTablero.setLayout(panelTableroLayout);
        panelTableroLayout.setHorizontalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTableroLayout.setVerticalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(panelTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoPartida2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnMasFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasFichaActionPerformed
//        controlPartida.tomarFicha(partida.getTurnos().getFirst().getJugador());
//        btnMasFicha.setEnabled(false);
    }//GEN-LAST:event_btnMasFichaActionPerformed

    @Override
    public void update(IModelo modelo) {
//        super.update(this.getGraphics());
//        panelFila1Tabla.add(dto.getFicha());
//        panelFila1Tabla.revalidate();
//        panelFila1Tabla.repaint();
//        modificarTamanioMazo(dto.getTamanioMazo());
    }
    public void terminarPartida(){
        
    }

    public void modificarTamanioMazo(int tamanioMazo) {
        btnMasFicha.setText(Integer.toString(tamanioMazo));
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
            java.util.logging.Logger.getLogger(PantallaPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaPartida dialog = new PantallaPartida(new javax.swing.JFrame(), true);
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
    private componentes.BotonIcono botonIcono2;
    private componentes.BotonIcono btnMasFicha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelAceptar;
    private javax.swing.JPanel panelFila1Tabla;
    private javax.swing.JPanel panelMasFicha;
    private javax.swing.JPanel panelTablero;
    // End of variables declaration//GEN-END:variables

}
