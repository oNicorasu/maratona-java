package estudos.maratonajava.exerciciolpdio.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        a = entrada.nextInt();
        System.out.print("Digite um valor inteiro: ");
        b = entrada.nextInt();
        if (a == b) {
            c = a + b;
            System.out.println("Soma de resultado: " + c);
        } else {
            c = a * b;
            System.out.println("Multiplicação de resultado: " + c);
        }
    }
}
