package ventanas;

import java.sql.*;
import clase.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.event.KeyEvent;

public class Ingresar_Puntos extends javax.swing.JFrame {

    String user;
    public static String maestro_Update = "", maestro_Buscar = "";

    public Ingresar_Puntos() {
        initComponents();
        mostrarDatosMaestros();
        user = Login.user;

        setSize(630, 330);
        setResizable(false);
        setTitle("Listado de maestros - Sesion de " + user);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/fondo_wallpaper.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(),
                jLabel_Wallpaper.getWidth()));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

    }

    private void mostrarDatosMaestros() {
        DefaultTableModel tablaMaestros = new DefaultTableModel();
        tablaMaestros.addColumn("ID");
        tablaMaestros.addColumn("IDENTIFICACION");
        tablaMaestros.addColumn("NOMBRES");
        tablaMaestros.addColumn("APELLIDOS");
        tablaMaestros.addColumn("DIRECCION");
        tablaMaestros.addColumn("TELEFONOS");
        jTable_Maestros.setModel(tablaMaestros);

        String datos[] = new String[6];

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

            jTable_Maestros.setModel(tablaMaestros);
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error al llenar tabla." + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al mostrar informacion!!, contacte al administrador");
        }

        jTable_Maestros.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_Point = jTable_Maestros.rowAtPoint(e.getPoint());
                int columna_Point = 1;

                if (fila_Point > -1) {
                    maestro_Update = (String) tablaMaestros.getValueAt(fila_Point, columna_Point);
                    SumarPuntos sumarPuntos = new SumarPuntos();
                    sumarPuntos.setVisible(true);
                    cerrarVentana();
                }
            }

        });
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo_icon render.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Maestros = new javax.swing.JTable();
        jTextField1_Buscar = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Maestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Maestros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 600, 180));

        jTextField1_Buscar.setBackground(new java.awt.Color(0, 51, 102));
        jTextField1_Buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_Buscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1_Buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1_BuscarKeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 210, 25));

        jButton_Buscar.setBackground(new java.awt.Color(0, 51, 102));
        jButton_Buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 100, 40));

        jLabel_Wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_BuscarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton_Buscar.requestFocus();
            jButton_Buscar.doClick();
        }

    }//GEN-LAST:event_jTextField1_BuscarKeyReleased

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        maestro_Buscar = jTextField1_Buscar.getText().trim();
        maestro_Update = maestro_Buscar;
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement orden = cn.prepareStatement("select * from maestros where Documento = ?");
            orden.setString(1, maestro_Update);

            ResultSet resultado = orden.executeQuery();

            if (resultado.next()) {
                SumarPuntos sumarPuntos = new SumarPuntos();
                sumarPuntos.setVisible(true);
                //this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
            }
        } catch (SQLException e) {
            System.err.println("Error buscar datos." + e);
            JOptionPane.showMessageDialog(null, "Error al buscar datos, contacte al administrador");
        }
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Puntos().setVisible(true);
            }
        });
    }

    private void cerrarVentana() {
        this.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Maestros;
    private javax.swing.JTextField jTextField1_Buscar;
    // End of variables declaration//GEN-END:variables
}
