
package clase;


import java.sql.*;



public class Conexion {
   
    public static Connection conectar(){
               
        try { 
            String url = "jdbc:mysql://localhost/puntos_maestros";
            String usuario = "root";
            String pass = "";
            Connection cn = DriverManager.getConnection(url, usuario, pass);
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en conexion local" + e);
        }
        return(null);
    }
    
}
