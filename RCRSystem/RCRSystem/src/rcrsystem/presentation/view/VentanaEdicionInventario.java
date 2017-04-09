package rcrsystem.presentation.view;

import Modelo.Inventario;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rcrsystem.presentation.controller.Editar_Inventario_Controlador;
import rcrsystem.presentation.model.Modelo;

public class VentanaEdicionInventario extends javax.swing.JDialog implements java.util.Observer {

    /**
     * Creates new form VentanaEdicionInventario
     */
    public VentanaEdicionInventario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/rcrsystem/presentation/view/iconos/logoRCR.png")).getImage());
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre_JTextField = new javax.swing.JTextField();
        precio_JTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cantidad_JTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        aceptar_JButton = new javax.swing.JButton();
        cancelar_JButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Editar");

        nombre_label.setText("Nombre:");

        jLabel1.setText("Precio:");

        nombre_JTextField.setEnabled(false);
        nombre_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_JTextFieldActionPerformed(evt);
            }
        });

        precio_JTextField.setEnabled(false);

        jLabel2.setText("Cantidad:");

        cantidad_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_JTextFieldActionPerformed(evt);
            }
        });
        cantidad_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidad_JTextFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Kg");

        aceptar_JButton.setText("Aceptar");
        aceptar_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar_JButtonActionPerformed(evt);
            }
        });

        cancelar_JButton.setText("Cancelar");
        cancelar_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidad_JTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(precio_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombre_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombre_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(aceptar_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar_JButton)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_label)
                    .addComponent(nombre_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(precio_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cantidad_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar_JButton)
                    .addComponent(cancelar_JButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidad_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad_JTextFieldActionPerformed

    private void aceptar_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar_JButtonActionPerformed
        this.aceptar_JButton.setEnabled(false);
        controller.modificar();   
        this.aceptar_JButton.setEnabled(true);
    }//GEN-LAST:event_aceptar_JButtonActionPerformed

    private void cancelar_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_JButtonActionPerformed

        controller.cerrar();// TODO add your handling code here:
    }//GEN-LAST:event_cancelar_JButtonActionPerformed

    private void cantidad_JTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidad_JTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad_JTextFieldKeyTyped

    private void nombre_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_JTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEdicionInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEdicionInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton aceptar_JButton;
    public javax.swing.JButton cancelar_JButton;
    public javax.swing.JTextField cantidad_JTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField nombre_JTextField;
    public javax.swing.JLabel nombre_label;
    public javax.swing.JTextField precio_JTextField;
    // End of variables declaration//GEN-END:variables
 Editar_Inventario_Controlador controller;
    Modelo modelo;

    public void setController(Editar_Inventario_Controlador controller) {
        this.controller = controller;
    }

    public void setModel(Modelo modelo) {
        this.modelo = modelo;
        modelo.addObserver(this);
    }

    @Override
    public void update(java.util.Observable updatedModel, Object parametros) {
        if (parametros != Modelo.ae_inventario_actual) {
            return;
        }
        Inventario inv = modelo.obtener_inventario_actual();
        this.nombre_JTextField.setText(inv.getMaterial().getNombre());
        this.precio_JTextField.setText(String.valueOf(inv.getPrecio()));
        if (modelo.otener_errores().get("cantidad") != null) {
            this.cantidad_JTextField.setBorder(rcrsystem.Aplicacion.ae_borde_error);
            cantidad_JTextField.setToolTipText(modelo.otener_errores().get("cantidad"));
        } else {
            cantidad_JTextField.setBorder(null);
            cantidad_JTextField.setToolTipText("");
            this.cantidad_JTextField.setText(String.valueOf(inv.getCantidad()));
        }
        this.validate();
        if (!modelo.obtener_mensaje().equals("")) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, modelo.obtener_mensaje(), "", JOptionPane.INFORMATION_MESSAGE);
            modelo.colocar_mensaje("");
        }
    }
}
