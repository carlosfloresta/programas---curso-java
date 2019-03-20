package aplicação;

import entidade.Construtor_Produto;
import java.util.Scanner;

public class construtores {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
       String nome = sc.nextLine();
        System.out.print("Price: ");
       double preco = sc.nextDouble();
      
       Construtor_Produto produto = new Construtor_Produto(nome,preco);
       
       
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
