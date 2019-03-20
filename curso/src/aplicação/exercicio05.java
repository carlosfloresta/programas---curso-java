
package aplicação;

import entidade.Banco;
import java.util.Scanner;


public class exercicio05 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       Banco banco;
       
        System.out.println("Entre com o numero da sua conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Entre com o nome da sua conta: ");
        sc.nextLine();
        String nome = sc.nextLine();
        
        System.out.print("Irá fazer deposito incial?(y/n) ");
        char aux = sc.next().charAt(0);
        
        
        if(aux == 'y' || aux == 'Y'){
            
            System.out.print("Entre com o valor incial da conta: ");
          double  preco = sc.nextDouble();
            
            banco = new Banco(numeroConta,nome,preco);   
            
        } else {
            
            banco = new Banco(numeroConta,nome);   
          
        }
          
      System.out.println();
		System.out.println("Account data:");
		System.out.println(banco);
        
        
        System.out.println();
		System.out.print("Entre com o valor de desposito: ");
		double depositValue = sc.nextDouble();
		banco.addSaldo(depositValue);
		System.out.println("Dados atualizados da conta:");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("Entre com o valor de retirada: ");
		double withdrawValue = sc.nextDouble();
		banco.removeSaldo(withdrawValue);
		System.out.println("Dados atualizados da conta:");
		System.out.println(banco);
        
        sc.close();
        
    }
}
