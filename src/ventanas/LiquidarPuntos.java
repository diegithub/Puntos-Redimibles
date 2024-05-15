package ventanas;

import clase.Conexion;
import clase.LeerTxt;
import clase.Metodos;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class LiquidarPuntos extends javax.swing.JFrame {

    DecimalFormat formatoDouble = new DecimalFormat("$#,##0.00");
    String user = "", maestro_Update = "", maestro_Buscar = "";
    String nombreMaestro = "", documentoMaestro = "";
    SumarPuntos conectar = new SumarPuntos();
    Metodos agregar = new Metodos();

    public LiquidarPuntos() {
        initComponents();
        maestro_Update = Ingresar_Puntos.maestro_Update;
        maestro_Buscar = Ingresar_Puntos.maestro_Buscar;

        setTitle("Puntos");
        setSize(400, 500);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/fondo_wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(),
                jLabel_Wallpaper.getWidth()));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        jButton1_Consultar.setIcon(setIcono("/images/buscar_1.png", jButton1_Consultar));
        jButton1_Consultar.setPressedIcon(setIconoPresionado("/images/buscar_1.png", jButton1_Consultar, 20, 20));

        jButton1_LiquidarPuntos.setIcon(setIcono("/images/metodo-de-pago.png", jButton1_LiquidarPuntos));
        jButton1_LiquidarPuntos.setPressedIcon(setIconoPresionado("/images/metodo-de-pago.png", jButton1_LiquidarPuntos, 20, 20));
    }

    @Override
    public java.awt.Image getIconImage() {
        java.awt.Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo_icon render.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Documento = new javax.swing.JLabel();
        jTextField_Documento = new javax.swing.JTextField();
        jLabel_PuntosRedimir = new javax.swing.JLabel();
        jTextField_PuntosRedimir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1_Consultar = new javax.swing.JButton();
        jButton1_LiquidarPuntos = new javax.swing.JButton();
        jLabel_Agregar = new javax.swing.JLabel();
        jLabel_Agregar1 = new javax.swing.JLabel();
        jLabel_PuntosAcumulados = new javax.swing.JLabel();
        jLabel_Valor1 = new javax.swing.JLabel();
        jLabel_PuntosLiquidados = new javax.swing.JLabel();
        jLabel_Valor2 = new javax.swing.JLabel();
        jLabel_PuntosSaldo = new javax.swing.JLabel();
        jLabel_Valor3 = new javax.swing.JLabel();
        jLabel_PAcumuladosRespuesta = new javax.swing.JLabel();
        jLabel_PLiquidadosRespuesta = new javax.swing.JLabel();
        jLabel_PSaldoRespuesta = new javax.swing.JLabel();
        jLabel_Valor1Respuesta = new javax.swing.JLabel();
        jLabel_Valor2Respuesta = new javax.swing.JLabel();
        jLabel_Valor3Respuesta = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Documento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Documento.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Documento.setText("Documento: ");
        getContentPane().add(jLabel_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 25));

        jTextField_Documento.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_Documento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_Documento.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 210, 25));

        jLabel_PuntosRedimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_PuntosRedimir.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_PuntosRedimir.setText("Puntos a redimir:");
        getContentPane().add(jLabel_PuntosRedimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 25));

        jTextField_PuntosRedimir.setBackground(new java.awt.Color(0, 51, 102));
        jTextField_PuntosRedimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_PuntosRedimir.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField_PuntosRedimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 210, 25));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Liquidar puntos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jButton1_Consultar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ConsultarActionPerformed(evt);
            }
        });
        jButton1_Consultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1_ConsultarKeyPressed(evt);
            }
        });
        getContentPane().add(jButton1_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 80, 60));

        jButton1_LiquidarPuntos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1_LiquidarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_LiquidarPuntosActionPerformed(evt);
            }
        });
        jButton1_LiquidarPuntos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1_LiquidarPuntosKeyPressed(evt);
            }
        });
        getContentPane().add(jButton1_LiquidarPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 80, 60));

        jLabel_Agregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Agregar.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Agregar.setText("Consultar");
        getContentPane().add(jLabel_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jLabel_Agregar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Agregar1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Agregar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Agregar1.setText("Liquidar puntos");
        getContentPane().add(jLabel_Agregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        jLabel_PuntosAcumulados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_PuntosAcumulados.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_PuntosAcumulados.setText("Puntos acumulados");
        getContentPane().add(jLabel_PuntosAcumulados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel_Valor1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Valor1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_Valor1.setText("Valor");
        getContentPane().add(jLabel_Valor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jLabel_PuntosLiquidados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_PuntosLiquidados.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_PuntosLiquidados.setText("Puntos liquidados");
        getContentPane().add(jLabel_PuntosLiquidados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel_Valor2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Valor2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_Valor2.setText("Valor");
        getContentPane().add(jLabel_Valor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel_PuntosSaldo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_PuntosSaldo.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_PuntosSaldo.setText("Saldo puntos");
        getContentPane().add(jLabel_PuntosSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel_Valor3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Valor3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_Valor3.setText("Valor");
        getContentPane().add(jLabel_Valor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        jLabel_PAcumuladosRespuesta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_PAcumuladosRespuesta.setForeground(new java.awt.Color(0, 153, 51));
        getContentPane().add(jLabel_PAcumuladosRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 90, 30));

        jLabel_PLiquidadosRespuesta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_PLiquidadosRespuesta.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jLabel_PLiquidadosRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 90, 30));

        jLabel_PSaldoRespuesta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_PSaldoRespuesta.setForeground(new java.awt.Color(0, 153, 51));
        getContentPane().add(jLabel_PSaldoRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 90, 30));

        jLabel_Valor1Respuesta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Valor1Respuesta.setForeground(new java.awt.Color(0, 153, 51));
        getContentPane().add(jLabel_Valor1Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 210, 100, 30));

        jLabel_Valor2Respuesta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Valor2Respuesta.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jLabel_Valor2Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 270, 100, 30));

        jLabel_Valor3Respuesta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Valor3Respuesta.setForeground(new java.awt.Color(0, 153, 51));
        getContentPane().add(jLabel_Valor3Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 330, 100, 30));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ConsultarActionPerformed
        ConsultarPuntos();
    }//GEN-LAST:event_jButton1_ConsultarActionPerformed

    private void jButton1_ConsultarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1_ConsultarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            jButton1_LiquidarPuntos.doClick();
        }
    }//GEN-LAST:event_jButton1_ConsultarKeyPressed

    private void jButton1_LiquidarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_LiquidarPuntosActionPerformed
        ConsultarPuntos();

        String documento = jTextField_Documento.getText().trim();
        float puntosRedimir = -Float.parseFloat(jTextField_PuntosRedimir.getText().trim());
        float valorPuntos = puntosRedimir * 4;

        if (Float.parseFloat(jTextField_PuntosRedimir.getText().trim()) > Float.parseFloat(jLabel_PAcumuladosRespuesta.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Puntos ingresados no deben superar puntos acumulados");
        } else {
            try {
                try (Connection cn = Conexion.conectar()) {
                    PreparedStatement orden = cn.prepareStatement("insert into puntos(Documento,Nombre,Numero_Factura,Valor_Factura,Puntos,Valor_puntos,ID_maestros) values(?,?,?,?,?,?,?)");

                    orden.setString(1, documento);
                    orden.setString(2, "Liquidacion de puntos");
                    orden.setString(3, "");
                    orden.setString(4, "0");
                    orden.setFloat(5, puntosRedimir);
                    orden.setFloat(6, valorPuntos);
                    orden.setInt(7, 1);
                    orden.executeUpdate();

                    jLabel_PLiquidadosRespuesta.setText(Float.toString(puntosRedimir));
                    jLabel_Valor2Respuesta.setText(formatoDouble.format(valorPuntos));
                }

                try {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement orden2 = cn2.prepareStatement(" select sum(Puntos), sum(Valor_puntos) from puntos where Documento = '" + documento + "'");

                    ResultSet resultado = orden2.executeQuery();

                    if (resultado.next()) {
                        jLabel_PSaldoRespuesta.setText(resultado.getString("sum(Puntos)"));
                        jLabel_Valor3Respuesta.setText(formatoDouble.format(Float.parseFloat(resultado.getString("sum(Valor_puntos)"))));
                    }
                    cn2.close();
                    pdfLiquidarPuntos();

                } catch (NumberFormatException | SQLException e) {
                }

            } catch (SQLException e) {
                System.err.println("Error al modificar datos." + e);
            }
        }


    }//GEN-LAST:event_jButton1_LiquidarPuntosActionPerformed

    private void jButton1_LiquidarPuntosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1_LiquidarPuntosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_LiquidarPuntosKeyPressed

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
            java.util.logging.Logger.getLogger(LiquidarPuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LiquidarPuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LiquidarPuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LiquidarPuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LiquidarPuntos().setVisible(true);
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

    public void pdfLiquidarPuntos() {
        LeerTxt conectar = new LeerTxt();
        String documentoI = jTextField_Documento.getText().trim();
        Document documento = new Document();
        documento.setMargins(20, 20, 2, 20);
        try {
            String ruta_Pdf = System.getProperty("user.home");
            File rutaPdf = new File("rutaPdf.txt");
            String ruta = conectar.leerTexto(rutaPdf.toString());
            PdfWriter.getInstance(documento, new FileOutputStream(ruta_Pdf + ruta + documentoI + ".pdf"));

            Image imagenPdf = Image.getInstance("src/images/logo.jpg");
            imagenPdf.scaleToFit(300, 1000);
            imagenPdf.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK));
            parrafo.add("Puntos de " + nombreMaestro + "\n\n");

            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Fecha: " + new SimpleDateFormat("dd/MM/yyyy").format(date));

            documento.open();
            documento.add(fecha);
            documento.add(imagenPdf);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(6);
            float[] anchoColumnas = new float[]{2, 3, 2, 2, 2, 2};
            tabla.setWidths(anchoColumnas);
            tabla.setWidthPercentage(100);
            tabla.setHorizontalAlignment(Element.ALIGN_CENTER);

            Paragraph Docu = new Paragraph();
            Docu.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
            Docu.add("Documento");
            PdfPCell docu = new PdfPCell(new Phrase(Docu));

            Paragraph nombre = new Paragraph();
            nombre.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
            nombre.add("Nombre");
            PdfPCell nombrec = new PdfPCell(new Phrase(nombre));

            Paragraph numFac = new Paragraph();
            numFac.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
            numFac.add("#_Fact");
            PdfPCell N_fac = new PdfPCell(new Phrase(numFac));

            Paragraph Vfac = new Paragraph();
            Vfac.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
            Vfac.add("Valor_Factura");
            PdfPCell Vr_fac = new PdfPCell(new Phrase(Vfac));

            Paragraph punto = new Paragraph();
            punto.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
            punto.add("Puntos");
            PdfPCell Puntos = new PdfPCell(new Phrase(punto));

            Paragraph vPuntos = new Paragraph();
            vPuntos.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
            vPuntos.add("Valor_Puntos");
            PdfPCell vr_Puntos = new PdfPCell(new Phrase(vPuntos));

            tabla.addCell(docu);
            tabla.addCell(nombrec);
            tabla.addCell(N_fac);
            tabla.addCell(Vr_fac);
            tabla.addCell(Puntos);
            tabla.addCell(vr_Puntos);

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement orden = cn.prepareStatement("select Documento,Nombre,Numero_Factura,Valor_Factura,Puntos,Valor_puntos from puntos where Documento = '" + documentoI + "'");

                ResultSet resultado = orden.executeQuery();

                if (resultado.next()) {
                    do {

                        double valorFac = Double.parseDouble(resultado.getString("Valor_Factura"));
                        String vrFactura = agregar.separarEnMiles(valorFac);

                        double valorPuntos = Double.parseDouble(resultado.getString("Valor_puntos"));
                        String vrPuntos = agregar.separarEnMiles(valorPuntos);

                        tabla.addCell(resultado.getString(1));
                        tabla.addCell(resultado.getString(2));
                        tabla.addCell(resultado.getString(3));
                        tabla.addCell(vrFactura);
                        tabla.addCell(resultado.getString(5));
                        tabla.addCell(vrPuntos);

                    } while (resultado.next());
                    documento.add(tabla);
                }

                Paragraph espacios1 = new Paragraph();
                espacios1.add("\n");
                documento.add(espacios1);

                Paragraph comunicado = new Paragraph();
                comunicado.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
                comunicado.add("Teniendo en cuanta que " + nombreMaestro + " identificado con cedula de ciudadanía N° " + documentoMaestro + "\n"
                        + "ha sido un cliente frecuente de Comercializadora granitos perlita S.A.S, la empresa le hace un \n"
                        + "reconocimiento en dinero o el equivalente en mercancía por el valor de " + jLabel_Valor2Respuesta.getText().trim().replace("-", "") + " el cual\n"
                        + "corresponde a  liquidación de puntos  relacionados a continuación:");
                documento.add(comunicado);

                Paragraph espacios2 = new Paragraph();
                espacios2.add("\n");
                documento.add(espacios2);

                PdfPTable tabla2 = new PdfPTable(6);
                float[] anchoColumnas2 = new float[]{2, 2, 2, 2, 2, 2};
                tabla2.setWidths(anchoColumnas2);
                tabla2.setWidthPercentage(100);
                tabla2.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);

                Paragraph puntosr = new Paragraph();
                puntosr.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
                puntosr.add("Puntos acumulados");
                PdfPCell puntosR = new PdfPCell(new Phrase(puntosr));

                Paragraph vrPuntos = new Paragraph();
                vrPuntos.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
                vrPuntos.add("Valor");
                PdfPCell valorPtos = new PdfPCell(new Phrase(vrPuntos));

                Paragraph puntosL = new Paragraph();
                puntosL.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.RED));
                puntosL.add("Puntos Liquidados");
                PdfPCell puntosLiq = new PdfPCell(new Phrase(puntosL));

                Paragraph vrPuntosL = new Paragraph();
                vrPuntosL.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.RED));
                vrPuntosL.add("Valor");
                PdfPCell valorPtosL = new PdfPCell(new Phrase(vrPuntosL));

                Paragraph SaldoPuntos = new Paragraph();
                SaldoPuntos.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
                SaldoPuntos.add("Saldo Puntos");
                PdfPCell puntosSaldo = new PdfPCell(new Phrase(SaldoPuntos));

                Paragraph vrPuntosSaldo = new Paragraph();
                vrPuntosSaldo.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
                vrPuntosSaldo.add("Valor");
                PdfPCell valorPtosSaldo = new PdfPCell(new Phrase(vrPuntosSaldo));

                tabla2.addCell(puntosR);
                tabla2.addCell(valorPtos);
                tabla2.addCell(puntosLiq);
                tabla2.addCell(valorPtosL);
                tabla2.addCell(puntosSaldo);
                tabla2.addCell(valorPtosSaldo);
                tabla2.addCell(jLabel_PAcumuladosRespuesta.getText().trim());
                tabla2.addCell(jLabel_Valor1Respuesta.getText().trim());
                tabla2.addCell(jLabel_PLiquidadosRespuesta.getText().trim());
                tabla2.addCell(jLabel_Valor2Respuesta.getText().trim());
                tabla2.addCell(jLabel_PSaldoRespuesta.getText().trim());
                tabla2.addCell(jLabel_Valor3Respuesta.getText().trim());

                documento.add(tabla2);

                Paragraph espacios3 = new Paragraph();
                espacios3.add("\n");
                documento.add(espacios3);

                Paragraph firma = new Paragraph();
                firma.add("Recibi: \n\n\n"
                        + "_______________________________\n"
                        + nombreMaestro + "\n"
                        + documentoMaestro);
                documento.add(firma);

            } catch (DocumentException | SQLException e) {

            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Liquidacion generada con exito");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            System.err.println("Error al generar documento." + e);
            JOptionPane.showMessageDialog(null, "Error al generar documento, contacte al administrador");
        } catch (IOException e) {
            System.err.println("Error al generar documento." + e);
        }
    }

    public void ConsultarPuntos() {
        String documento = jTextField_Documento.getText().trim();
        if (jTextField_Documento.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero de documento para consulta");
        } else {

            try {

                try (Connection cn = Conexion.conectar()) {
                    PreparedStatement orden = cn.prepareStatement("select Documento, Nombre, sum(Puntos), sum(Valor_puntos) from puntos where Documento = '" + documento + "'");

                    ResultSet resultado = orden.executeQuery();

                    if (resultado.next()) {
                        documentoMaestro = resultado.getString("Documento");
                        nombreMaestro = resultado.getString("Nombre");
                        jLabel_PAcumuladosRespuesta.setText(resultado.getString("sum(Puntos)"));
                        jLabel_Valor1Respuesta.setText(formatoDouble.format(Float.parseFloat(resultado.getString("sum(Valor_puntos)"))));
                    } else {
                        JOptionPane.showMessageDialog(null, "Documento no encontrado");
                    }
                }

            } catch (SQLException e) {
                System.err.println("Error en consulta." + e);
                JOptionPane.showMessageDialog(null, "Error al hacer la consulta");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Consultar;
    private javax.swing.JButton jButton1_LiquidarPuntos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Agregar;
    private javax.swing.JLabel jLabel_Agregar1;
    private javax.swing.JLabel jLabel_Documento;
    private javax.swing.JLabel jLabel_PAcumuladosRespuesta;
    private javax.swing.JLabel jLabel_PLiquidadosRespuesta;
    private javax.swing.JLabel jLabel_PSaldoRespuesta;
    private javax.swing.JLabel jLabel_PuntosAcumulados;
    private javax.swing.JLabel jLabel_PuntosLiquidados;
    private javax.swing.JLabel jLabel_PuntosRedimir;
    private javax.swing.JLabel jLabel_PuntosSaldo;
    private javax.swing.JLabel jLabel_Valor1;
    private javax.swing.JLabel jLabel_Valor1Respuesta;
    private javax.swing.JLabel jLabel_Valor2;
    private javax.swing.JLabel jLabel_Valor2Respuesta;
    private javax.swing.JLabel jLabel_Valor3;
    private javax.swing.JLabel jLabel_Valor3Respuesta;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField jTextField_Documento;
    private javax.swing.JTextField jTextField_PuntosRedimir;
    // End of variables declaration//GEN-END:variables
}
