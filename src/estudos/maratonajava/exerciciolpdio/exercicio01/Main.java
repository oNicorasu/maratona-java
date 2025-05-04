package estudos.maratonajava.exerciciolpdio.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, aux;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        a = entrada.nextInt();
        System.out.print("Digite um valor: ");
        b = entrada.nextInt();
        System.out.print("Digite um valor: ");
        c = entrada.nextInt();

        aux = a + b;
        System.out.println("A soma dos valores A e B é: " + aux);

        if (aux < c){
            System.out.println("C é maior que a soma de A e B");
        }

    }
}
