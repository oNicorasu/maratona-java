package estudos.maratonajava.exerciciolpdio.exercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pg;
        double preco;
        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        preco = kbm.nextDouble();

        System.out.println("Método de Pagamento");
        System.out.println("----------------------------------------");
        System.out.println("1 - À vista (Dinheiro ou PIQXIS)");
        System.out.println("2 - À vista (Cartão de Crédito)");
        System.out.println("3 - Parcelado 2x sem juros");
        System.out.println("4 - Parcelado 3x ou mais + 10% juros");
        System.out.println("----------------------------------------");
        System.out.print("Digite o numero do modo de pagamento: ");

        pg = kbm.nextInt();

        switch (pg) {
            case 1:
                System.out.println("Valor total a ser pago: R$ " + preco * 0.85);
                break;
            case 2:
                System.out.println("Valor total a ser pago: R$ " + preco * 0.90);
                break;
            case 3:
                System.out.println("Valor total a ser pago: R$ " + preco);
                break;
            case 4:
                System.out.println("Valor total a ser pago: R$ " + preco * 1.1);
                break;
        }
    }
}
