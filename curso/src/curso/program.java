
package curso;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        
        char gender = 'F';
        int age = 32;
        double balance = 10.35784;
        String name = "Maria";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ola mundo");
        System.out.println("Ola mundo");
        System.out.println("--------------------------");
        System.out.printf("%.2f%n", balance);
        System.out.printf("%.4f%n", balance);
        Locale.setDefault(Locale.US);
         System.out.printf("%.4f%n", balance);
          System.out.printf("%s tem %d anos%n ", name,age);
          
         
        sc.close();
        

    }
    
}
