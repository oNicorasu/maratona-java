package estudos.maratonajava.exerciciolpdio.exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        num = kbm.nextInt();

        System.out.println("Número anterior: " + (num-1));
        System.out.println("Número sucessor: " + (num+1));

    }
}
