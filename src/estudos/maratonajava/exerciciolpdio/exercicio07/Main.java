package estudos.maratonajava.exerciciolpdio.exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean valor1, valor2;
        Scanner kbm = new Scanner(System.in);

        System.out.print("Digite o primeiro valor booleano: ");
        valor1 = kbm.nextBoolean();
        System.out.print("Digite o segundo valor booleano: ");
        valor2 = kbm.nextBoolean();

        if(valor1 == true && valor2 == true) {
            System.out.println("São VERDADEIROS");
        } else if(valor1 == false && valor2 == false) {
            System.out.println("São FALSOS");
        } else {
            System.out.println("São DIFERENTES");
        }
    }
}
