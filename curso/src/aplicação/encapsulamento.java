
package aplicação;

import entidade.Encapisulamento_Produto;
import java.util.Scanner;


public class encapsulamento {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
       String nome = sc.nextLine();
        System.out.print("Price: ");
       double preco = sc.nextDouble();
      
       Encapisulamento_Produto produto = new Encapisulamento_Produto(nome,preco);
       
       produto.setNome("computador");
       System.out.println("nome atualizado: " + produto.getName());
       produto.setPreco(1200);
       System.out.println("Preco atualizado: " + produto.getPreco());
       
        System.out.println();
        System.out.println("Product data: " + produto);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
       int quantidade = sc.nextInt();
        produto.addProducts(quantidade);
        System.out.println();
        System.out.println("Updated data: " + produto);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantidade = sc.nextInt();
        produto.removeProducts(quantidade);
        System.out.println();
        System.out.println("Updated data: " + produto);
        sc.close();
    }
    
}
