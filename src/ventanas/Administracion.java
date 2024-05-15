package ventanas;

import clase.Conexion;
import clase.LeerTxt;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Administracion extends javax.swing.JFrame {

    public Administracion() {
        initComponents();
        setSize(650, 430);
        setResizable(false);
        setTitle("Administrador");
        setLocationRelativeTo(null);

        ImageIcon wallpaper = new ImageIcon("src/images/fondo_wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(),
                jLabel_Wallpaper.getWidth()));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        ImageIcon wollpaper_Logo = new ImageIcon("src/images/logo render.png");
        Icon icono_Logo = new ImageIcon(wollpaper_Logo.getImage().getScaledInstance(jLabel_Logo.getWidth(), jLabel_Logo.getHeight(),
                jLabel_Logo.getWidth()));
        jLabel_Logo.setIcon(icono_Logo);
        this.repaint();

        jButton_Usuarios.setIcon(setIcono("/images/agregar_usuario.png", jButton_Usuarios));
        jButton_Usuarios.setPressedIcon(setIconoPresionado("/images/agregar_usuario.png", jButton_Usuarios, 20, 20));

        jButton_Maestros.setIcon(setIcono("/images/maestros.png", jButton_Maestros));
        jButton_Maestros.setPressedIcon(setIconoPresionado("/images/maestros.png", jButton_Maestros, 20, 20));

        jButton_IngresarPuntos.setIcon(setIcono("/images/anadir.png", jButton_IngresarPuntos));
        jButton_IngresarPuntos.setPressedIcon(setIconoPresionado("/images/anadir.png", jButton_IngresarPuntos, 20, 20));

        jButton_GenerarPdf.setIcon(setIcono("/images/pdf.png", jButton_GenerarPdf));
        jButton_GenerarPdf.setPressedIcon(setIconoPresionado("/images/pdf.png", jButton_GenerarPdf, 20, 20));

        jButton_LiquidarPuntos.setIcon(setIcono("/images/liquidar.png", jButton_LiquidarPuntos));
        jButton_LiquidarPuntos.setPressedIcon(setIconoPresionado("/images/liquidar.png", jButton_LiquidarPuntos, 20, 20));
    }

    @Override

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo_icon render.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Logo = new javax.swing.JLabel();
        jButton_Usuarios = new javax.swing.JButton();
        jButton_Maestros = new javax.swing.JButton();
        jButton_IngresarPuntos = new javax.swing.JButton();
        jButton_GenerarPdf = new javax.swing.JButton();
        jButton_LiquidarPuntos = new javax.swing.JButton();
        jButton_Pendiente = new javax.swing.JButton();
        jLabel_Usuarios = new javax.swing.JLabel();
        jLabel_Maestros = new javax.swing.JLabel();
        jLabel_Puntos = new javax.swing.JLabel();
        jLabel_Reportepdf = new javax.swing.JLabel();
        jLabel_LiquidarPuntos = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 350, 70));

        jButton_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 100));

        jButton_Maestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MaestrosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Maestros, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 100));

        jButton_IngresarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarPuntosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_IngresarPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 120, 100));

        jButton_GenerarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GenerarPdfActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_GenerarPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, 100));

        jButton_LiquidarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LiquidarPuntosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_LiquidarPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 120, 100));
        getContentPane().add(jButton_Pendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 120, 100));

        jLabel_Usuarios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Usuarios.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Usuarios.setText("Registrar usuarios");
        getContentPane().add(jLabel_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel_Maestros.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Maestros.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Maestros.setText("Registrar maestros");
        getContentPane().add(jLabel_Maestros, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel_Puntos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Puntos.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Puntos.setText("Ingresar puntos");
        getContentPane().add(jLabel_Puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jLabel_Reportepdf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Reportepdf.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Reportepdf.setText("Reporte pdf");
        getContentPane().add(jLabel_Reportepdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel_LiquidarPuntos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_LiquidarPuntos.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_LiquidarPuntos.setText("Liquidar puntos");
        getContentPane().add(jLabel_LiquidarPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_MaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MaestrosActionPerformed
        Terceros terceros = new Terceros();
        terceros.setVisible(true);
    }//GEN-LAST:event_jButton_MaestrosActionPerformed

    private void jButton_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UsuariosActionPerformed
        RegistrarUsuarios registrarUsuarios = new RegistrarUsuarios();
        registrarUsuarios.setVisible(true);
    }//GEN-LAST:event_jButton_UsuariosActionPerformed

    private void jButton_IngresarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarPuntosActionPerformed
        Ingresar_Puntos ingresarPuntos = new Ingresar_Puntos();
        ingresarPuntos.setVisible(true);
    }//GEN-LAST:event_jButton_IngresarPuntosActionPerformed

    private void jButton_GenerarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerarPdfActionPerformed
        LeerTxt conectar = new LeerTxt();
        Document documento = new Document();
        documento.setMargins(26, 26, 10, 20);

        try {
            String ruta_Pdf = System.getProperty("user.home");
            File rutaPdf = new File("rutaPdf.txt");
            String ruta = conectar.leerTexto(rutaPdf.toString());
            PdfWriter.getInstance(documento, new FileOutputStream(ruta_Pdf + ruta + "Reporte_terceros.pdf"));

            com.itextpdf.text.Image imagenPdf = com.itextpdf.text.Image.getInstance("src/images/logo.jpg");
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
    }//GEN-LAST:event_jButton_GenerarPdfActionPerformed

    private void jButton_LiquidarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LiquidarPuntosActionPerformed
        LiquidarPuntos ingresar = new LiquidarPuntos();
        ingresar.setVisible(true);
    }//GEN-LAST:event_jButton_LiquidarPuntosActionPerformed

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
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion().setVisible(true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GenerarPdf;
    private javax.swing.JButton jButton_IngresarPuntos;
    private javax.swing.JButton jButton_LiquidarPuntos;
    private javax.swing.JButton jButton_Maestros;
    private javax.swing.JButton jButton_Pendiente;
    private javax.swing.JButton jButton_Usuarios;
    private javax.swing.JLabel jLabel_LiquidarPuntos;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Maestros;
    private javax.swing.JLabel jLabel_Puntos;
    private javax.swing.JLabel jLabel_Reportepdf;
    private javax.swing.JLabel jLabel_Usuarios;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
