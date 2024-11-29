/*
 * PantallaConfigurarPartida.java
 */
package configurarPartidaMVC;

import javax.swing.JFrame;
import org.itson.arquitectura.dominiorummy.IPartida;
import org.itson.arquitectura.dominiorummy.Partida;

/**
 * @author Equipo4
 */
public class PantallaConfigurarPartida extends JFrame implements IPantallaConfigurarPartida {

    private ControlConfigurarPartida control;

    /**
     * Creates new form PantallaConfigurarPartida3
     */
    private PantallaConfigurarPartida() {
        initComponents();

        setTitle("Rummy - Configurar Partida");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoFichas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        radioButtonDiezFichas = new javax.swing.JRadioButton();
        radioButtonTreceFichas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxNumeroComodines = new javax.swing.JComboBox<>();
        botonCancelar = new javax.swing.JButton();
        botonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CONFIGURAR PARTIDA");

        grupoFichas.add(radioButtonDiezFichas);
        radioButtonDiezFichas.setText("10 Fichas");
        radioButtonDiezFichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonDiezFichasActionPerformed(evt);
            }
        });

        radioButtonTreceFichas.setText("13 Fichas");

        jLabel2.setText("Rango de Fichas:");

        jLabel3.setText("Número de Comodines:");

        comboBoxNumeroComodines.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));

        botonCancelar.setText("CANCELAR");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonConfirmar.setText("CONFIRMAR");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(radioButtonDiezFichas)
                        .addGap(18, 18, 18)))
                .addComponent(radioButtonTreceFichas)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonConfirmar))
                    .addComponent(comboBoxNumeroComodines, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonTreceFichas)
                    .addComponent(jLabel2)
                    .addComponent(radioButtonDiezFichas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxNumeroComodines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botonConfirmar))
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioButtonDiezFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonDiezFichasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonDiezFichasActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        setVisible(false);
        control.cancelarAccion();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        int cantidadRango = obtenerValorSeleccionado();
        
        String cantidadComodines = (String) comboBoxNumeroComodines.getSelectedItem();

        IPartida partida = new Partida(Integer.valueOf(cantidadComodines), cantidadRango);
        control.crearPartida(partida);
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private int obtenerValorSeleccionado() {
        if (radioButtonDiezFichas.isSelected()) {
            return 10;
        } else if (radioButtonTreceFichas.isSelected()) {
            return 2;
        }
        return 0;
    }

    public void crearParametrosMVC() {
        control = ControlConfigurarPartida.getInstance();
    }

    @Override
    public void update() {
        setVisible(true);
    }

    public static PantallaConfigurarPartida getInstance() {
        if (pantalla == null) {
            pantalla = new PantallaConfigurarPartida();
        }
        return pantalla;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JComboBox<String> comboBoxNumeroComodines;
    private javax.swing.ButtonGroup grupoFichas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioButtonDiezFichas;
    private javax.swing.JRadioButton radioButtonTreceFichas;
    // End of variables declaration//GEN-END:variables
    private static PantallaConfigurarPartida pantalla;

}
