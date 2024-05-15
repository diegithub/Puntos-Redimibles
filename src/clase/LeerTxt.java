
package clase;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LeerTxt {
    public String leerTexto(String direccion){
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }
            texto = temp;
            
        } catch (IOException e) {
            System.err.println("No se encontro el archivo");
        }
        return texto;
    }
    
}
