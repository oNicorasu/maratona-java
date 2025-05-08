package estudos.maratonajava.exerciciolpdio.exercicio13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        int idade;
        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = kbm.nextLine();
        System.out.print("Digite a sua idade: ");
        idade = kbm.nextInt();

        if (idade >= 18) {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Já pode ser preso FDP!");
        } else {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("BEBEL ainda!");
        }
    }
}
