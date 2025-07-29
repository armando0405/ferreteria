
package ventanas;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Image;
import java.awt.Toolkit;
import conexiones.Conexiones;
import  java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;


public class VentanaClientes extends javax.swing.JFrame {

    public VentanaClientes() {
        initComponents();
        Image icono =  Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png"));
        setIconImage(icono);
        
        // poner el fomrulario en el centro
        setLocationRelativeTo(null);
            setResizable(false);
            
            mostrar("clientes");
    }
    
    public void mostrar(String tabla){
        String sql = "select * from "+ tabla;
        Connection conectar  = Conexiones.conectar();
        
        DefaultTableModel modelo = new DefaultTableModel(
                 new Object[][]{},
                new String[]{ "Id_cliente","Nombre","Direccion","Telefono"}
        ) {
            public boolean  noeditable(int row, int column){
                return  false;
            }
        };
        tabla1.setModel(modelo);
        
        for (int f = 0;   f <tabla1.getColumnCount();  f++) {
            tabla1.getColumnModel().getColumn(f).setResizable(false);
            
        }
        String[] datos = new String[4];
        try {
            Statement consulta = conectar.createStatement();
            ResultSet resultado =  consulta.executeQuery(sql);
            
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                modelo.addRow(datos);
            }
            
            
            
        } catch (SQLException e) {
            System.out.println("Error->" + e);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_logo = new javax.swing.JLabel();
        b_volver = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        copy = new javax.swing.JLabel();
        l_text = new javax.swing.JLabel();
        b_insertar = new javax.swing.JButton();
        b_actualizar = new javax.swing.JButton();
        b_borrar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        l_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_principal.png"))); // NOI18N
        getContentPane().add(l_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        b_volver.setBackground(new java.awt.Color(5, 153, 0));
        b_volver.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b_volver.setForeground(new java.awt.Color(255, 255, 255));
        b_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        b_volver.setText("Volver");
        b_volver.setBorder(null);
        b_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volverActionPerformed(evt);
            }
        });
        getContentPane().add(b_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 120, 45));

        b_salir.setBackground(new java.awt.Color(5, 153, 0));
        b_salir.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b_salir.setForeground(new java.awt.Color(255, 255, 255));
        b_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        b_salir.setText("Salir");
        b_salir.setBorder(null);
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });
        getContentPane().add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 560, 120, 45));

        copy.setText("famaCorporation System  ©");
        getContentPane().add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 166, -1));

        l_text.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        l_text.setForeground(new java.awt.Color(0, 102, 102));
        l_text.setText("Modulo De Clientes");
        getContentPane().add(l_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 300, -1));

        b_insertar.setBackground(new java.awt.Color(25, 153, 0));
        b_insertar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        b_insertar.setForeground(new java.awt.Color(255, 255, 255));
        b_insertar.setText("Insertar");
        b_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_insertarActionPerformed(evt);
            }
        });
        getContentPane().add(b_insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        b_actualizar.setBackground(new java.awt.Color(25, 153, 0));
        b_actualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        b_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        b_actualizar.setText("Actualizar");
        getContentPane().add(b_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        b_borrar.setBackground(new java.awt.Color(25, 153, 0));
        b_borrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        b_borrar.setForeground(new java.awt.Color(255, 255, 255));
        b_borrar.setText("Borrar");
        getContentPane().add(b_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jButton4.setBackground(new java.awt.Color(25, 153, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton4.setText("Buscar");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 70, -1, 70));

        id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id.setText("ID");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, -1, -1));

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre.setText("Nombre");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, 130, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Buscar clientes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 150, 20));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 1040, 300));

        l_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_clientes.jpg"))); // NOI18N
        getContentPane().add(l_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_b_salirActionPerformed

    private void b_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volverActionPerformed
        dispose();
        //abrinr ventana de clientes
        new VentanaPrincipal().setVisible(true);
    }//GEN-LAST:event_b_volverActionPerformed

    private void b_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_insertarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_insertarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_actualizar;
    private javax.swing.JButton b_borrar;
    private javax.swing.JButton b_insertar;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton b_volver;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_logo;
    private javax.swing.JLabel l_text;
    private javax.swing.JLabel nombre;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
