
package aplicação;

import entidade.Empregado;
import java.util.Scanner;

/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
Em seguida, mostrar os dados do funcionário (nome e salário líquido). 
Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada 
(somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. 
Use a classe projetada abaixo.*/


public class exercicio02 {
    
     public static void main(String[] args){
         double porcentagem;
         
         
        Scanner sc = new Scanner(System.in);
        Empregado empregado = new Empregado();
        
        System.out.println("Nome: ");
        empregado.nome = sc.nextLine();
        
         System.out.println("Sálario Bruto: ");
        empregado.salarioBruto = sc.nextDouble();
        
         System.out.println("Imposto: ");
        empregado.imposto = sc.nextDouble();
        
        System.out.println("Empregado: " + empregado);
        
        
        System.out.println("Porcentagem para incrementar ao salario: ");
        porcentagem = sc.nextDouble();
        empregado.aumentarSalario(porcentagem);
        
        System.out.println("Valor Atualizado: " + empregado);
       
        
        
        
        
         
     }
    
}
