package ventanas;

import clase.Conexion;
import clase.LeerTxt;
import java.sql.*;
import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;

import com.itextpdf.text.pdf.PdfPCell;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.WindowConstants;

public class Terceros extends javax.swing.JFrame {

    String user = "", maestro_Update = "";
    int ID;

    public Terceros() {
        initComponents();
        user = Login.user;
        maestro_Update = listaMaestros.maestro_Update;

        setTitle("Informacion de " + maestro_Update + " sesion de " + user);
        setSize(620, 420);
        setResizable(false);
        this.setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/fondo_wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(),
                jLabel_Wallpaper.getWidth()));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        jButton_Nuevo.setIcon(setIcono("/images/registrarse.png", jButton_Nuevo));
        jButton_Nuevo.setPressedIcon(setIconoPresionado("/images/registrarse.png", jButton_Nuevo, 20, 20));

        jButton_Modificar.setIcon(setIcono("/images/editar.png", jButton_Modificar));
        jButton_Modificar.setPressedIcon(setIconoPresionado("/images/editar.png", jButton_Modificar, 20, 20));

        jButton_Buscar.setIcon(setIcono("/images/buscar.png", jButton_Buscar));
        jButton_Buscar.setPressedIcon(setIconoPresionado("/images/buscar.png", jButton_Buscar, 20, 20));

        jButton_Eliminar.setIcon(setIcono("/images/basura.png", jButton_Eliminar));
        jButton_Eliminar.setPressedIcon(setIconoPresionado("/images/basura.png", jButton_Eliminar, 20, 20));

        jButton_Salir.setIcon(setIcono("/images/salir.png", jButton_Salir));
        jButton_Salir.setPressedIcon(setIconoPresionado("/images/salir.png", jButton_Salir, 20, 20));

        jButton_generarPDF.setIcon(setIcono("/images/pdf.png", jButton_generarPDF));
        jButton_generarPDF.setPressedIcon(setIconoPresionado("/images/pdf.png", jButton_generarPDF, 20, 20));

        jButton_Listar.setIcon(setIcono("/images/lista.png", jButton_Listar));
        jButton_Listar.setPressedIcon(setIconoPresionado("/images/lista.png", jButton_Listar, 20, 20));

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("select * from maestros where Documento = '" + maestro_Update + "'");

            ResultSet resultado = orden.executeQuery();

            if (resultado.next()) {

                jLabel_ID_N.setText(resultado.getString("ID"));
                jTextField_Documento.setText(resultado.getString("Documento"));
                jTextField_Nombres.setText(resultado.getString("NOMBRES"));
                jTextField_Apellidos.setText(resultado.getString("APELLIDOS"));
                jTextField_Direccion.setText(resultado.getString("DIRECCION"));
                jTextField_Telefono.setText(resultado.getString("TELEFONO"));

            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al cargar tercero." + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al cargar informacion!!, contacte al administrador");
        }
    }

    @Override
    public java.awt.Image getIconImage() {
        java.awt.Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo_icon render.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_ID = new javax.swing.JLabel();
        jLabel_ID_N = new javax.swing.JLabel();
        jLabel_Documento = new javax.swing.JLabel();
        jTextField_Documento = new javax.swing.JTextField();
        jLabel_Nombres = new javax.swing.JLabel();
        jTextField_Nombres = new javax.swing.JTextField();
        jTextField_Apellidos = new javax.swing.JTextField();
        jLabel_Apellidos = new javax.swing.JLabel();
        jTextField_Direccion = new javax.swing.JTextField();
        jLabel_Direccion = new javax.swing.JLabel();
        jLabel_Telefono = new javax.swing.JLabel();
        jTextField_Telefono = new javax.swing.JTextField();
        jButton_Nuevo = new javax.swing.JButton();
        jButton_Modificar = new javax.swing.JButton();
        jButton_Buscar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jButton_generarPDF = new javax.swing.JButton();
        jButton_Listar = new javax.swing.JButton();
        jLabel_Agregar = new javax.swing.JLabel();
        jLabel_Modificar = new javax.swing.JLabel();
        jLabel_Buscar = new javax.swing.JLabel();
        jLabel_Eliminar = new javax.swing.JLabel();
        jLabel_Salir = new javax.swing.JLabel();
        jLabel_Pdf = new javax.swing.JLabel();
        jLabel_Pdf1 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_ID.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_ID.setText("ID");
        getContentPane().add(jLabel_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 18, -1, 30));

        jLabel_ID_N.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_ID_N.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(jLabel_ID_N, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 18, 90, 30));

        jLabel_Documento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Documento.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Documento.setText("Nombres");
        getContentPane().add(jLabel_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 146, 80, 30));

        jTextField_Documento.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_Documento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Documento.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DocumentoActionPerformed(evt);
            }
        });
        jTextField_Documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_DocumentoKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 80, 200, 30));

        jLabel_Nombres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Nombres.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Nombres.setText("Numero de Documento");
        getContentPane().add(jLabel_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 80, -1, 30));

        jTextField_Nombres.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_Nombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Nombres.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombresActionPerformed(evt);
            }
        });
        jTextField_Nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_NombresKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 146, 200, 30));

        jTextField_Apellidos.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_Apellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Apellidos.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ApellidosActionPerformed(evt);
            }
        });
        jTextField_Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ApellidosKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 226, 200, 30));

        jLabel_Apellidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Apellidos.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Apellidos.setText("Apellidos");
        getContentPane().add(jLabel_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 226, 80, 30));

        jTextField_Direccion.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_Direccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Direccion.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DireccionActionPerformed(evt);
            }
        });
        jTextField_Direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_DireccionKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 146, 200, 30));

        jLabel_Direccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Direccion.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Direccion.setText("Direccion");
        getContentPane().add(jLabel_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 146, 80, 30));

        jLabel_Telefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Telefono.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Telefono.setText("Telefono");
        getContentPane().add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 226, 80, 30));

        jTextField_Telefono.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_Telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TelefonoActionPerformed(evt);
            }
        });
        jTextField_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_TelefonoKeyPressed(evt);
            }
        });
        getContentPane().add(jTextField_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 226, 200, 30));

        jButton_Nuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, 60));

        jButton_Modificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 80, 60));

        jButton_Buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 80, 60));

        jButton_Eliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 80, 60));

        jButton_Salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 80, 60));

        jButton_generarPDF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_generarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_generarPDFActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_generarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 70, 50));

        jButton_Listar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ListarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 70, 50));

        jLabel_Agregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Agregar.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Agregar.setText("Agregar");
        getContentPane().add(jLabel_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel_Modificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Modificar.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Modificar.setText("Modificar");
        getContentPane().add(jLabel_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        jLabel_Buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Buscar.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Buscar.setText("Buscar");
        getContentPane().add(jLabel_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        jLabel_Eliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Eliminar.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Eliminar.setText("Eliminar");
        getContentPane().add(jLabel_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        jLabel_Salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Salir.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Salir.setText("Salir");
        getContentPane().add(jLabel_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        jLabel_Pdf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Pdf.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Pdf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Pdf.setText("Descargar PDF");
        getContentPane().add(jLabel_Pdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel_Pdf1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Pdf1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Pdf1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Pdf1.setText("Listar");
        getContentPane().add(jLabel_Pdf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DocumentoActionPerformed

    private void jTextField_NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombresActionPerformed

    private void jTextField_ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ApellidosActionPerformed

    private void jTextField_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DireccionActionPerformed

    private void jTextField_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TelefonoActionPerformed

    private void jButton_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NuevoActionPerformed
        try {

            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("insert into maestros values(?,?,?,?,?,?)");
            if (jTextField_Documento.getText().isEmpty() || jTextField_Nombres.getText().isEmpty() || jTextField_Apellidos.getText().isEmpty()
                    || jTextField_Direccion.getText().isEmpty() || jTextField_Telefono.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Debe llenar todos los datos");
            } else {
                orden.setInt(1, 0);
                orden.setString(2, jTextField_Documento.getText().trim());
                orden.setString(3, jTextField_Nombres.getText().trim());
                orden.setString(4, jTextField_Apellidos.getText().trim());
                orden.setString(5, jTextField_Direccion.getText().trim());
                orden.setString(6, jTextField_Telefono.getText().trim());
                orden.executeUpdate();

                jTextField_Documento.setText("");
                jTextField_Nombres.setText("");
                jTextField_Apellidos.setText("");
                jTextField_Direccion.setText("");
                jTextField_Telefono.setText("");

                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al cargar datos." + e);
            JOptionPane.showMessageDialog(null, "Error al registrar datos, contacte al administrador");
        }
    }//GEN-LAST:event_jButton_NuevoActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("select * from maestros where Documento = ?");
            orden.setString(1, jTextField_Documento.getText().trim());

            ResultSet resultado = orden.executeQuery();

            if (resultado.next()) {
                jLabel_ID_N.setText(resultado.getString("ID"));
                jTextField_Nombres.setText(resultado.getString("NOMBRES"));
                jTextField_Apellidos.setText(resultado.getString("APELLIDOS"));
                jTextField_Direccion.setText(resultado.getString("DIRECCION"));
                jTextField_Telefono.setText(resultado.getString("TELEFONO"));

            } else {
                JOptionPane.showMessageDialog(null, "Tercero no encontrado");
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error buscar datos." + e);
            JOptionPane.showMessageDialog(null, "Error al buscar datos, contacte al administrador");

        }
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarActionPerformed

        try {
            String cambiar = jTextField_Documento.getText().trim();
            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("update maestros set NOMBRES = ?, APELLIDOS = ?, DIRECCION = ?, TELEFONO = ? where Documento = " + cambiar);

            //jLabel_ID_N.setText(orden.getResultSet().getString("ID"));
            orden.setString(1, jTextField_Nombres.getText().trim());
            orden.setString(2, jTextField_Apellidos.getText().trim());
            orden.setString(3, jTextField_Direccion.getText().trim());
            orden.setString(4, jTextField_Telefono.getText().trim());

            orden.executeUpdate();

            JOptionPane.showMessageDialog(null, "Tercero modificado con exito");

            jLabel_ID_N.setText(" ");
            jTextField_Documento.setText(" ");
            jTextField_Nombres.setText(" ");
            jTextField_Apellidos.setText(" ");
            jTextField_Direccion.setText(" ");
            jTextField_Telefono.setText(" ");

            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al modificar datos." + e);
            JOptionPane.showMessageDialog(null, "Error al modificar datos, contacte al administrador");

        }
    }//GEN-LAST:event_jButton_ModificarActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("delete from maestros where Documento = ?");

            orden.setString(1, jTextField_Documento.getText().trim());

            orden.executeUpdate();

            jLabel_ID_N.setText(" ");
            jTextField_Documento.setText(" ");
            jTextField_Nombres.setText(" ");
            jTextField_Apellidos.setText(" ");
            jTextField_Direccion.setText(" ");
            jTextField_Telefono.setText(" ");

            JOptionPane.showMessageDialog(null, "Tercero eliminado con exito");

            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al Eliminar datos." + e);
            JOptionPane.showMessageDialog(null, "Error al Eliminar datos, contacte al administrador");
        }
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButton_generarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_generarPDFActionPerformed
        LeerTxt conectar = new LeerTxt();
        Document documento = new Document();
        documento.setMargins(26, 26, 10, 20);

        try {
            String ruta_Pdf = System.getProperty("user.home");
            File rutaPdf = new File("rutaPdf.txt");
            String ruta = conectar.leerTexto(rutaPdf.toString());
            PdfWriter.getInstance(documento, new FileOutputStream(ruta_Pdf + ruta + "Reporte_terceros.pdf"));

            Image imagenPdf = Image.getInstance("src/images/logo.jpg");
            imagenPdf.scaleToFit(300, 1000);
            imagenPdf.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial", 18, Font.BOLD, BaseColor.BLACK));
            parrafo.add("Lista de maestros\n\n");

            documento.open();
            documento.add(imagenPdf);
            documento.add(parrafo);

            float[] anchoColumnas = {2, 2, 2, 2, 2};
            PdfPTable tabla = new PdfPTable(anchoColumnas);
            tabla.setWidthPercentage(100);

            Paragraph document = new Paragraph();
            document.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            document.add("DOCUMENTO");
            PdfPCell DOCUMENTO = new PdfPCell(new Phrase(document));

            Paragraph name = new Paragraph();
            name.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            name.add("NOMBRES");
            PdfPCell NOMBRES = new PdfPCell(new Phrase(name));

            Paragraph surname = new Paragraph();
            surname.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            surname.add("APELLIDOS");
            PdfPCell APELLIDOS = new PdfPCell(new Phrase(surname));

            Paragraph direccion = new Paragraph();
            direccion.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            direccion.add("DIRECCION");
            PdfPCell DIRECCION = new PdfPCell(new Phrase(direccion));

            Paragraph telefono = new Paragraph();
            telefono.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            telefono.add("TELEFONO");
            PdfPCell TELEFONO = new PdfPCell(new Phrase(telefono));

            // tabla.addCell(ID);
            tabla.addCell(DOCUMENTO);
            tabla.addCell(NOMBRES);
            tabla.addCell(APELLIDOS);
            tabla.addCell(DIRECCION);
            tabla.addCell(TELEFONO);

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement orden = cn.prepareStatement("select DOCUMENTO,NOMBRES,APELLIDOS,DIRECCION,TELEFONO from maestros");

                ResultSet resultado = orden.executeQuery();

                if (resultado.next()) {
                    do {
                        tabla.addCell(resultado.getString(1));
                        tabla.addCell(resultado.getString(2));
                        tabla.addCell(resultado.getString(3));
                        tabla.addCell(resultado.getString(4));
                        tabla.addCell(resultado.getString(5));
                        //tabla.addCell(resultado.getString(6));

                    } while (resultado.next());
                    documento.add(tabla);
                }

            } catch (DocumentException | SQLException e) {

            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte generado con exito");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            System.err.println("Error al generar documento." + e);
            JOptionPane.showMessageDialog(null, "Error al generar documento, contacte al administrador");
        } catch (IOException e) {
            System.err.println("Error al generar documento." + e);
        }
    }//GEN-LAST:event_jButton_generarPDFActionPerformed

    private void jButton_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ListarActionPerformed
        listaMaestros listar = new listaMaestros();
        listar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton_ListarActionPerformed

    private void jTextField_DocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DocumentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField_Nombres.requestFocus();

        }
    }//GEN-LAST:event_jTextField_DocumentoKeyPressed

    private void jTextField_ApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ApellidosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField_Direccion.requestFocus();

        }
    }//GEN-LAST:event_jTextField_ApellidosKeyPressed

    private void jTextField_NombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NombresKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField_Apellidos.requestFocus();

        }
    }//GEN-LAST:event_jTextField_NombresKeyPressed

    private void jTextField_DireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DireccionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField_Telefono.requestFocus();

        }
    }//GEN-LAST:event_jTextField_DireccionKeyPressed

    private void jTextField_TelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TelefonoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton_Nuevo.requestFocus();
            jButton_Nuevo.doClick();
        }
    }//GEN-LAST:event_jTextField_TelefonoKeyPressed

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
            java.util.logging.Logger.getLogger(Terceros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Terceros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Terceros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Terceros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Terceros().setVisible(true);
            }
        });
    }

    private Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
        return icono;
    }

    private Icon setIconoPresionado(String url, JButton boton, int ancho, int altura) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = boton.getWidth() - ancho;
        int height = boton.getHeight() - altura;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_DEFAULT));
        return icono;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Listar;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JButton jButton_Nuevo;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JButton jButton_generarPDF;
    private javax.swing.JLabel jLabel_Agregar;
    private javax.swing.JLabel jLabel_Apellidos;
    private javax.swing.JLabel jLabel_Buscar;
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_Documento;
    private javax.swing.JLabel jLabel_Eliminar;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_ID_N;
    private javax.swing.JLabel jLabel_Modificar;
    private javax.swing.JLabel jLabel_Nombres;
    private javax.swing.JLabel jLabel_Pdf;
    private javax.swing.JLabel jLabel_Pdf1;
    private javax.swing.JLabel jLabel_Salir;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField jTextField_Apellidos;
    private javax.swing.JTextField jTextField_Direccion;
    private javax.swing.JTextField jTextField_Documento;
    private javax.swing.JTextField jTextField_Nombres;
    private javax.swing.JTextField jTextField_Telefono;
    // End of variables declaration//GEN-END:variables
}
