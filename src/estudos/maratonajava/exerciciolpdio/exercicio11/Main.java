package estudos.maratonajava.exerciciolpdio.exercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        double nota1, nota2, nota3, nota4, media;
        Scanner kbm = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = kbm.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = kbm.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = kbm.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = kbm.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = kbm.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.printf(nome + " foi aprovado com sucesso!\n");
            System.out.println("Sua média é de " + media);
        } else {
            System.out.printf(nome + " foi reprovou Otário, parabéns\n");
            System.out.println("Sua média é de " + media);
        }

        System.out.println(30/60);
    }
}
