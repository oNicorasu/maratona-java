package estudos.maratonajava.exerciciolpdio.exercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero1, numero2, numero3, maior = 0, medio = 0, menor = 0;
        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        numero1 = kbm.nextInt();
        System.out.print("Digite um numero inteiro: ");
        numero2 = kbm.nextInt();
        System.out.print("Digite um numero inteiro: ");
        numero3 = kbm.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
            if (numero2 < numero3) {
                medio = numero2;
                maior = numero3;
            } else {
                medio = numero3;
                maior = numero2;
            }
        } else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;
            if (numero1 < numero3) {
                medio = numero1;
                maior = numero3;
            } else {
                medio = numero3;
                maior = numero1;
            }
        } else if (numero3 < numero1 && numero3 < numero2) {
            menor = numero3;
            if (numero2 < numero3) {
                medio = numero2;
                maior = numero3;
            } else {
                medio = numero3;
                maior = numero2;
            }
        }

        System.out.print("Ordem decrescente: " + maior + ", " + medio + ", " + menor);
    }
}
