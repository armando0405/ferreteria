package ventanas;

import java.awt.Image;
import java.awt.Toolkit;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    public VentanaPrincipal() {
        initComponents();
                Image icono =  Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png"));
        setIconImage(icono);
        
        // poner el fomrulario en el centro
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_icono = new javax.swing.JLabel();
        l_text = new javax.swing.JLabel();
        b_clientes = new javax.swing.JButton();
        b_productos = new javax.swing.JButton();
        b_ventas = new javax.swing.JButton();
        b_almacen = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        copy = new javax.swing.JLabel();
        b_email = new javax.swing.JButton();
        b_volver = new javax.swing.JButton();
        l_fondo = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        m_opciones = new javax.swing.JMenu();
        opcion_abrir = new javax.swing.JMenuItem();
        opcion_guardar = new javax.swing.JMenuItem();
        opcion_salir = new javax.swing.JMenuItem();
        m_ayuda = new javax.swing.JMenu();
        acercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_principal.png"))); // NOI18N
        getContentPane().add(l_icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 142));

        l_text.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        l_text.setText("Modulo De Administracion");
        getContentPane().add(l_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 400, -1));

        b_clientes.setBackground(new java.awt.Color(25, 153, 0));
        b_clientes.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        b_clientes.setForeground(new java.awt.Color(255, 255, 255));
        b_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        b_clientes.setText("Clientes");
        b_clientes.setBorder(null);
        b_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clientesActionPerformed(evt);
            }
        });
        getContentPane().add(b_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 80));

        b_productos.setBackground(new java.awt.Color(25, 153, 0));
        b_productos.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        b_productos.setForeground(new java.awt.Color(255, 255, 255));
        b_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        b_productos.setText("Productos");
        b_productos.setBorder(null);
        b_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_productosActionPerformed(evt);
            }
        });
        getContentPane().add(b_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 200, 80));

        b_ventas.setBackground(new java.awt.Color(25, 153, 0));
        b_ventas.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        b_ventas.setForeground(new java.awt.Color(255, 255, 255));
        b_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/ventas.png"))); // NOI18N
        b_ventas.setText("Ventas");
        b_ventas.setBorder(null);
        getContentPane().add(b_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 200, 80));

        b_almacen.setBackground(new java.awt.Color(25, 153, 0));
        b_almacen.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        b_almacen.setForeground(new java.awt.Color(255, 255, 255));
        b_almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/almacen.png"))); // NOI18N
        b_almacen.setText("Almacen");
        b_almacen.setBorder(null);
        getContentPane().add(b_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 200, 80));

        b_salir.setBackground(new java.awt.Color(5, 153, 0));
        b_salir.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b_salir.setForeground(new java.awt.Color(255, 255, 255));
        b_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/salir.png"))); // NOI18N
        b_salir.setText("Salir");
        b_salir.setBorder(null);
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });
        getContentPane().add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, 120, 45));

        copy.setText("famaCorporation System  ©");
        getContentPane().add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 166, -1));

        b_email.setBackground(new java.awt.Color(5, 153, 0));
        b_email.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b_email.setForeground(new java.awt.Color(255, 255, 255));
        b_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/email.png"))); // NOI18N
        b_email.setText("E-mail");
        b_email.setBorder(null);
        b_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_emailActionPerformed(evt);
            }
        });
        getContentPane().add(b_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 120, 45));

        b_volver.setBackground(new java.awt.Color(5, 153, 0));
        b_volver.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b_volver.setForeground(new java.awt.Color(255, 255, 255));
        b_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/volver.png"))); // NOI18N
        b_volver.setText("Volver");
        b_volver.setBorder(null);
        getContentPane().add(b_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 120, 45));

        l_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventanas/fondo_principal.jpg"))); // NOI18N
        getContentPane().add(l_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1010, 410));

        menubar.setBackground(new java.awt.Color(25, 153, 0));
        menubar.setForeground(new java.awt.Color(255, 255, 255));

        m_opciones.setBackground(new java.awt.Color(25, 153, 0));
        m_opciones.setForeground(new java.awt.Color(255, 255, 255));
        m_opciones.setText("Opciones");

        opcion_abrir.setBackground(new java.awt.Color(25, 153, 0));
        opcion_abrir.setForeground(new java.awt.Color(255, 255, 255));
        opcion_abrir.setText("Abrir");
        opcion_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_abrirActionPerformed(evt);
            }
        });
        m_opciones.add(opcion_abrir);

        opcion_guardar.setBackground(new java.awt.Color(25, 153, 0));
        opcion_guardar.setForeground(new java.awt.Color(255, 255, 255));
        opcion_guardar.setText("Guardar");
        m_opciones.add(opcion_guardar);

        opcion_salir.setBackground(new java.awt.Color(25, 153, 0));
        opcion_salir.setForeground(new java.awt.Color(255, 255, 255));
        opcion_salir.setText("Salir");
        m_opciones.add(opcion_salir);

        menubar.add(m_opciones);

        m_ayuda.setBackground(new java.awt.Color(25, 153, 0));
        m_ayuda.setForeground(new java.awt.Color(255, 255, 255));
        m_ayuda.setText("Ayuda");

        acercade.setBackground(new java.awt.Color(25, 153, 0));
        acercade.setForeground(new java.awt.Color(255, 255, 255));
        acercade.setText("Acerca de");
        m_ayuda.add(acercade);

        menubar.add(m_ayuda);

        setJMenuBar(menubar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_clientesActionPerformed

    private void b_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_productosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_productosActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_salirActionPerformed

    private void b_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_emailActionPerformed

    private void opcion_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_abrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion_abrirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acercade;
    private javax.swing.JButton b_almacen;
    private javax.swing.JButton b_clientes;
    private javax.swing.JButton b_email;
    private javax.swing.JButton b_productos;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton b_ventas;
    private javax.swing.JButton b_volver;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_icono;
    private javax.swing.JLabel l_text;
    private javax.swing.JMenu m_ayuda;
    private javax.swing.JMenu m_opciones;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem opcion_abrir;
    private javax.swing.JMenuItem opcion_guardar;
    private javax.swing.JMenuItem opcion_salir;
    // End of variables declaration//GEN-END:variables
}
