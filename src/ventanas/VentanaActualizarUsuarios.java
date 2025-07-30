package ventanas;

import conexiones.Conexiones;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VentanaActualizarUsuarios extends javax.swing.JFrame {

    public VentanaActualizarUsuarios() {
        initComponents();
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png"));
        setIconImage(icono);

        // poner el fomrulario en el centro
        setLocationRelativeTo(null);
        setResizable(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_titulo = new javax.swing.JLabel();
        l_nombre = new javax.swing.JLabel();
        l_direccion = new javax.swing.JLabel();
        l_telefoino = new javax.swing.JLabel();
        b_actualizar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        t_nombre = new javax.swing.JTextField();
        t_direccion = new javax.swing.JTextField();
        t_telefono = new javax.swing.JTextField();
        copy = new javax.swing.JLabel();
        t_nombre1 = new javax.swing.JTextField();
        l_nombre1 = new javax.swing.JLabel();
        b_buscar = new javax.swing.JButton();
        l_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_titulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        l_titulo.setForeground(new java.awt.Color(0, 102, 102));
        l_titulo.setText("Actualizar Cliente");
        getContentPane().add(l_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        l_nombre.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        l_nombre.setForeground(new java.awt.Color(0, 102, 102));
        l_nombre.setText("Nombre");
        getContentPane().add(l_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        l_direccion.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        l_direccion.setForeground(new java.awt.Color(0, 102, 102));
        l_direccion.setText("Direccion");
        getContentPane().add(l_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        l_telefoino.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        l_telefoino.setForeground(new java.awt.Color(0, 102, 102));
        l_telefoino.setText("Teléfono");
        getContentPane().add(l_telefoino, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        b_actualizar.setBackground(new java.awt.Color(5, 153, 0));
        b_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        b_actualizar.setText("Actualizar");
        b_actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(b_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 130, 40));

        b_cancelar.setBackground(new java.awt.Color(5, 153, 0));
        b_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        b_cancelar.setText("Cancelar");
        b_cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 130, 40));

        t_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 270, 30));
        getContentPane().add(t_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 270, 30));
        getContentPane().add(t_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 270, 30));

        copy.setText("famaCorporation System  ©");
        getContentPane().add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 166, -1));

        t_nombre1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        t_nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nombre1ActionPerformed(evt);
            }
        });
        getContentPane().add(t_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 80, 30));

        l_nombre1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        l_nombre1.setForeground(new java.awt.Color(0, 102, 102));
        l_nombre1.setText("ID");
        getContentPane().add(l_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        b_buscar.setBackground(new java.awt.Color(5, 153, 0));
        b_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_buscar.setForeground(new java.awt.Color(255, 255, 255));
        b_buscar.setText("Buscar");
        b_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 90, 40));

        l_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_insertClientes.jpg"))); // NOI18N
        getContentPane().add(l_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_actualizarActionPerformed

        
    }//GEN-LAST:event_b_actualizarActionPerformed

    private void t_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nombreActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void t_nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nombre1ActionPerformed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaActualizarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaActualizarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_actualizar;
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel l_direccion;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_nombre;
    private javax.swing.JLabel l_nombre1;
    private javax.swing.JLabel l_telefoino;
    private javax.swing.JLabel l_titulo;
    private javax.swing.JTextField t_direccion;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_nombre1;
    private javax.swing.JTextField t_telefono;
    // End of variables declaration//GEN-END:variables
}
