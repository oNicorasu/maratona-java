package estudos.maratonajava.exerciciolpdio.exercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero, i = 0;
        Scanner kbm = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        numero = kbm.nextInt();

        while (i <= 10) {
            System.out.printf("%d x %d = %d \n", numero, i, i * numero);
            i++;
        }
    }
}
