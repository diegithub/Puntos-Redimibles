package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import clase.Conexion;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RegistrarUsuarios extends javax.swing.JFrame {

    String user;

    public RegistrarUsuarios() {
        initComponents();

        user = Login.user;

        setSize(620, 350);
        setResizable(false);
        setTitle("Registrar nuevo usuario - Sesion de " + user);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/fondo_wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(),
                jLabel_Wallpaper.getWidth()));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        jButton_RegistrarUsuario.setIcon(setIcono("/images/agregar_usuario.png", jButton_RegistrarUsuario));
        jButton_RegistrarUsuario.setPressedIcon(setIconoPresionado("/images/agregar_usuario.png", jButton_RegistrarUsuario, 20, 20));

        jButton_GestionarUsuarios.setIcon(setIcono("/images/usuarios.png", jButton_GestionarUsuarios));
        jButton_GestionarUsuarios.setPressedIcon(setIconoPresionado("/images/usuarios.png", jButton_GestionarUsuarios, 20, 20));
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo_icon render.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_Documento = new javax.swing.JLabel();
        jTextField_Nombres = new javax.swing.JTextField();
        jLabel_Nombres = new javax.swing.JLabel();
        jTextField_Documento = new javax.swing.JTextField();
        jLabel_Apellidos = new javax.swing.JLabel();
        jTextField_Apellidos = new javax.swing.JTextField();
        jLabel_Telefono = new javax.swing.JLabel();
        jTextField_Telefono = new javax.swing.JTextField();
        jLabel_Usuario = new javax.swing.JLabel();
        jTextField_Usuario = new javax.swing.JTextField();
        jLabel_Contraseña = new javax.swing.JLabel();
        jButton_RegistrarUsuario = new javax.swing.JButton();
        jPasswordField_Contraseña = new javax.swing.JPasswordField();
        jButton_GestionarUsuarios = new javax.swing.JButton();
        jLabel_AgregarUsuario = new javax.swing.JLabel();
        jLabel_GestionarUsuarios = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Registro de usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel_Documento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Documento.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_Documento.setText("Documento");
        getContentPane().add(jLabel_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField_Nombres.setBackground(new java.awt.Color(0, 51, 153));
        jTextField_Nombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Nombres.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Nombres.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Nombres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_Nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_NombresKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, -1));

        jLabel_Nombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Nombres.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_Nombres.setText("Nombres");
        getContentPane().add(jLabel_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jTextField_Documento.setBackground(new java.awt.Color(0, 51, 153));
        jTextField_Documento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Documento.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Documento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Documento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_Documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_DocumentoKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        jLabel_Apellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Apellidos.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_Apellidos.setText("Apellidos");
        getContentPane().add(jLabel_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jTextField_Apellidos.setBackground(new java.awt.Color(0, 51, 153));
        jTextField_Apellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Apellidos.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Apellidos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Apellidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ApellidosKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, -1));

        jLabel_Telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Telefono.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_Telefono.setText("Telefono");
        getContentPane().add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jTextField_Telefono.setBackground(new java.awt.Color(0, 51, 153));
        jTextField_Telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Telefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_TelefonoKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, -1));

        jLabel_Usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Usuario.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_Usuario.setText("Usuario");
        getContentPane().add(jLabel_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jTextField_Usuario.setBackground(new java.awt.Color(0, 51, 153));
        jTextField_Usuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Usuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_UsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 210, -1));

        jLabel_Contraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Contraseña.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_Contraseña.setText("Contraseña");
        getContentPane().add(jLabel_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jButton_RegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 100, 80));

        jPasswordField_Contraseña.setBackground(new java.awt.Color(0, 51, 153));
        jPasswordField_Contraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordField_Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_Contraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordField_Contraseña.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField_Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_ContraseñaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 210, -1));

        jButton_GestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GestionarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_GestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 100, 80));

        jLabel_AgregarUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_AgregarUsuario.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_AgregarUsuario.setText("Agregar usuario");
        getContentPane().add(jLabel_AgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jLabel_GestionarUsuarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_GestionarUsuarios.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_GestionarUsuarios.setText("Gestionar usuarios");
        getContentPane().add(jLabel_GestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        jLabel_Wallpaper.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Wallpaper.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarUsuarioActionPerformed
        int validacion = 0;
        String documento, nombres, apellidos, telefono, usuario, contraseña;

        documento = jTextField_Nombres.getText().trim();
        nombres = jTextField_Documento.getText().trim();
        apellidos = jTextField_Apellidos.getText().trim();
        telefono = jTextField_Telefono.getText().trim();
        usuario = jTextField_Usuario.getText().trim();
        contraseña = jPasswordField_Contraseña.getText().trim();

        if (documento.equals("")) {
            jTextField_Nombres.setBackground(Color.red);
            validacion++;
        }
        if (nombres.equals("")) {
            jTextField_Documento.setBackground(Color.red);
            validacion++;
        }
        if (apellidos.equals("")) {
            jTextField_Apellidos.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            jTextField_Telefono.setBackground(Color.red);
            validacion++;
        }
        if (usuario.equals("")) {
            jTextField_Usuario.setBackground(Color.red);
            validacion++;
        }
        if (contraseña.equals("")) {
            jPasswordField_Contraseña.setBackground(Color.red);
            validacion++;
        }
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("Select Usuario from usuarios where Usuario = '" + usuario + "'");

            ResultSet resultado = orden.executeQuery();

            if (resultado.next()) {
                jTextField_Usuario.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "nombre de Usuario no disponible");
                cn.close();
            } else {
                cn.close();
                if (validacion == 0) {

                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement orden2 = cn2.prepareStatement("insert into usuarios values(?,?,?,?,?,?,?,?)");

                        orden2.setInt(1, 0);
                        orden2.setString(2, jTextField_Documento.getText().trim());
                        orden2.setString(3, jTextField_Nombres.getText().trim());
                        orden2.setString(4, jTextField_Apellidos.getText().trim());
                        orden2.setString(5, jTextField_Telefono.getText().trim());
                        orden2.setString(6, jTextField_Usuario.getText().trim());
                        orden2.setString(7, jPasswordField_Contraseña.getText().trim());
                        orden2.setString(8, "Activo");

                        orden2.executeUpdate();
                        cn2.close();

                        Limpiar();

                        jTextField_Nombres.setBackground(Color.GREEN);
                        jTextField_Documento.setBackground(Color.GREEN);
                        jTextField_Apellidos.setBackground(Color.GREEN);
                        jTextField_Telefono.setBackground(Color.GREEN);
                        jTextField_Usuario.setBackground(Color.GREEN);
                        jPasswordField_Contraseña.setBackground(Color.GREEN);

                        JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
                        this.dispose();

                    } catch (SQLException e) {
                        System.err.println("Error al registrar usuario." + e);
                        JOptionPane.showMessageDialog(null, "¡¡Error al registrar!!, contacte al administrador");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los datos");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error en validar nombre de usuario." + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al comparar usuario!!, contacte al administrador");
        }

    }//GEN-LAST:event_jButton_RegistrarUsuarioActionPerformed

    private void jButton_GestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GestionarUsuariosActionPerformed
        GestionarUsuarios gestionar = new GestionarUsuarios();
        gestionar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_GestionarUsuariosActionPerformed

    private void jTextField_DocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DocumentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField_Nombres.requestFocus();

        }
    }//GEN-LAST:event_jTextField_DocumentoKeyPressed

    private void jTextField_NombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NombresKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField_Apellidos.requestFocus();

        }
    }//GEN-LAST:event_jTextField_NombresKeyPressed

    private void jTextField_ApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ApellidosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField_Telefono.requestFocus();

        }
    }//GEN-LAST:event_jTextField_ApellidosKeyPressed

    private void jTextField_TelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TelefonoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField_Usuario.requestFocus();

        }
    }//GEN-LAST:event_jTextField_TelefonoKeyPressed

    private void jTextField_UsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordField_Contraseña.requestFocus();

        }
    }//GEN-LAST:event_jTextField_UsuarioKeyPressed

    private void jPasswordField_ContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_ContraseñaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton_RegistrarUsuario.requestFocus();
            jButton_RegistrarUsuario.doClick();
        }
    }//GEN-LAST:event_jPasswordField_ContraseñaKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuarios().setVisible(true);
            }
        });
    }

    private Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    private Icon setIconoPresionado(String url, JButton boton, int ancho, int altura) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = boton.getWidth() - ancho;
        int height = boton.getHeight() - altura;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        return icono;
    }

    public void Limpiar() {
        jTextField_Nombres.setText("");
        jTextField_Documento.setText("");
        jTextField_Apellidos.setText("");
        jTextField_Telefono.setText("");
        jTextField_Usuario.setText("");
        jPasswordField_Contraseña.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GestionarUsuarios;
    private javax.swing.JButton jButton_RegistrarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_AgregarUsuario;
    private javax.swing.JLabel jLabel_Apellidos;
    private javax.swing.JLabel jLabel_Contraseña;
    private javax.swing.JLabel jLabel_Documento;
    private javax.swing.JLabel jLabel_GestionarUsuarios;
    private javax.swing.JLabel jLabel_Nombres;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField jPasswordField_Contraseña;
    private javax.swing.JTextField jTextField_Apellidos;
    private javax.swing.JTextField jTextField_Documento;
    private javax.swing.JTextField jTextField_Nombres;
    private javax.swing.JTextField jTextField_Telefono;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
