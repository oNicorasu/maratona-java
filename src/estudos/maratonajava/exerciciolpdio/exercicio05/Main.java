package estudos.maratonajava.exerciciolpdio.exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double salario = 1293.20;
        double pg, resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu salário: ");
        pg = entrada.nextDouble();

        resultado = pg/salario;

        System.out.printf("Você recebe %.2f salários mínimos.", resultado);

    }
}
