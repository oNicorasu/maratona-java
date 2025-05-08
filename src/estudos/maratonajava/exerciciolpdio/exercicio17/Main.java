package estudos.maratonajava.exerciciolpdio.exercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fahrenheit, celsius;
        Scanner kbm = new Scanner(System.in);

        System.out.print("Digite um valor em fahrenheit: ");
        fahrenheit = kbm.nextDouble();

        celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.printf("Temperatura em fahrenheit: %.2f°F\n",fahrenheit);
        System.out.printf("Temperatura em celsius: %.2f°C\n",celsius);
    }
}
