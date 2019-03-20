
package aplicação;

import entidade.Estudante;
import java.util.Scanner;

/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres 
do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
Ao final, mostrar qual a nota final do aluno no ano. 
Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, 
quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). 
Você deve criar uma classe Studentpara resolver este problema.*/ 

public class exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        estudante.nome = sc.nextLine();
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();
        System.out.printf("Grade Final: %.2f%n", estudante.gradeFinal());
        if (estudante.gradeFinal() < 60.0) {
            System.out.println("Reporvado");
            System.out.printf("Falta %.2f Pontos%n", estudante.pontosParaPassar());
        } else {
            System.out.println("Passou");
        }

    }

}
