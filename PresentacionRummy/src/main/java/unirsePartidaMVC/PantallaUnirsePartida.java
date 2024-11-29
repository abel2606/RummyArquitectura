/*
 * PantallaUnirsePartida.java
 */
package unirsePartidaMVC;

import javax.swing.JOptionPane;

/**
 * @author Equipo4
 */
public class PantallaUnirsePartida extends javax.swing.JFrame implements IPantallaUnirsePartida {

    /**
     * Creates new form PantallaUnirsePartida2
     */
    private PantallaUnirsePartida() {
        initComponents();
        
        setTitle("Rummy - Uniéndose a Partida");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCancelar = new componentes.Boton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 48, 196), 3, true));
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorderPainted(false);
        botonCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 50)); // NOI18N
        botonCancelar.setRadius(50);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 260, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("del anfitrión...");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 460, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("Esperando respuesta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 460, 70));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoSolicitarUnirse.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        control.cancelarAccion();
        setVisible(false);
    }//GEN-LAST:event_botonCancelarActionPerformed

    public static PantallaUnirsePartida getInstance() {
        if (pantalla == null) {
            pantalla = new PantallaUnirsePartida();
        }
        return pantalla;
    }
    
    public void crearParametrosMVC() {
        control = ControlUnirsePartida.getInstance();
    }
    
    @Override
    public void update(IModeloUnirsePartida modelo) {
        setVisible(true);
        
        if (modelo.getError() != null) {
            JOptionPane.showMessageDialog(this, modelo.getError(), 
                    "Error al unirse a la partida.", JOptionPane.ERROR_MESSAGE);
            setVisible(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Boton botonCancelar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    private static PantallaUnirsePartida pantalla;
    private ControlUnirsePartida control;
}
