package estudos.maratonajava.exerciciolpdio.exercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c;
        Scanner kbm = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        a = kbm.nextDouble();
        System.out.println("Digite um segundo valor: ");
        b = kbm.nextDouble();
        System.out.println("Digite um terceiro valor: ");
        c = kbm.nextDouble();

        if (a == b && a == c) {
            System.out.println("Triângulo Equilátero");
        } else if (a == b && a != c || a == c && a != b) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }
    }
}
