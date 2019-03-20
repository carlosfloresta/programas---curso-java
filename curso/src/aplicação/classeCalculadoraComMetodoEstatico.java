
package aplicação;

//Versao 3: classe calculadora com metodo estatico.

import java.util.Scanner;
import util.CalculadoraVersao3;

public class classeCalculadoraComMetodoEstatico {
    
    public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         
         System.out.println("entre com o raio:");
         double raio = sc.nextDouble();
         
         double c = CalculadoraVersao3.circunferencia(raio);
         
         double v = CalculadoraVersao3.volume(raio);
         
         System.out.printf("Circunferencia: %.2f%n", c);
          System.out.printf("Volume: %.2f%n", v);
         
           System.out.printf("Valor PI: %.2f%n", CalculadoraVersao3.PI);
         
     }
    
}
