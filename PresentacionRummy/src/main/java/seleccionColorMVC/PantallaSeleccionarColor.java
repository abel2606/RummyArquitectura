package seleccionColorMVC;

import componentes.ColorChooserButton;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Equipo4
 */
public class PantallaSeleccionarColor extends javax.swing.JFrame implements IPantallaSeleccionarColor{

    private ControlColores control;
    
    /**
     * Creates new form PantallaSeleccionarColor1
     */
    private PantallaSeleccionarColor() {
        initComponents();
        crearBotonesColores();
//        validacionColores();
        
        setTitle("Rummy - Seleccionar Colores");
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SeleccionarColor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 48, 196), 4, true));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selecciona los colores de sus fichas");

        botonVolver.setForeground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.setFocusPainted(false);
        botonVolver.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        botonVolver.setRadius(60);
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        botonConfirmar.setText("Confirmar");
        botonConfirmar.setFocusPainted(false);
        botonConfirmar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        botonConfirmar.setRadius(60);
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 760, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo-morado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        listaColores.add(colorButton1.getSelectedColor().getRGB());
        listaColores.add(colorButton2.getSelectedColor().getRGB());
        listaColores.add(colorButton3.getSelectedColor().getRGB());
        listaColores.add(colorButton4.getSelectedColor().getRGB());
        
        control.asignarColoresJugador(listaColores);
        setVisible(false);
    }//GEN-LAST:event_botonConfirmarActionPerformed

    public void crearParametrosMVC(){
        control = ControlColores.getInstance();
    }
    
    @Override
    public void update(IModeloColores modelo){
        //si agregamos los colorchooser pues aquí se podría validar que no sea el mismo
        //color 4 veces, o tal vez eso podría ir en el botón, en un método, no lo sé papus es solo una idea
        this.setVisible(true);
        
        if (modelo.getError() != null) {
            JOptionPane.showMessageDialog(this, modelo.getError(),
                    "Error!!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static PantallaSeleccionarColor getInstance(){
        if (pantalla == null) {
            pantalla = new PantallaSeleccionarColor();
        }
        return pantalla;
    }
    
    private void crearBotonesColores() {
        colorButton1.setBounds(105, 150, 100, 30);
        colorButton2.setBounds(255, 150, 100, 30);
        colorButton3.setBounds(405, 150, 100, 30);
        colorButton4.setBounds(555, 150, 100, 30);

        jPanel1.add(colorButton1);
        jPanel1.add(colorButton2);
        jPanel1.add(colorButton3);
        jPanel1.add(colorButton4);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 760, 350));

        pack();
    }
    
    private String convertirColorAHex(Color color){
        return String.format("%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }
    
//    private void validacionColores() {
//        JCheckBox[] checkboxesColores = {checkboxColor1, checkboxColor2, checkboxColor3, checkboxColor4,
//                checkboxColor5, checkboxColor6, checkboxColor7, checkboxColor8};
//
//        for (JCheckBox checkbox : checkboxesColores) {
//            checkbox.addItemListener(new ItemListener() {
//                @Override
//                public void itemStateChanged(ItemEvent e) {
//                    if (checkbox.isSelected()) {
//                        if (checkboxesSeleccionadas.size() >= 4) {
//                            JCheckBox seleccionMasAntigua = checkboxesSeleccionadas.pollFirst();
//                            if (seleccionMasAntigua != null) {
//                                seleccionMasAntigua.setSelected(false);
//                            }
//                        }
//                        checkboxesSeleccionadas.add(checkbox);
//                    } else {
//                        checkboxesSeleccionadas.remove(checkbox);
//                    }
//                }
//            });
//        }
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Boton botonConfirmar;
    private componentes.Boton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private List<Integer> listaColores = new ArrayList<>();
    private static PantallaSeleccionarColor pantalla;
    ColorChooserButton colorButton1 = new ColorChooserButton(Color.RED);
    ColorChooserButton colorButton2 = new ColorChooserButton(Color.BLUE);
    ColorChooserButton colorButton3 = new ColorChooserButton(Color.GREEN);
    ColorChooserButton colorButton4 = new ColorChooserButton(Color.BLACK);
}
