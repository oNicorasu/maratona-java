package estudos.maratonajava.exerciciolpdio.exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double preco,inflacao;

        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite o preço: ");
        preco = kbm.nextDouble();
        inflacao = preco * 0.05;

        System.out.printf("Preço inflacionado R$ %.2f\n", preco+inflacao);

    }
}
