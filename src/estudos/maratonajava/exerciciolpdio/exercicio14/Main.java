package estudos.maratonajava.exerciciolpdio.exercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double A, B, aux;
        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite o valor do A: ");
        A = kbm.nextDouble();
        System.out.print("Digite o valor do B: ");
        B = kbm.nextDouble();

        aux = B;
        B = A;
        A = aux;

        System.out.println("O valor do A: " + A + " e do B: " + B);


    }
}
