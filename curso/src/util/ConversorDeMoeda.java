
package util;


public class ConversorDeMoeda {
    
    public static double IOF = 0.06;
    
    public static double dolar(double montante, double precoDolar){
        
        double resultado;
        
      resultado = montante*precoDolar*(1.0* IOF);
      return resultado+=montante*precoDolar;
    }
}
