package rcrsystem.presentation.view;

import Modelo.AdministrarMaterial;
import java.awt.Color;
import java.util.Observable;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import rcrsystem.presentation.controller.Admin_Material_Controlador;
import rcrsystem.presentation.model.Material_Modelo;
import static rcrsystem.presentation.view.VentanaUsuario.BORDER_ERROR;


public class VentanaAdminMaterial extends javax.swing.JDialog implements java.util.Observer {

     Admin_Material_Controlador controlador;
  Material_Modelo modelo;
      public static Border BORDER_ERROR = BorderFactory.createLineBorder(Color.red);
    public Border BORDER_NOBORDER;
    
    public VentanaAdminMaterial (java.awt.Frame parent, boolean modal){
      super(parent, modal);
        initComponents();
        this.setResizable(false);
           setIconImage(new ImageIcon(getClass().getResource("/rcrsystem/presentation/view/iconos/logoRCR.png")).getImage());
        setLocationRelativeTo(null);
         BORDER_NOBORDER = this.jTextField_codigo.getBorder();
    }
    
    public Admin_Material_Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Admin_Material_Controlador controlador) {
        this.controlador = controlador;
    }

    public Material_Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Material_Modelo modelo) {
        this.modelo = modelo;
        modelo.addObserver(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_descripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_paca = new javax.swing.JTextField();
        jTextField_saca = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_agregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("Código:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Precio de paca:");

        jLabel4.setText("Precio de saca:");

        jButton_agregar.setText("Agregar");
        jButton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregarActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton_agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_paca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_saca, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_paca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_saca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregarActionPerformed
this.jButton_agregar.setEnabled(false);
        controlador.agregar();   
        this.jButton_agregar.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_agregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.jButton2.setEnabled(false);
        this.setVisible(false);  
        this.jButton2.setEnabled(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAdminMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdminMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdminMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdminMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton_agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField jTextField_codigo;
    public javax.swing.JTextField jTextField_descripcion;
    public javax.swing.JTextField jTextField_paca;
    public javax.swing.JTextField jTextField_saca;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(java.util.Observable updatedModel, Object parametros) {
        if (parametros != Material_Modelo.ae_material_actual) {
            return;
        }
        AdministrarMaterial material = modelo.obtener_material_actual();
        
        if(material==null){
        this.jTextField_codigo.setText("");
          this.jTextField_descripcion.setText("");
            this.jTextField_paca.setText("");
              this.jTextField_saca.setText("");
        }else{
        this.jTextField_codigo.setText(material.getMaterial().getCodigo());
        if(modelo.obtener_errores().get("id")!=null){
         this.jTextField_codigo.setBorder(BORDER_ERROR);
         this.jTextField_codigo.setToolTipText(modelo.obtener_errores().get("id"));
        }
        else{
          this.jTextField_codigo.setBorder(BORDER_NOBORDER);
         this.jTextField_codigo.setToolTipText(null);
         }
        
        this.jTextField_descripcion.setText(material.getMaterial().getNombre());
        if(modelo.obtener_errores().get("nombre")!=null){
         this.jTextField_codigo.setBorder(BORDER_ERROR);
         this.jTextField_codigo.setToolTipText(modelo.obtener_errores().get("nombre"));
        }
        else{
          this.jTextField_codigo.setBorder(BORDER_NOBORDER);
         this.jTextField_codigo.setToolTipText(null);
         }
        
           if(material.getPrecioPaca()==0){
         this.jTextField_paca.setText("");
         }
         else{
           this.jTextField_paca.setText(String.valueOf(material.getPrecioPaca()));
         }
         
         if(modelo.obtener_errores().get("paca")!=null){
         this.jTextField_paca.setBorder(BORDER_ERROR);
         this.jTextField_paca.setToolTipText(modelo.obtener_errores().get("paca"));
        }
        else{
          this.jTextField_paca.setBorder(BORDER_NOBORDER);
         this.jTextField_paca.setToolTipText(null);
         }
         
           if(material.getPrecioSaca()==0){
         this.jTextField_saca.setText("");
         }
         else{
           this.jTextField_saca.setText(String.valueOf(material.getPrecioSaca()));
         }
         
         if(modelo.obtener_errores().get("saca")!=null){
         this.jTextField_saca.setBorder(BORDER_ERROR);
         this.jTextField_saca.setToolTipText(modelo.obtener_errores().get("saca"));
        }
        else{
          this.jTextField_saca.setBorder(BORDER_NOBORDER);
         this.jTextField_saca.setToolTipText(null);
         }
        }
        this.validate();
        
        
         if(modelo.obtener_mensaje()!=null){
        if (!modelo.obtener_mensaje().equals("")) {
            JOptionPane.showMessageDialog(this, modelo.obtener_mensaje(), "", JOptionPane.INFORMATION_MESSAGE);
            modelo.colocar_mensaje("");
        }
      }
    }
}