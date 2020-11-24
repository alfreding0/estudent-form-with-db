
package Presentacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import Negocio.NCliente;
import javax.swing.JOptionPane;

public class FormCliente extends javax.swing.JFrame {
    NCliente NCli;
    public FormCliente() {
        NCli=new NCliente();
        initComponents();
    }
    public void Limpiar()
    {
        JTFCodigo.setText("");
        JTFNombre.setText("");
        JTFApelldio.setText("");
        JTFCi.setText("");
        JTFNit.setText("");
        JTFTelefono.setText("");
        JTFSexo.setText("");
    }
    public void Bloquear()
    {
       
        JTFCodigo.setEnabled(false);
        JTFNombre.setEnabled(false);
        JTFApelldio.setEnabled(false);
        JTFCi.setEnabled(false);
        JTFNit.setEnabled(false);
        JTFTelefono.setEnabled(false);
        JTFSexo.setEnabled(false);
    }
     public void Desbloquear()
    {
       JTFCodigo.setEnabled(true);
        JTFNombre.setEnabled(true);
        JTFApelldio.setEnabled(true);
        JTFCi.setEnabled(true);
        JTFNit.setEnabled(true);
        JTFTelefono.setEnabled(true);
        JTFSexo.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        JTFNombre = new javax.swing.JTextField();
        JTFApelldio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFSexo = new javax.swing.JTextField();
        JBNuevo = new javax.swing.JButton();
        JBModificar = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        JBCerrar = new javax.swing.JButton();
        JBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTPER = new javax.swing.JTable();
        JBSeleccionar = new javax.swing.JButton();
        JTFCi = new javax.swing.JTextField();
        JTFNit = new javax.swing.JTextField();
        JTFTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Meiryo UI", 1, 35)); // NOI18N
        jLabel1.setText("GESTIONAR CLIENTE");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CODIGO:");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE:");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDO:");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEXO:");
        jLabel5.setOpaque(true);

        JBNuevo.setBackground(new java.awt.Color(204, 255, 204));
        JBNuevo.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        JBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevoDetalle.PNG"))); // NOI18N
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        JBModificar.setBackground(new java.awt.Color(204, 255, 204));
        JBModificar.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        JBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Configuar(pequeño).PNG"))); // NOI18N
        JBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModificarActionPerformed(evt);
            }
        });

        JBGuardar.setBackground(new java.awt.Color(204, 255, 204));
        JBGuardar.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        JBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.PNG"))); // NOI18N
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.PNG"))); // NOI18N
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        JBCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.PNG"))); // NOI18N
        JBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrarActionPerformed(evt);
            }
        });

        JBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.PNG"))); // NOI18N
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        JTPER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JTPER);

        JBSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Seleccionar.PNG"))); // NOI18N
        JBSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSeleccionarActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("C.I.:");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NIT:");
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TELEFONO:");
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFCi)
                                    .addComponent(JTFNit)
                                    .addComponent(JTFTelefono)
                                    .addComponent(JTFSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFApelldio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBSeleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFApelldio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTFCi, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTFNit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTFSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JBBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBCerrar)
                    .addComponent(JBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrarActionPerformed

        this.dispose();
    }//GEN-LAST:event_JBCerrarActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
       NCli.Buscar(JTPER,"");
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        // Guardar:
      
        String cli_codigo=JTFCodigo.getText();
        String cli_nombre=JTFNombre.getText();
        String cli_apellido=JTFApelldio.getText();
        String cli_ci=JTFCi.getText();
        String cli_nit=JTFNit.getText();
        String cli_telefono=JTFTelefono.getText();
        String cli_sexo=JTFSexo.getText();
        NCli.Insertar(cli_codigo, cli_nombre, cli_apellido, cli_ci, cli_nit, cli_telefono, cli_sexo);
        NCli.Buscar(JTPER, null);
        Limpiar();
        JBGuardar.setEnabled(false);
        JBModificar.setEnabled(false);
        JBNuevo.setEnabled(true);
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        // Nuevo:
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        // Eliminar:
        String cli_codigo=JTFCodigo.getText();
        NCli.Eliminar(cli_codigo);
        JOptionPane.showMessageDialog(null,"Se ha eliminado una persona");
        NCli.Buscar(JTPER, null);
        Bloquear();
        Limpiar();
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSeleccionarActionPerformed
        // Seleccionar:
        Desbloquear();
        JBNuevo.setEnabled(false);
        JBGuardar.setEnabled(false);
        JBModificar.setEnabled(true);
        JBEliminar.setEnabled(true);
        int fmod = JTPER.getSelectedRow();
        if (fmod >= 0) {
            try {
                JTFCodigo.setText(JTPER.getValueAt(fmod, 0).toString());
                JTFNombre.setText(JTPER.getValueAt(fmod, 1).toString());
                JTFApelldio.setText(JTPER.getValueAt(fmod, 2).toString());
                JTFCi.setText(JTPER.getValueAt(fmod, 3).toString());
                JTFNit.setText(JTPER.getValueAt(fmod, 4).toString());
                JTFTelefono.setText(JTPER.getValueAt(fmod, 5).toString());
                JTFSexo.setText(JTPER.getValueAt(fmod, 6).toString());
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No ha seleccionado ");
            } 
      }        
    }//GEN-LAST:event_JBSeleccionarActionPerformed

    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed
        // Modificar:
        String cli_codigo=JTFCodigo.getText();
        String cli_nombre=JTFNombre.getText();
        String cli_apellido=JTFApelldio.getText();
        String cli_ci=JTFCi.getText();
        String cli_nit=JTFNit.getText();
        String cli_telefono=JTFTelefono.getText();
        String cli_sexo=JTFSexo.getText(); 
        NCli.actualizar(cli_codigo, cli_nombre, cli_apellido, cli_ci, cli_nit, cli_telefono, cli_sexo);
           NCli.Buscar(JTPER, null);
           JOptionPane.showMessageDialog(rootPane, "Se ha modificado exitosamente");
           Bloquear();
           Limpiar();
           JBNuevo.setEnabled(true);
            
    }//GEN-LAST:event_JBModificarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBCerrar;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBModificar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JButton JBSeleccionar;
    private javax.swing.JTextField JTFApelldio;
    private javax.swing.JTextField JTFCi;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFNit;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JTextField JTFSexo;
    private javax.swing.JTextField JTFTelefono;
    private javax.swing.JTable JTPER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
