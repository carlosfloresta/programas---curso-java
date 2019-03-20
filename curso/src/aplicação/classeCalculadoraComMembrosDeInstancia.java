
package aplicação;

import java.util.Scanner;
import util.Calculadora;

//Versao 2: classe calculadora com membros de instancia.
public class classeCalculadoraComMembrosDeInstancia {
    
    
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         Calculadora calc = new Calculadora();
         
         System.out.println("entre com o raio:");
         double raio = sc.nextDouble();
         
         double c = calc.circunferencia(raio);
         
         double v = calc.volume(raio);
         
         System.out.printf("Circunferencia: %.2f%n", c);
          System.out.printf("Volume: %.2f%n", v);
         
           System.out.printf("Valor PI: %.2f%n", calc.PI);
         
     }
}
