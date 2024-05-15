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
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SumarPuntos extends javax.swing.JFrame {

    DecimalFormat formatoDouble = new DecimalFormat("$#,##0.00");
    String user = "", maestro_Update = "", maestro_Buscar = "";

    Metodos agregar = new Metodos();
//static String maestro = "";

    public SumarPuntos() {
        initComponents();
        user = Login.user;
        maestro_Update = Ingresar_Puntos.maestro_Update;
        maestro_Buscar = Ingresar_Puntos.maestro_Buscar;

        //maestro = maestro_Update;
        setTitle("Puntos");
        setSize(700, 550);
        setResizable(false);
        setLocationRelativeTo(null);

        ImageIcon wallpaper = new ImageIcon("src/images/fondo_wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(),
                jLabel_Wallpaper.getWidth()));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        jButton1_IngresarDatos.setIcon(setIcono("/images/anadir.png", jButton1_IngresarDatos));
        jButton1_IngresarDatos.setPressedIcon(setIconoPresionado("/images/anadir.png", jButton1_IngresarDatos, 20, 20));

        jButton1_ModificarPuntos.setIcon(setIcono("/images/editar.png", jButton1_ModificarPuntos));
        jButton1_ModificarPuntos.setPressedIcon(setIconoPresionado("/images/editar.png", jButton1_ModificarPuntos, 20, 20));

        jButton1_EliminarPuntos.setIcon(setIcono("/images/basura.png", jButton1_EliminarPuntos));
        jButton1_EliminarPuntos.setPressedIcon(setIconoPresionado("/images/basura.png", jButton1_EliminarPuntos, 20, 20));

        abrirDatosMaestros();

        DefaultTableModel modelo = agregar.llenarTablaPuntos(maestro_Update);
        tabla_Maestros.setModel(modelo);

        //Ancho de las columnas de la tabla
        anchoColumnasTabla();
        calcularPuntos();
        calcularValorPuntos();

        tabla_Maestros.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                JTable tabla = (JTable) e.getSource();
                Point point = e.getPoint();
                int row = tabla.rowAtPoint(point);
                if (e.getClickCount() == 1) {
                    jLabel_puntosID.setText(tabla_Maestros.getValueAt(tabla_Maestros.getSelectedRow(), 0).toString());
                    jTextField1_NumeroFactura.setText(tabla_Maestros.getValueAt(tabla_Maestros.getSelectedRow(), 3).toString());
                    jTextField1_ValorFactura.setText(tabla_Maestros.getValueAt(tabla_Maestros.getSelectedRow(), 4).toString().replace("$", ""));

                    jButton1_IngresarDatos.setEnabled(false);
                }
            }

        });
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
        jLabel_Nombres = new javax.swing.JLabel();
        jLabel_Apellidos = new javax.swing.JLabel();
        jLabel_Direccion = new javax.swing.JLabel();
        jLabel_Telefono = new javax.swing.JLabel();
        jLabel_IDrespuesta = new javax.swing.JLabel();
        jLabel_NombresRespuesta = new javax.swing.JLabel();
        jLabel_ApellidosRespuesta = new javax.swing.JLabel();
        jLabel_DireccionRespuesta = new javax.swing.JLabel();
        jLabel_TelefonoRespuesta = new javax.swing.JLabel();
        jButton1_IngresarDatos = new javax.swing.JButton();
        jButton1_ModificarPuntos = new javax.swing.JButton();
        jButton1_EliminarPuntos = new javax.swing.JButton();
        jLabel_AgregarPuntos = new javax.swing.JLabel();
        jLabel_ModificarPuntos = new javax.swing.JLabel();
        jLabel_EliminarPuntos = new javax.swing.JLabel();
        jButton_PDF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Maestros = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1_Documento = new javax.swing.JLabel();
        jTextField1_Documento = new javax.swing.JTextField();
        jLabel1_NumeroFactura = new javax.swing.JLabel();
        jTextField1_NumeroFactura = new javax.swing.JTextField();
        jTextField1_ValorFactura = new javax.swing.JTextField();
        jLabel1_ValorFactura = new javax.swing.JLabel();
        jLabel_TotalPuntos = new javax.swing.JLabel();
        jLabel_ValorTotalPuntos = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_TotalPuntosRespuesta = new javax.swing.JLabel();
        jLabel_ValorPuntosRespuesta = new javax.swing.JLabel();
        jLabel_puntosID = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_ID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_ID.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ID.setText("ID");
        getContentPane().add(jLabel_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel_Nombres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Nombres.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Nombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Nombres.setText("Nombres");
        getContentPane().add(jLabel_Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel_Apellidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Apellidos.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Apellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Apellidos.setText("Apellidos");
        getContentPane().add(jLabel_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel_Direccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Direccion.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Direccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Direccion.setText("Direccion");
        getContentPane().add(jLabel_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel_Telefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Telefono.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Telefono.setText("Telefono");
        getContentPane().add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel_IDrespuesta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_IDrespuesta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel_IDrespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, 60, 25));

        jLabel_NombresRespuesta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_NombresRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel_NombresRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, 150, 25));

        jLabel_ApellidosRespuesta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_ApellidosRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel_ApellidosRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 105, 160, 25));

        jLabel_DireccionRespuesta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_DireccionRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel_DireccionRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, 150, 25));

        jLabel_TelefonoRespuesta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_TelefonoRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel_TelefonoRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 155, 160, 25));

        jButton1_IngresarDatos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1_IngresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_IngresarDatosActionPerformed(evt);
            }
        });
        jButton1_IngresarDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1_IngresarDatosKeyPressed(evt);
            }
        });
        getContentPane().add(jButton1_IngresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 70, 50));

        jButton1_ModificarPuntos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1_ModificarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ModificarPuntosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_ModificarPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 70, 50));

        jButton1_EliminarPuntos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1_EliminarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_EliminarPuntosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_EliminarPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 70, 50));

        jLabel_AgregarPuntos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_AgregarPuntos.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_AgregarPuntos.setText("Agregar ");
        getContentPane().add(jLabel_AgregarPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jLabel_ModificarPuntos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_ModificarPuntos.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_ModificarPuntos.setText("Modificar");
        getContentPane().add(jLabel_ModificarPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jLabel_EliminarPuntos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_EliminarPuntos.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_EliminarPuntos.setText("Eliminar");
        getContentPane().add(jLabel_EliminarPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));

        jButton_PDF.setBackground(new java.awt.Color(0, 51, 102));
        jButton_PDF.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton_PDF.setForeground(new java.awt.Color(255, 255, 255));
        jButton_PDF.setText("Generar PDF");
        jButton_PDF.setBorder(null);
        jButton_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PDFActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_PDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, 35));

        tabla_Maestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_Maestros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 660, 180));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_Documento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1_Documento.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1_Documento.setText("Documento");
        jPanel1.add(jLabel1_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 122, 30));

        jTextField1_Documento.setBackground(new java.awt.Color(0, 51, 102));
        jTextField1_Documento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1_Documento.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_Documento.setEnabled(false);
        jPanel1.add(jTextField1_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 150, 30));

        jLabel1_NumeroFactura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1_NumeroFactura.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1_NumeroFactura.setText("Numero de Factura");
        jPanel1.add(jLabel1_NumeroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 122, 30));

        jTextField1_NumeroFactura.setBackground(new java.awt.Color(0, 51, 102));
        jTextField1_NumeroFactura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1_NumeroFactura.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_NumeroFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1_NumeroFacturaKeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1_NumeroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 68, 150, 30));

        jTextField1_ValorFactura.setBackground(new java.awt.Color(0, 51, 102));
        jTextField1_ValorFactura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1_ValorFactura.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_ValorFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1_ValorFacturaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1_ValorFacturaKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1_ValorFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 116, 150, 30));

        jLabel1_ValorFactura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1_ValorFactura.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1_ValorFactura.setText("Valor Factura");
        jPanel1.add(jLabel1_ValorFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 116, 122, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 310, 160));

        jLabel_TotalPuntos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_TotalPuntos.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_TotalPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TotalPuntos.setText("Total puntos");
        getContentPane().add(jLabel_TotalPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel_ValorTotalPuntos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_ValorTotalPuntos.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_ValorTotalPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ValorTotalPuntos.setText("Valor puntos");
        getContentPane().add(jLabel_ValorTotalPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel_Titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(0, 51, 102));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Registro de puntos");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel_TotalPuntosRespuesta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_TotalPuntosRespuesta.setForeground(new java.awt.Color(0, 102, 0));
        jLabel_TotalPuntosRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel_TotalPuntosRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 25));

        jLabel_ValorPuntosRespuesta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_ValorPuntosRespuesta.setForeground(new java.awt.Color(0, 102, 0));
        jLabel_ValorPuntosRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel_ValorPuntosRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 150, 25));
        getContentPane().add(jLabel_puntosID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 55, 40, 25));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PDFActionPerformed
        LeerTxt conectar = new LeerTxt();
        Document documento = new Document();
        documento.setMargins(20, 20, 2, 20);
        try {
            String ruta_Pdf = System.getProperty("user.home");
            File rutaPdf = new File("rutaPdf.txt");
            String ruta = conectar.leerTexto(rutaPdf.toString());
            PdfWriter.getInstance(documento, new FileOutputStream(ruta_Pdf + ruta + maestro_Update + ".pdf"));

            Image imagenPdf = Image.getInstance("src/images/logo.jpg");
            imagenPdf.scaleToFit(300, 1000);
            imagenPdf.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK));
            parrafo.add("Puntos " + jLabel_NombresRespuesta.getText().trim()
                    + " " + jLabel_ApellidosRespuesta.getText().trim() + "\n\n");

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
                PreparedStatement orden = cn.prepareStatement("select Documento,Nombre,Numero_Factura,Valor_Factura,Puntos,Valor_puntos from puntos where Documento = '" + maestro_Update + "'");

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

                Paragraph espacios = new Paragraph();
                espacios.add("\n\n\n");
                documento.add(espacios);

                float[] anchoColumnas2 = {3, 3};
                PdfPTable tabla2 = new PdfPTable(anchoColumnas2);
                tabla.setWidthPercentage(100);

                Paragraph puntosr = new Paragraph();
                puntosr.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
                puntosr.add("                        Total Puntos");
                PdfPCell puntosR = new PdfPCell(new Phrase(puntosr));

                Paragraph vrPuntos = new Paragraph();
                vrPuntos.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLUE));
                vrPuntos.add("                   Valor Total Puntos");
                PdfPCell valorPtos = new PdfPCell(new Phrase(vrPuntos));

                tabla2.addCell(puntosR);
                tabla2.addCell(valorPtos);
                tabla2.addCell(jLabel_TotalPuntosRespuesta.getText().trim());
                tabla2.addCell(jLabel_ValorPuntosRespuesta.getText().trim());

                documento.add(tabla2);

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
    }//GEN-LAST:event_jButton_PDFActionPerformed

    private void jButton1_IngresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_IngresarDatosActionPerformed

        String nombres, apellidos, nombreCompleto;
        float puntos, valorPuntosFactura;
        String vrFactura = jTextField1_ValorFactura.getText().trim().replace("$", "").replace(".", "").replace(",", "");
        //int valorPunto;
        nombres = jLabel_NombresRespuesta.getText().trim();
        apellidos = jLabel_ApellidosRespuesta.getText().trim();
        nombreCompleto = nombres + " " + apellidos;

        if (!jTextField1_Documento.getText().isEmpty() && !jTextField1_NumeroFactura.getText().isEmpty()
                && !vrFactura.isEmpty()) {

            try {

                if (Double.parseDouble(vrFactura) <= 0) {
                    JOptionPane.showMessageDialog(null, "El valor ingresado debe ser mayor a cero");
                    return;
                }
                // valorPunto = 4;
                // puntos = Float.parseFloat(jTextField1_ValorFactura.getText()) / 1000;
                //valorPuntosFactura = puntos * valorPunto;
                puntos = puntoss(Float.parseFloat(vrFactura));
                valorPuntosFactura = puntosValor(Float.parseFloat(vrFactura));

                Connection cn = Conexion.conectar();
                PreparedStatement orden = cn.prepareStatement("insert into puntos(Documento,Nombre,Numero_Factura,Valor_Factura,Puntos,Valor_puntos,ID_maestros) values(?,?,?,?,?,?,?) ");

                orden.setString(1, jTextField1_Documento.getText().trim());
                orden.setString(2, nombreCompleto);
                orden.setString(3, jTextField1_NumeroFactura.getText().trim());
                orden.setFloat(4, Float.parseFloat(vrFactura));
                orden.setFloat(5, puntos);
                orden.setFloat(6, valorPuntosFactura);
                orden.setInt(7, Integer.parseInt(jLabel_IDrespuesta.getText()));
                orden.executeUpdate();

                cn.close();

                Limpiar();

                JOptionPane.showMessageDialog(null, "Puntos ingresados con exito");

                DefaultTableModel modelo = agregar.llenarTablaPuntos(maestro_Update);
                tabla_Maestros.setModel(modelo);

                anchoColumnasTabla();

                calcularPuntos();
                calcularValorPuntos();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valores ingresados no son validos");
                System.err.println("Error al llenar tabla." + e);
            } catch (SQLException e) {
                System.err.print(e);
                JOptionPane.showMessageDialog(null, "Error al ingresar los datos, contacte al administrador");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos requeridos");
        }

    }//GEN-LAST:event_jButton1_IngresarDatosActionPerformed

    private void jButton1_ModificarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ModificarPuntosActionPerformed
        jButton1_IngresarDatos.setEnabled(true);
        // int valorPunto;
        float puntos;
        float valorPuntosFactura;
        String vrFactura = jTextField1_ValorFactura.getText().trim().replace("$", "").replace(".", "").replace(",", "");
        try {
            String IDpuntos = jLabel_puntosID.getText().trim();

            //valorPunto = 4;
            //  puntos = Float.parseFloat(jTextField1_ValorFactura.getText()) / 1000;
            // valorPuntosFactura = puntos * valorPunto;
            puntos = puntoss(Float.parseFloat(vrFactura));
            valorPuntosFactura = puntosValor(Float.parseFloat(vrFactura));

            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("update puntos set Numero_Factura = ?, Valor_Factura = ?, Puntos = ?, Valor_puntos = ? where ID = '" + IDpuntos + "'");

            orden.setString(1, jTextField1_NumeroFactura.getText().trim());
            orden.setFloat(2, Float.parseFloat(vrFactura));
            orden.setFloat(3, puntos);
            orden.setFloat(4, valorPuntosFactura);

            orden.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos modificados con exito");

            calcularPuntos();
            calcularValorPuntos();

            DefaultTableModel modelo = agregar.llenarTablaPuntos(maestro_Update);
            tabla_Maestros.setModel(modelo);

            anchoColumnasTabla();

            Limpiar();

            cn.close();
        } catch (HeadlessException | SQLException e) {
            System.err.println("Error al modificar datos." + e);
            JOptionPane.showMessageDialog(null, "Error al modificar datos, contacte al administrador");

        }
    }//GEN-LAST:event_jButton1_ModificarPuntosActionPerformed

    private void jButton1_EliminarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_EliminarPuntosActionPerformed

        int fila = tabla_Maestros.getSelectedRow();
        String valor = tabla_Maestros.getValueAt(fila, 0).toString();

        if (fila >= 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement orden = cn.prepareStatement("Delete from puntos where ID = '" + valor + "'");

                orden.executeUpdate();

                DefaultTableModel modelo = agregar.llenarTablaPuntos(maestro_Update);
                tabla_Maestros.setModel(modelo);

                anchoColumnasTabla();

                Limpiar();

                JOptionPane.showMessageDialog(null, "Datos eliminados con exito");

                cn.close();
            } catch (HeadlessException | SQLException e) {
                System.err.println("Error al Eliminar datos." + e);
                JOptionPane.showMessageDialog(null, "Error al Eliminar datos, contacte al administrador");
            }
        }

    }//GEN-LAST:event_jButton1_EliminarPuntosActionPerformed

    private void jTextField1_ValorFacturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_ValorFacturaKeyReleased

    }//GEN-LAST:event_jTextField1_ValorFacturaKeyReleased

    private void jTextField1_NumeroFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_NumeroFacturaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField1_ValorFactura.requestFocus();
        }
    }//GEN-LAST:event_jTextField1_NumeroFacturaKeyPressed

    private void jTextField1_ValorFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_ValorFacturaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1_IngresarDatos.requestFocus();
            jButton1_IngresarDatos.doClick();
        }/*else if(evt.getKeyCode()== KeyEvent.VK_TAB){
            jButton1_IngresarDatos.requestFocus();
            jButton1_IngresarDatos.doClick();
        }*/
    }//GEN-LAST:event_jTextField1_ValorFacturaKeyPressed

    private void jButton1_IngresarDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1_IngresarDatosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            jButton1_IngresarDatos.doClick();
        }
    }//GEN-LAST:event_jButton1_IngresarDatosKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SumarPuntos().setVisible(true);
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

    private void abrirDatosMaestros() {

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("select * from maestros where Documento = '" + maestro_Update + "' or Documento = '" + maestro_Buscar + "'");

            ResultSet resultado = orden.executeQuery();

            if (resultado.next()) {

                jLabel_IDrespuesta.setText(resultado.getString("ID"));
                jTextField1_Documento.setText(resultado.getString("Documento"));
                jLabel_NombresRespuesta.setText(resultado.getString("NOMBRES"));
                jLabel_ApellidosRespuesta.setText(resultado.getString("APELLIDOS"));
                jLabel_DireccionRespuesta.setText(resultado.getString("DIRECCION"));
                jLabel_TelefonoRespuesta.setText(resultado.getString("TELEFONO"));

            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al cargar tercero." + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al cargar informacion!!, contacte al administrador");
        }
    }

    private void calcularPuntos() {
        float suma = 0;

        for (int i = 0; i < tabla_Maestros.getRowCount(); i++) {

            float renglon;
            renglon = Float.parseFloat(tabla_Maestros.getValueAt(i, 5).toString());

            suma = suma + renglon;

        }
        jLabel_TotalPuntosRespuesta.setText(String.valueOf(suma));

    }

    private void calcularValorPuntos() {
        float suma = 0;

        for (int i = 0; i < tabla_Maestros.getRowCount(); i++) {
            String fila = tabla_Maestros.getValueAt(i, 6).toString();
            String filaFormat = fila.replace("$", "").replace(".", "").replace(",", "");
            float renglon;
            renglon = Float.parseFloat(filaFormat);

            suma = suma + renglon;

        }
        jLabel_ValorPuntosRespuesta.setText(formatoDouble.format(suma)/*String.valueOf(suma)*/);

    }

    public float puntoss(float valorFactura) {

        float puntos = valorFactura / 1000;
        return puntos;
    }

    public float puntosValor(float valorFactura) {
        float puntos, valorPuntosFactura;
        int valorPunto;

        valorPunto = 4;
        puntos = valorFactura / 1000;
        valorPuntosFactura = puntos * valorPunto;

        return valorPuntosFactura;
    }

    public void Limpiar() {
        jTextField1_NumeroFactura.setText("");
        jTextField1_ValorFactura.setText("");
    }

    private void anchoColumnasTabla() {
        tabla_Maestros.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabla_Maestros.getColumnModel().getColumn(1).setPreferredWidth(60);
        tabla_Maestros.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabla_Maestros.getColumnModel().getColumn(3).setPreferredWidth(30);
        tabla_Maestros.getColumnModel().getColumn(4).setPreferredWidth(60);
        tabla_Maestros.getColumnModel().getColumn(5).setPreferredWidth(40);
        tabla_Maestros.getColumnModel().getColumn(6).setPreferredWidth(60);
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        jTextField1_NumeroFactura.requestFocus();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_EliminarPuntos;
    private javax.swing.JButton jButton1_IngresarDatos;
    private javax.swing.JButton jButton1_ModificarPuntos;
    private javax.swing.JButton jButton_PDF;
    private javax.swing.JLabel jLabel1_Documento;
    private javax.swing.JLabel jLabel1_NumeroFactura;
    private javax.swing.JLabel jLabel1_ValorFactura;
    private javax.swing.JLabel jLabel_AgregarPuntos;
    private javax.swing.JLabel jLabel_Apellidos;
    private javax.swing.JLabel jLabel_ApellidosRespuesta;
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_DireccionRespuesta;
    private javax.swing.JLabel jLabel_EliminarPuntos;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_IDrespuesta;
    private javax.swing.JLabel jLabel_ModificarPuntos;
    private javax.swing.JLabel jLabel_Nombres;
    private javax.swing.JLabel jLabel_NombresRespuesta;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_TelefonoRespuesta;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_TotalPuntos;
    public javax.swing.JLabel jLabel_TotalPuntosRespuesta;
    public javax.swing.JLabel jLabel_ValorPuntosRespuesta;
    private javax.swing.JLabel jLabel_ValorTotalPuntos;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_puntosID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1_Documento;
    private javax.swing.JTextField jTextField1_NumeroFactura;
    private javax.swing.JTextField jTextField1_ValorFactura;
    private javax.swing.JTable tabla_Maestros;
    // End of variables declaration//GEN-END:variables
}
