
package ventanas;
import  java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conexiones.Conexiones;

public class VentanaLogin extends javax.swing.JFrame {

    public VentanaLogin() {
        initComponents();
        // configurar imagen para el icono de la aplivcacion
        Image icono =  Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png"));
        setIconImage(icono);
        
        // poner el fomrulario en el centro
        setLocationRelativeTo(null);
         setResizable(false);
    }
        int intentos = 0;
        private void loginUsuario(){
            Connection conectar =  Conexiones.conectar();
            PreparedStatement consulta;
            ResultSet resultado ;
        
            String user = campo_usuario.getText();
            // al ser de tipo password toca hacer esto
            String pass =  new String(campo_pass.getPassword());
            
            // agrego comentarios de prueba
            
                    if(campo_usuario.getText().isEmpty() || campo_pass.getText().isEmpty()){
                          JOptionPane.showMessageDialog(null, "Debes llenar los campos");
                    }else{
                        try {
                            // consuilta sql
                            String sql = "select * from usuarios where nombre_usuario = ? and clave = ?";
                            consulta =  conectar.prepareStatement(sql);
                            consulta .setString(1, user);
                            consulta .setString(2, pass );
                            // ejecucion
                            resultado = consulta.executeQuery();
                            
                            if (resultado.next()) {
                                //JOptionPane.showMessageDialog(null, "Binevenido " + user, ": Acesso correcto", JOptionPane.INFORMATION_MESSAGE);
                                dispose();
                                new VentanaPrincipal().setVisible(true);
                                
                            } else {
                                JOptionPane.showMessageDialog(null, "Error: \n USUARIO/CONTRASEÑA INCORRECTOS \n INTENTE DE NUEVO...", "ALERTA", JOptionPane.ERROR_MESSAGE);
                                intentos++;
                                campo_usuario.setText("");
                                campo_pass.setText("");
                            }
                            
                            if(intentos > 3){
                                JOptionPane.showMessageDialog(null, "Error: \n CANTIDAD DE INTENTOS AGOTADA \n CERRANDO PROGRAMA", "ALERTA", JOptionPane.WARNING_MESSAGE);
                                System.exit(0);
                            }
                        } catch (Exception e) {
                            System.out.println("Error en la consulta" +  e);
                        }
                    }
                    System.out.println(intentos);
            

        }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_logo = new javax.swing.JLabel();
        l_login = new javax.swing.JLabel();
        l_usuario = new javax.swing.JLabel();
        l_pass = new javax.swing.JLabel();
        campo_usuario = new javax.swing.JTextField();
        campo_pass = new javax.swing.JPasswordField();
        copy = new javax.swing.JLabel();
        b_acceder = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        l_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN DE USUSARIO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_principal.png"))); // NOI18N
        getContentPane().add(l_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 110, 120));

        l_login.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        l_login.setForeground(new java.awt.Color(0, 0, 0));
        l_login.setText("LOGIN");
        getContentPane().add(l_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 90, 40));

        l_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_usuario.setForeground(new java.awt.Color(0, 0, 0));
        l_usuario.setText("Usuario");
        getContentPane().add(l_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        l_pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_pass.setForeground(new java.awt.Color(0, 0, 0));
        l_pass.setText("contraseña");
        getContentPane().add(l_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        campo_usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 160, -1));

        campo_pass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        campo_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_passActionPerformed(evt);
            }
        });
        getContentPane().add(campo_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 160, -1));

        copy.setText("famaCorporation System  ©");
        getContentPane().add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));

        b_acceder.setBackground(new java.awt.Color(102, 204, 0));
        b_acceder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b_acceder.setText("Acceder");
        b_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_accederActionPerformed(evt);
            }
        });
        getContentPane().add(b_acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 100, 40));

        b_salir.setBackground(new java.awt.Color(0, 204, 51));
        b_salir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b_salir.setText("Salir");
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });
        getContentPane().add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 100, 40));

        l_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_login.jpg"))); // NOI18N
        getContentPane().add(l_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 401, 588));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_accederActionPerformed
        loginUsuario();
        
        
       
    }//GEN-LAST:event_b_accederActionPerformed

    private void campo_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_passActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
       // cerrar programa
        System.exit(0);
    }//GEN-LAST:event_b_salirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_acceder;
    private javax.swing.JButton b_salir;
    private javax.swing.JPasswordField campo_pass;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_login;
    private javax.swing.JLabel l_logo;
    private javax.swing.JLabel l_pass;
    private javax.swing.JLabel l_usuario;
    // End of variables declaration//GEN-END:variables
}
