
package aplicação;

import java.util.Scanner;
import util.ConversorDeMoeda;


/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado 
por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando 
ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. 
Criar uma classe CurrencyConverter para ser responsável pelos cálculos.

 */
public class exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Qual o preço do dolar: ");
         double precoDolar = sc.nextDouble();
         
        System.out.println("Quantos dolares deseja converter? ");
         double montante = sc.nextDouble();
         
         double resultado = ConversorDeMoeda.dolar(montante,precoDolar);
         
        System.out.printf("Valor que devera pagar: %.2f%n", resultado); 
         
    }
    
}
