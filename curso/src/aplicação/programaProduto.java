
package aplicação;

import entidade.Produto;
import java.util.Locale;
import java.util.Scanner;


public class programaProduto {
    public static void main(String[] args){
        
       Locale.setDefault(Locale.US);
       
       Scanner sc = new Scanner(System.in);
       
       Produto produto = new Produto();
       System.out.println("Entre os dados do produto:");
       System.out.printf("Nome: ");
       produto.name = sc.nextLine();
       System.out.printf("Preço: ");
       produto.preco = sc.nextDouble();
       System.out.printf("Quantidade: ");
       produto.quantidade = sc.nextInt();
       
      System.out.println();
      System.out.println("Dados do Produto: " + produto);
      
      System.out.println();
       System.out.print("Entre com o numero de produtos para serem adicionados no estoque: ");
       int quantidade = sc.nextInt();
       produto.addProdutos(quantidade);
       
         System.out.println();
      System.out.println("Dados atualizados: " + produto);
       
      System.out.println();
       System.out.print("Entre com o numero de produtos para serem removidos no estoque: ");
       quantidade = sc.nextInt();
       produto.removeProdutos(quantidade);
       
       
        System.out.println();
      System.out.println("Dados atualizados: " + produto);
           
     
       
        
        
    }
}
