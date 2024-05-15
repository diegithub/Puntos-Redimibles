package ventanas;

import java.sql.*;
import clase.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class InformacionUsuario extends javax.swing.JFrame {

    String user = "", user_Update = "";
    int ID;

    public InformacionUsuario() {
        initComponents();
        user = Login.user;
        user_Update = GestionarUsuarios.user_Update;

        setSize(640, 450);
        setResizable(false);
        setTitle("Informacion del usuario " + user_Update + " - sesion de " + user);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/fondo_wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(),
                jLabel_Wallpaper.getWidth()));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        jLabel_Titulo.setText("Informacion del usuario - " + user_Update);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("select * from usuarios where Usuario = '" + user_Update + "'");

            ResultSet resultado = orden.executeQuery();

            if (resultado.next()) {
                ID = resultado.getInt("ID");

                jTextField_Documento.setText(resultado.getString("Documento"));
                jTextField_Nombres.setText(resultado.getString("Nombres"));
                jTextField_Apellidos.setText(resultado.getString("Apellidos"));
                jTextField_Telefono.setText(resultado.getString("Telefono"));
                jTextField_Usuario.setText(resultado.getString("Usuario"));

                jComboBox_Estatus.setSelectedItem(resultado.getString("Estatus"));

            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al cargar usuario." + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al cargar informacion!!, contacte al administrador");
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo_icon render.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Documento = new javax.swing.JLabel();
        jLabel_Nombres = new javax.swing.JLabel();
        jLabel_Apellidos = new javax.swing.JLabel();
        jLabel_Telefono = new javax.swing.JLabel();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_Estatus = new javax.swing.JLabel();
        jLabel_PermisoDe = new javax.swing.JLabel();
        jTextField_Documento = new javax.swing.JTextField();
        jTextField_Nombres = new javax.swing.JTextField();
        jTextField_Apellidos = new javax.swing.JTextField();
        jTextField_Telefono = new javax.swing.JTextField();
        jTextField_Usuario = new javax.swing.JTextField();
        jTextField_RegistradoPor = new javax.swing.JTextField();
        jComboBox_Estatus = new javax.swing.JComboBox<>();
        jButton_ActualizarUsuario = new javax.swing.JButton();
        jButton_RestablecerContraseña = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Informacion del usuario");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel_Documento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Documento.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Documento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Documento.setText("Documento");
        getContentPane().add(jLabel_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel_Nombres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Nombres.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Nombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Nombres.setText("Nombres");
        getContentPane().add(jLabel_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel_Apellidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Apellidos.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Apellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Apellidos.setText("Apellidos");
        getContentPane().add(jLabel_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel_Telefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Telefono.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Telefono.setText("Telefono");
        getContentPane().add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel_Usuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Usuario.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Usuario.setText("Usuario");
        getContentPane().add(jLabel_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jLabel_Estatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Estatus.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Estatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Estatus.setText("Estatus");
        getContentPane().add(jLabel_Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel_PermisoDe.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_PermisoDe.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_PermisoDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_PermisoDe.setText("Registrado por:");
        getContentPane().add(jLabel_PermisoDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        jTextField_Documento.setBackground(new java.awt.Color(0, 51, 102));
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

        jTextField_Nombres.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_Nombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Nombres.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Nombres.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Nombres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_Nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_NombresKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        jTextField_Apellidos.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_Apellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Apellidos.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Apellidos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Apellidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ApellidosKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        jTextField_Telefono.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_Telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Telefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_TelefonoKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, -1));

        jTextField_Usuario.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_Usuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Usuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 210, -1));

        jTextField_RegistradoPor.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_RegistradoPor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_RegistradoPor.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_RegistradoPor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_RegistradoPor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_RegistradoPor.setEnabled(false);
        jTextField_RegistradoPor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_RegistradoPorKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_RegistradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 210, -1));

        jComboBox_Estatus.setForeground(new java.awt.Color(0, 51, 102));
        jComboBox_Estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jComboBox_Estatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox_EstatusKeyPressed(evt);
            }
        });
        getContentPane().add(jComboBox_Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jButton_ActualizarUsuario.setBackground(new java.awt.Color(0, 51, 102));
        jButton_ActualizarUsuario.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton_ActualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ActualizarUsuario.setText("Actualizar usuario");
        jButton_ActualizarUsuario.setBorder(null);
        jButton_ActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ActualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 210, 35));

        jButton_RestablecerContraseña.setBackground(new java.awt.Color(0, 51, 102));
        jButton_RestablecerContraseña.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton_RestablecerContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jButton_RestablecerContraseña.setText("Restaurar contraseña");
        jButton_RestablecerContraseña.setBorder(null);
        jButton_RestablecerContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RestablecerContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RestablecerContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 210, 35));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarUsuarioActionPerformed
        int estatus_cmb, validacion = 0;
        String documento, nombres, apellidos, telefono, usuario, estatus_string = "";

        documento = jTextField_Documento.getText().trim();
        nombres = jTextField_Nombres.getText().trim();
        apellidos = jTextField_Apellidos.getText().trim();
        telefono = jTextField_Telefono.getText().trim();
        usuario = jTextField_Usuario.getText().trim();

        estatus_cmb = jComboBox_Estatus.getSelectedIndex() + 1;

        if (documento.equals(" ")) {
            jTextField_Documento.setBackground(Color.red);
            validacion++;
        }
        if (nombres.equals(" ")) {
            jTextField_Nombres.setBackground(Color.red);
            validacion++;
        }
        if (apellidos.equals(" ")) {
            jTextField_Apellidos.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals(" ")) {
            jTextField_Telefono.setBackground(Color.red);
            validacion++;
        }
        if (usuario.equals(" ")) {
            jTextField_Usuario.setBackground(Color.red);
            validacion++;
        }
        if (validacion == 0) {
            if (estatus_cmb == 1) {
                estatus_string = "Activo";
            } else if (estatus_cmb == 2) {
                estatus_string = "Inactivo";
            }

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement orden = cn.prepareStatement(
                        "select Usuario from usuarios where usuario = '" + usuario + "'and not ID = '" + ID + "'");

                ResultSet resultado = orden.executeQuery();

                if (resultado.next()) {
                    jTextField_Usuario.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                    cn.close();
                } else {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement orden2 = cn2.prepareStatement(
                            "update usuarios set Documento = ?, Nombres = ?, Apellidos = ?, Telefono = ?, Usuario = ?, Estatus = ? "
                            + "where  ID = '" + ID + "'");

                    orden2.setString(1, documento);
                    orden2.setString(2, nombres);
                    orden2.setString(3, apellidos);
                    orden2.setString(4, telefono);
                    orden2.setString(5, usuario);
                    orden2.setString(6, estatus_string);

                    orden2.executeUpdate();
                    cn2.close();

                    JOptionPane.showMessageDialog(null, "Modificacion de datos exitosa");
                    this.dispose();
                }
            } catch (SQLException e) {
                System.err.println("Error al actualizar" + e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }


    }//GEN-LAST:event_jButton_ActualizarUsuarioActionPerformed

    private void jButton_RestablecerContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RestablecerContraseñaActionPerformed
        ModificarContraseña modificarContraseña = new ModificarContraseña();
        modificarContraseña.setVisible(true);
    }//GEN-LAST:event_jButton_RestablecerContraseñaActionPerformed

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
            jTextField_Telefono.requestFocus();

        }
    }//GEN-LAST:event_jTextField_TelefonoKeyPressed

    private void jComboBox_EstatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox_EstatusKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField_RegistradoPor.requestFocus();

        }
    }//GEN-LAST:event_jComboBox_EstatusKeyPressed

    private void jTextField_RegistradoPorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_RegistradoPorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton_ActualizarUsuario.requestFocus();
            jButton_ActualizarUsuario.doClick();
        }
    }//GEN-LAST:event_jTextField_RegistradoPorKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ActualizarUsuario;
    private javax.swing.JButton jButton_RestablecerContraseña;
    private javax.swing.JComboBox<String> jComboBox_Estatus;
    private javax.swing.JLabel jLabel_Apellidos;
    private javax.swing.JLabel jLabel_Documento;
    private javax.swing.JLabel jLabel_Estatus;
    private javax.swing.JLabel jLabel_Nombres;
    private javax.swing.JLabel jLabel_PermisoDe;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField jTextField_Apellidos;
    private javax.swing.JTextField jTextField_Documento;
    private javax.swing.JTextField jTextField_Nombres;
    private javax.swing.JTextField jTextField_RegistradoPor;
    private javax.swing.JTextField jTextField_Telefono;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
