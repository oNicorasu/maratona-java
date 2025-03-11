package estudos.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDeDadosConsoleTest {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("\nDigite a sua idade: ");
        int idade = entrada.nextInt();
        System.out.print("\nDigite o seu sexo: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("|---------------------------------|");
        System.out.println("|Nome: " + nome);
        System.out.println("|Idade: " + idade);
        System.out.println("|Sexo: " + sexo);
    }
}
