
package clase;


public class Puntos {
   
    
    public Double ingresarPuntos(double puntosIngresados,double valorFactura,double puntosFactura,  
             int valorPunto){
      valorFactura = 0;  
      valorPunto = 4;
      puntosFactura = valorFactura/1000;
     
      String valorFacturaS = String.valueOf(valorFactura);
      
      while(!valorFacturaS.equals("")){
          puntosIngresados = puntosFactura + puntosFactura;
          
      }
     return puntosIngresados;     
}
     public Double ingresarValorPuntos(double valorFactura,double puntosFactura, double valorPuntosFactura, 
             int valorPunto, double ValorTotalPF){
      valorFactura = 0;  
      valorPunto = 4;
      puntosFactura = valorFactura/1000;
      valorPuntosFactura = puntosFactura * valorPunto;
      String valorFacturaS = String.valueOf(valorFactura);
      
      while(!valorFacturaS.equals("")){
         
          ValorTotalPF = valorPuntosFactura + valorPuntosFactura;
      }
     return ValorTotalPF;     
}
    
}


