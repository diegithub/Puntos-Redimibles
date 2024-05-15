package ventanas;

import clase.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class listaMaestros extends javax.swing.JFrame {

    public static String maestro_Update = "";

    public listaMaestros() {
        initComponents();
        setTitle("Lista");
        setLocationRelativeTo(null);
        setSize(700, 350);
        setResizable(false);
        mostrarDatosMaestros();

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

    public void mostrarDatosMaestros() {
        DefaultTableModel tablaMaestros = new DefaultTableModel();
        tablaMaestros.addColumn("ID");
        tablaMaestros.addColumn("IDENTIFICACION");
        tablaMaestros.addColumn("NOMBRES");
        tablaMaestros.addColumn("APELLIDOS");
        tablaMaestros.addColumn("DIRECCION");
        tablaMaestros.addColumn("TELEFONOS");
        tabla_Maestros.setModel(tablaMaestros);

        String[] datos = new String[6];

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("select * from maestros");

            ResultSet resultado = orden.executeQuery();

            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                tablaMaestros.addRow(datos);
            }
            tabla_Maestros.setModel(tablaMaestros);

            tabla_Maestros.getColumnModel().getColumn(0).setPreferredWidth(15);
            tabla_Maestros.getColumnModel().getColumn(1).setPreferredWidth(60);
            tabla_Maestros.getColumnModel().getColumn(2).setPreferredWidth(75);
            tabla_Maestros.getColumnModel().getColumn(3).setPreferredWidth(75);
            tabla_Maestros.getColumnModel().getColumn(4).setPreferredWidth(80);
            tabla_Maestros.getColumnModel().getColumn(5).setPreferredWidth(60);

            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al llenar tabla." + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al mostrar informacion!!, contacte al administrador");
        }

        tabla_Maestros.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_Point = tabla_Maestros.rowAtPoint(e.getPoint());
                int columna_Point = 1;

                if (fila_Point > -1) {
                    maestro_Update = (String) tablaMaestros.getValueAt(fila_Point, columna_Point);
                    Terceros terceros = new Terceros();
                    terceros.setVisible(true);
                    cerrarVentana();
                }

            }

        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Maestros = new javax.swing.JTable();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_Maestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_Maestros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 670, 240));

        jLabel_Titulo.setBackground(new java.awt.Color(0, 51, 102));
        jLabel_Titulo.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Listado Maestros");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaMaestros().setVisible(true);
            }
        });
    }

    public void cerrarVentana() {
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_Maestros;
    // End of variables declaration//GEN-END:variables
}
