package seleccionColorMVC;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo4
 */
public class PantallaSeleccionarColor extends javax.swing.JFrame implements IPantallaSeleccionarColor{

    private ControlColores control;
    
    /**
     * Creates new form PantallaSeleccionarColor1
     */
    public PantallaSeleccionarColor() {
        initComponents();
        validacionColores();
        
        setTitle("Rummy - Seleccionar Colores");
        jPanel1.setBackground(new Color(53, 19, 79, 200));
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
        jLabel4 = new javax.swing.JLabel();
        botonVolver = new componentes.Boton();
        botonConfirmar = new componentes.Boton();
        checkboxColor1 = new javax.swing.JCheckBox();
        checkboxColor2 = new javax.swing.JCheckBox();
        checkboxColor3 = new javax.swing.JCheckBox();
        checkboxColor4 = new javax.swing.JCheckBox();
        checkboxColor5 = new javax.swing.JCheckBox();
        checkboxColor6 = new javax.swing.JCheckBox();
        checkboxColor7 = new javax.swing.JCheckBox();
        checkboxColor8 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SeleccionarColor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 48, 196), 3, true));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selecciona los colores de sus fichas");

        botonVolver.setForeground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.setFocusPainted(false);
        botonVolver.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        botonConfirmar.setText("Confirmar");
        botonConfirmar.setFocusPainted(false);
        botonConfirmar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        checkboxColor1.setBackground(new java.awt.Color(252, 3, 3));
        checkboxColor1.setForeground(new java.awt.Color(252, 3, 3));
        checkboxColor1.setText("fc0303");
        checkboxColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxColor1ActionPerformed(evt);
            }
        });

        checkboxColor2.setBackground(new java.awt.Color(7, 3, 252));
        checkboxColor2.setForeground(new java.awt.Color(7, 3, 252));
        checkboxColor2.setText("0703fc");

        checkboxColor3.setBackground(new java.awt.Color(252, 244, 3));
        checkboxColor3.setForeground(new java.awt.Color(252, 244, 3));
        checkboxColor3.setText("fcf403");

        checkboxColor4.setBackground(new java.awt.Color(24, 252, 3));
        checkboxColor4.setForeground(new java.awt.Color(24, 252, 3));
        checkboxColor4.setText("18fc03");

        checkboxColor5.setBackground(new java.awt.Color(252, 3, 140));
        checkboxColor5.setForeground(new java.awt.Color(252, 3, 140));
        checkboxColor5.setText("fc038c");

        checkboxColor6.setBackground(new java.awt.Color(169, 3, 252));
        checkboxColor6.setForeground(new java.awt.Color(169, 3, 252));
        checkboxColor6.setText("a903fc");

        checkboxColor7.setBackground(new java.awt.Color(252, 107, 3));
        checkboxColor7.setForeground(new java.awt.Color(252, 107, 3));
        checkboxColor7.setText("fc6b03");

        checkboxColor8.setBackground(new java.awt.Color(0, 0, 0));
        checkboxColor8.setText("000000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxColor1)
                            .addComponent(checkboxColor5))
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxColor2)
                            .addComponent(checkboxColor6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxColor3)
                            .addComponent(checkboxColor7))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxColor4)
                            .addComponent(checkboxColor8))
                        .addGap(77, 77, 77))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkboxColor1)
                    .addComponent(checkboxColor2)
                    .addComponent(checkboxColor3)
                    .addComponent(checkboxColor4))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkboxColor5)
                    .addComponent(checkboxColor6)
                    .addComponent(checkboxColor7)
                    .addComponent(checkboxColor8))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 760, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo-morado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        if(checkboxesSeleccionadas.size()==4){
            for(JCheckBox checkbox : checkboxesSeleccionadas){
                listaColores.add(Integer.parseInt("0x"+checkbox.getText()));
            }
            control.asignarColoresJugador(listaColores);
            setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos cuatro colores.",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void checkboxColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxColor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxColor1ActionPerformed

    public void crearParametrosMVC(){
        control = ControlColores.getInstance();
    }
    
    @Override
    public void update(){
        //si agregamos los colorchooser pues aquí se podría validar que no sea el mismo
        //color 4 veces, o tal vez eso podría ir en el botón, en un método, no lo sé papus es solo una idea
        this.setVisible(true);
    }
    
    public static PantallaSeleccionarColor getInstance(){
        if (pantalla == null) {
            pantalla = new PantallaSeleccionarColor();
        }
        return pantalla;
    }
    
    private void validacionColores() {
        JCheckBox[] checkboxesColores = {checkboxColor1, checkboxColor2, checkboxColor3, checkboxColor4,
                checkboxColor5, checkboxColor6, checkboxColor7, checkboxColor8};

        for (JCheckBox checkbox : checkboxesColores) {
            checkbox.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (checkbox.isSelected()) {
                        if (checkboxesSeleccionadas.size() >= 4) {
                            JCheckBox seleccionMasAntigua = checkboxesSeleccionadas.pollFirst();
                            if (seleccionMasAntigua != null) {
                                seleccionMasAntigua.setSelected(false);
                            }
                        }
                        checkboxesSeleccionadas.add(checkbox);
                    } else {
                        checkboxesSeleccionadas.remove(checkbox);
                    }
                }
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Boton botonConfirmar;
    private componentes.Boton botonVolver;
    private javax.swing.JCheckBox checkboxColor1;
    private javax.swing.JCheckBox checkboxColor2;
    private javax.swing.JCheckBox checkboxColor3;
    private javax.swing.JCheckBox checkboxColor4;
    private javax.swing.JCheckBox checkboxColor5;
    private javax.swing.JCheckBox checkboxColor6;
    private javax.swing.JCheckBox checkboxColor7;
    private javax.swing.JCheckBox checkboxColor8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private final LinkedList<JCheckBox> checkboxesSeleccionadas = new LinkedList<>();
    private List<Integer> listaColores = new ArrayList<>();
    private static PantallaSeleccionarColor pantalla;
}