
package ventanas;
import java.sql.ResultSet;
import java.sql.Statement;
import conexiones.Conexiones;
import java.sql.PreparedStatement;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Font;
import  java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class VentanaClientes extends javax.swing.JFrame {

    public VentanaClientes() {
        initComponents();
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png"));
        setIconImage(icono);

        // poner el fomrulario en el centro
        setLocationRelativeTo(null);
        setResizable(false);

        mostrar("clientes");

    }
    


    public void mostrar(String tabla) {
        String sql = "select * from " + tabla;
        Connection conectar = Conexiones.conectar();

        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Id_cliente", "Nombre", "Direccion", "Telefono"}
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // Crear el modelo...
        tabla1.setModel(modelo);

        // Cambiar la fuente
        tabla1.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 14));

        // Centrar encabezados
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tabla1.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);

        for (int f = 0; f < tabla1.getColumnCount(); f++) {
            tabla1.getColumnModel().getColumn(f).setResizable(false);

        }
        String[] datos = new String[4];
        try {
            Statement consulta = conectar.createStatement();
            ResultSet resultado = consulta.executeQuery(sql);

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

        centrarTexto(tabla1);

    }

    //Método para centrar los valores en cada celda
    public void centrarTexto(JTable tabla) {
        DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
        centrado.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centrado);
        }
    }
    
    public void buscarIdUsuario() {
        String id = t_id.getText();
        // crear la conexion a la base de datos
        Connection conectar = Conexiones.conectar();
        
        String sql = "select * from clientes  where id_cliente = ?";
        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
        modelo.setRowCount(0);
        
        // Validar que sea numérico
        int id_probar;
        try {
            id_probar = Integer.parseInt(id);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número entero.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
    
        try {
            PreparedStatement consulta = conectar.prepareStatement(sql);
            consulta.setString(1, id);
            ResultSet resultado = consulta.executeQuery();
            
            if (resultado.next()) {
                String[] datos = {
                    resultado.getString("id_cliente"),
                    resultado.getString("nombre"),
                    resultado.getString("Direccion"),
                    resultado.getString("telefono"),
                };
                modelo.addRow(datos);
                
            }else{
                 JOptionPane.showMessageDialog(this, "ID DE CLIENTE NO ENCOTRADO", "RESULTADO DE BUSQUEDA", JOptionPane.INFORMATION_MESSAGE);
                 
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            JOptionPane.showMessageDialog(null, "ERROR-> "+ e, "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void buscarNombeUsuario() {
        String nombre = t_nombre.getText();

       Connection conectar = Conexiones.conectar();
        String sql = "select * from clientes  where nombre  like ?";
        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
        modelo.setRowCount(0);

        try {
            PreparedStatement consulta = conectar.prepareStatement(sql);
            consulta.setString(1, "%" + nombre + "%");
            ResultSet resultado = consulta.executeQuery();
            
            boolean encontrado = false;
            while (resultado.next()) {
                String[] datos = {
                    resultado.getString("id_cliente"),
                    resultado.getString("nombre"), 
                    resultado.getString("Direccion"),
                    resultado.getString("telefono"),
                };
                
                modelo.addRow(datos);
                
                // controlar si no se ecnotraron datos 
                encontrado = true;
            }
            
            if (!encontrado){
                JOptionPane.showMessageDialog(this, "NO SE ENCONTRARON REGISTROS CON ESE NOMBRE", "RESULTADO DE BUSQUEDA", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR-> "+ e, "ERROR0",JOptionPane.ERROR_MESSAGE);
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
        b_buscar = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        t_id = new javax.swing.JTextField();
        t_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        b_refrescar = new javax.swing.JButton();
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
        b_volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        b_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        b_insertar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_insertarActionPerformed(evt);
            }
        });
        getContentPane().add(b_insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 179, 90, 30));

        b_actualizar.setBackground(new java.awt.Color(25, 153, 0));
        b_actualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        b_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        b_actualizar.setText("Actualizar");
        b_actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(b_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 179, 100, 30));

        b_borrar.setBackground(new java.awt.Color(25, 153, 0));
        b_borrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        b_borrar.setForeground(new java.awt.Color(255, 255, 255));
        b_borrar.setText("Borrar");
        b_borrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 179, 70, 30));

        b_buscar.setBackground(new java.awt.Color(25, 153, 0));
        b_buscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        b_buscar.setForeground(new java.awt.Color(255, 255, 255));
        b_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        b_buscar.setText("Buscar");
        b_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 70, -1, 70));

        id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id.setText("ID");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, -1, -1));

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre.setText("Nombre");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, -1, -1));

        t_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idActionPerformed(evt);
            }
        });
        getContentPane().add(t_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, 130, -1));
        getContentPane().add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, 130, -1));

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

        b_refrescar.setBackground(new java.awt.Color(5, 153, 0));
        b_refrescar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b_refrescar.setForeground(new java.awt.Color(255, 255, 255));
        b_refrescar.setText("Refrescar");
        b_refrescar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refrescarActionPerformed(evt);
            }
        });
        getContentPane().add(b_refrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 120, 45));

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
        new VentanaInsertarCliente().setVisible(true);
    }//GEN-LAST:event_b_insertarActionPerformed

    private void t_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_idActionPerformed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        if (!t_id.getText().isEmpty()) {
            buscarIdUsuario();
        } else if (!t_nombre.getText().isEmpty()) {
            buscarNombeUsuario();
        } else {
            JOptionPane.showMessageDialog(null, "DEBES LLENAR LOS CAMPOS", "ALERTA", JOptionPane.WARNING_MESSAGE);

        }
        t_id.setText("");
        t_nombre.setText("");
    }//GEN-LAST:event_b_buscarActionPerformed

    private void b_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_actualizarActionPerformed
       new VentanaActualizarCliente().setVisible(true);
    }//GEN-LAST:event_b_actualizarActionPerformed

    private void b_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrarActionPerformed
        // TODO add your handling code here:
        new VentanaBorrarClientes().setVisible(true);
    }//GEN-LAST:event_b_borrarActionPerformed

    private void b_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refrescarActionPerformed
        mostrar("clientes");
        //aqui esta ya
    }//GEN-LAST:event_b_refrescarActionPerformed

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
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_insertar;
    private javax.swing.JButton b_refrescar;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton b_volver;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_logo;
    private javax.swing.JLabel l_text;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField t_id;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
