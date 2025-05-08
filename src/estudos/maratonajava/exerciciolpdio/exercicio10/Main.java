package estudos.maratonajava.exerciciolpdio.exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota1, nota2, nota3, media;

        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        nota1 = kbm.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = kbm.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = kbm.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média é de " + media);

    }
}
