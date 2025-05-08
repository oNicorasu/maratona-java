package estudos.maratonajava.exerciciolpdio.exercicio22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner kbm = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        a = kbm.nextInt();
        System.out.println("Digite um numero inteiro: ");
        b = kbm.nextInt();

        System.out.println("Quociente: "+ (a/b) );
        System.out.println("Resto: "+ (a%b) );
    }
}
