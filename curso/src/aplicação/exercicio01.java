
package aplicação;

import entidade.Retangulo;
import java.util.Scanner;

/*Fazer um programa para ler os valores da largura e altura de um retângulo. 
Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
Usar uma classe como mostrado no projeto ao lado.*/


public class exercicio01 {
    
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);    
    Retangulo retangulo = new Retangulo();
    
    System.out.println("Entre com a largura e a altura:");
   
    retangulo.largura = sc.nextDouble();
    retangulo.altura = sc.nextDouble();
    
    System.out.println(retangulo);

        
    }
    
}
