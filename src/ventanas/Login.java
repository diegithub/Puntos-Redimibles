package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clase.Conexion;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public static String user = "";
    String pass = "";

    public Login() {
        initComponents();
        setSize(400, 550);
        setResizable(false);
        setTitle("Acceso al sistema");
        setLocationRelativeTo(null);

        ImageIcon wallpaper = new ImageIcon("src/images/fondo_wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel1_Wallpaper.getWidth(), jLabel1_Wallpaper.getHeight(),
                jLabel1_Wallpaper.getWidth()));
        jLabel1_Wallpaper.setIcon(icono);
        this.repaint();

        ImageIcon wollpaper_Logo = new ImageIcon("src/images/logo render.png");
        Icon icono_Logo = new ImageIcon(wollpaper_Logo.getImage().getScaledInstance(jLabel1_Logo.getWidth(), jLabel1_Logo.getHeight(),
                jLabel1_Logo.getWidth()));
        jLabel1_Logo.setIcon(icono_Logo);
        this.repaint();
    }

    @Override

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo_icon render.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_Logo = new javax.swing.JLabel();
        jLabel1_Username = new javax.swing.JLabel();
        jTextField1_Username = new javax.swing.JTextField();
        jLabel1_Password = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1_piePagina = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jLabel1_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 350, 110));

        jLabel1_Username.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_Username.setText("Username");
        getContentPane().add(jLabel1_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 80, 20));

        jTextField1_Username.setBackground(new java.awt.Color(0, 51, 102));
        jTextField1_Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1_Username.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_Username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1_Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1_UsernameKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 250, 210, 25));

        jLabel1_Password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_Password.setText("Password");
        getContentPane().add(jLabel1_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 80, 20));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 400, 210, 35));

        jLabel1_piePagina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1_piePagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_piePagina.setText("Creado por Diego Velasco ®");
        jLabel1_piePagina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1_piePagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 480, 210, -1));

        jPasswordField_Password.setBackground(new java.awt.Color(0, 51, 102));
        jPasswordField_Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField_Password.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_Password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_PasswordKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 310, 210, 25));
        getContentPane().add(jLabel1_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        user = jTextField1_Username.getText().trim();
        pass = jPasswordField_Password.getText().trim();

        if (!user.equals("") || !pass.equals("")) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement orden = cn.prepareStatement("select * from usuarios where Usuario = '" + user + "' and Contraseña = '" + pass + "'");

                ResultSet resultado = orden.executeQuery();

                if (resultado.next()) {
                    String usuarioEstatus = resultado.getString("Estatus");
                    if (usuarioEstatus.equals("Activo")) {
                        dispose();
                        new Administracion().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario inactivo");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                    jTextField1_Username.setText("");
                    jPasswordField_Password.setText("");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "¡Error al iniciar seccion! contacte al administrador");
                System.err.println("Error en el boton ingresar" + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1_UsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_UsernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordField_Password.requestFocus();

        }
    }//GEN-LAST:event_jTextField1_UsernameKeyPressed

    private void jPasswordField_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1.requestFocus();
            jButton1.doClick();
        }
    }//GEN-LAST:event_jPasswordField_PasswordKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1_Logo;
    private javax.swing.JLabel jLabel1_Password;
    private javax.swing.JLabel jLabel1_Username;
    private javax.swing.JLabel jLabel1_Wallpaper;
    private javax.swing.JLabel jLabel1_piePagina;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField1_Username;
    // End of variables declaration//GEN-END:variables
}
