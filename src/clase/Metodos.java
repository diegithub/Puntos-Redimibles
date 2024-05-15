
package clase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Metodos {
   
    public DefaultTableModel buscarMaestros(String buscar){
        
        
        String [] nombreColumnas = { "ID", "DOCUMENTO", "NOMBRES", "APELLIDOS", "DIRECCION", "TELEFONO"};
        String [] registros = new String [6];
        
        DefaultTableModel modelo = new DefaultTableModel (null, nombreColumnas);
        
        String sql = "select * from maestros where  Documento like '%"+buscar+"%' or NOMBRES like '%"+buscar+"%'"
                    + "or APELLIDOS like '%"+buscar+"%'";
         Connection cn = null;
         PreparedStatement orden = null;
         ResultSet resultado = null;
        
        try {
            cn = Conexion.conectar();
            orden = cn.prepareStatement(sql);
            
            resultado = orden.executeQuery();
             
             while(resultado.next()){
                 
                registros[0]= resultado.getString(1);
                registros[1]= resultado.getString(2);
                registros[2]= resultado.getString(3);
                registros[3]= resultado.getString(4);
                registros[4]= resultado.getString(5);
                registros[5]= resultado.getString(6);
                modelo.addRow(registros);
            }
            
                
        } catch (SQLException e) {
           System.err.println("Error en busqueda." + e);
            JOptionPane.showMessageDialog(null, "Error al buscar información, contacte al administrador"); 
        }
        finally{
            try {
                if(resultado != null) resultado.close();
                if(orden != null) orden.close();
                if(cn != null) cn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return modelo;
    }
    
    public DefaultTableModel llenarTablaMaestros(String maestro){
        
        
        String [] nombreColumnas = {"ID", "DOCUMENTO", "NOMBRES", "APELLIDOS", "DIRECCION", "TELEFONO"};
        String [] registros = new String [6];
        
        DefaultTableModel modelo = new DefaultTableModel (null, nombreColumnas);
        
        String sql = "select * from maestros where Documento = '" + maestro + "'";
         Connection cn = null;
         PreparedStatement orden = null;
         ResultSet resultado = null;
        
        try {
            cn = Conexion.conectar();
            orden = cn.prepareStatement(sql);
            
            resultado = orden.executeQuery();
             
             while(resultado.next()){
                registros[0]= resultado.getString(1);
                registros[1]= resultado.getString(2);
                registros[2]= resultado.getString(3);
                registros[3]= resultado.getString(4);
                registros[4]= resultado.getString(5);
                registros[5]= resultado.getString(6);
                modelo.addRow(registros);
            }
            
                
        } catch (SQLException e) {
           System.err.println("Error en busqueda." + e);
            JOptionPane.showMessageDialog(null, "Error al buscar información, contacte al administrador"); 
        }
        finally{
            try {
                if(resultado != null) resultado.close();
                if(orden != null) orden.close();
                if(cn != null) cn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return modelo;
    }
    public DefaultTableModel llenarTablaPuntos(String maestro){
        
        
        String [] nombreColumnas = {"ID","DOCUMENTO", "NOMBRE", "#_FACT", "VR_FACT","PUNTOS","VR_PUNTOS"};
        String [] registros = new String [7];
        
        DefaultTableModel modelo = new DefaultTableModel (null, nombreColumnas);
        
        String sql = "select ID,Documento,Nombre,Numero_Factura,Valor_Factura,Puntos,Valor_puntos from puntos where Documento = '" + maestro + "'";
         Connection cn = null;
         PreparedStatement orden = null;
         ResultSet resultado = null;
        
        try {
            cn = Conexion.conectar();
            orden = cn.prepareStatement(sql);
            
            resultado = orden.executeQuery();
             
             while(resultado.next()){
                 double valorFac = Double.parseDouble(resultado.getString("Valor_Factura"));
                 String vrFactura = separarEnMiles(valorFac);
                 
                 double valorPuntos = Double.parseDouble(resultado.getString("Valor_puntos"));
                 String vrPuntos = separarEnMiles(valorPuntos);
                 
                 
                registros[0]= resultado.getString("ID");
                registros[1]= resultado.getString("Documento");
                registros[2]= resultado.getString("Nombre");
                registros[3]= resultado.getString("Numero_Factura");
                registros[4]= vrFactura;
                registros[5]= resultado.getString("Puntos");
                registros[6]= vrPuntos;
                modelo.addRow(registros);
            }
            
                
        } catch (SQLException e) {
           System.err.println("Error en busqueda." + e);
            JOptionPane.showMessageDialog(null, "Error al buscar información, contacte al administrador"); 
        }
        finally{
            try {
                if(resultado != null) resultado.close();
                if(orden != null) orden.close();
                if(cn != null) cn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        return modelo;
    }
    
    public String separarEnMiles(Double numero){
        DecimalFormat formatea = new DecimalFormat("$###,###.##");
        return formatea.format(numero);
    }
    public String separarEnMilesconDecimal(float numero){
        DecimalFormat formatea = new DecimalFormat("###,###.##");
        return formatea.format(numero);
    }
    public String quitarSeparadorDeMiles(String numero){
        String formatoNuevo = numero.replace(".", "");
        return formatoNuevo;
    }
}
