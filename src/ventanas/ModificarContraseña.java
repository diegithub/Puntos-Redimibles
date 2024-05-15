
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


public class ModificarContraseña extends javax.swing.JFrame {
  String user = "", user_Update = "";
    
    public ModificarContraseña() {
        initComponents();
        
        user = Login.user;
        user_Update = GestionarUsuarios.user_Update;
        
        setSize(370, 290);
        setResizable(false);
        setTitle("Cambio de contraseña para " + user_Update);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/fondo_wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(),
                jLabel_Wallpaper.getWidth()));
        jLabel_Wallpaper.setIcon(icono);
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

        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_NuevaContraseña = new javax.swing.JLabel();
        jLabel_ConfirmarContraseña1 = new javax.swing.JLabel();
        jPasswordField_NuevaContraseña = new javax.swing.JPasswordField();
        jPasswordField_ConfirmarContraseña1 = new javax.swing.JPasswordField();
        jButton_RestablecerContraseña = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_Titulo.setText("Cambio de contraseña");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel_NuevaContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_NuevaContraseña.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_NuevaContraseña.setText("Nueva contraseña");
        getContentPane().add(jLabel_NuevaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel_ConfirmarContraseña1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_ConfirmarContraseña1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_ConfirmarContraseña1.setText("Confirmar contraseña");
        getContentPane().add(jLabel_ConfirmarContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jPasswordField_NuevaContraseña.setBackground(new java.awt.Color(0, 51, 153));
        jPasswordField_NuevaContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordField_NuevaContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_NuevaContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_NuevaContraseña.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField_NuevaContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_NuevaContraseñaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField_NuevaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, -1));

        jPasswordField_ConfirmarContraseña1.setBackground(new java.awt.Color(0, 51, 153));
        jPasswordField_ConfirmarContraseña1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordField_ConfirmarContraseña1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_ConfirmarContraseña1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_ConfirmarContraseña1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField_ConfirmarContraseña1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_ConfirmarContraseña1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField_ConfirmarContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, -1));

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
        getContentPane().add(jButton_RestablecerContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 35));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RestablecerContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RestablecerContraseñaActionPerformed
       String contraseña, confirmarContraeña;
       
       contraseña = jPasswordField_NuevaContraseña.getText().trim();
       confirmarContraeña = jPasswordField_ConfirmarContraseña1.getText().trim();
       
       if(!contraseña.equals("")&& !confirmarContraeña.equals("")){
        if(contraseña.equals(confirmarContraeña)){
            try {
            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("update usuarios set Contraseña =? where Usuario = '" + user_Update + "'");
            
            orden.setString(1, contraseña);
            orden.executeUpdate();
            cn.close();
            
            jPasswordField_NuevaContraseña.setBackground(Color.GREEN);
            jPasswordField_ConfirmarContraseña1.setBackground(Color.GREEN);
            
            JOptionPane.showMessageDialog(null, "Contraseña modificada exitosamente");
            this.dispose();
            
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al restaurar contraseña");
            }
        }else{
          jPasswordField_ConfirmarContraseña1.setBackground(Color.red); 
          JOptionPane.showMessageDialog(null, "Contraseñas no coinciden");  
        }
       }else{
          jPasswordField_ConfirmarContraseña1.setBackground(Color.red);
          jPasswordField_NuevaContraseña.setBackground(Color.red);
          JOptionPane.showMessageDialog(null, "No se admiten contraseñas vacias");
       }
       
        
    }//GEN-LAST:event_jButton_RestablecerContraseñaActionPerformed

    private void jPasswordField_NuevaContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_NuevaContraseñaKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           jPasswordField_ConfirmarContraseña1.requestFocus();
            
        }
    }//GEN-LAST:event_jPasswordField_NuevaContraseñaKeyPressed

    private void jPasswordField_ConfirmarContraseña1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_ConfirmarContraseña1KeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            jButton_RestablecerContraseña.requestFocus();
            jButton_RestablecerContraseña.doClick();
        }
    }//GEN-LAST:event_jPasswordField_ConfirmarContraseña1KeyPressed
     
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_RestablecerContraseña;
    private javax.swing.JLabel jLabel_ConfirmarContraseña1;
    private javax.swing.JLabel jLabel_NuevaContraseña;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField jPasswordField_ConfirmarContraseña1;
    private javax.swing.JPasswordField jPasswordField_NuevaContraseña;
    // End of variables declaration//GEN-END:variables
}
