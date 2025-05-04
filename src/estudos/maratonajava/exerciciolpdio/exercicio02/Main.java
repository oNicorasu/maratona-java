package estudos.maratonajava.exerciciolpdio.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero qualquer: ");
        numero = entrada.nextDouble();

        if (numero % 2 == 0){
            System.out.println("Número digitado é par");
        }else {
            System.out.println("Número digitado é ímpar");
        }

        if (numero >= 0){
            System.out.println("Número digitado é positivo");
        }else{
            System.out.println("Número digitado é negativo");
        }

    }
}
