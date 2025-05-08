package estudos.maratonajava.exerciciolpdio.exercicio24;

// Uno Mille Economy 1.0 2012

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {

        int caso;
        double kmPorLitroGasolinaRodovia = 14.5;
        double kmPorLitroAlcoolRodovia = 10;
        double kmPorLitroGasolinaUrbano = 12.5;
        double kmPorLitroAlcoolUrbano = 9;
        double distancia, tempo, velocicadeMedia;
        Scanner kbm = new Scanner(System.in);

        System.out.println("Uno Mille 1.0 2012");
        System.out.println("----------------------------------------");
        System.out.println("1 - Trajeto Gasolina Rodovia");
        System.out.println("2 - Trajeto Alcool Rodovia");
        System.out.println("3 - Trajeto Gasolina Urbano");
        System.out.println("4 - Trajeto Alcool Urbano");
        System.out.println("----------------------------------------");
        System.out.print("Digite o numero do modo de trajeto: ");

        caso = kbm.nextInt();

        System.out.print("Digite a distancia percorrida em km: ");
        distancia = kbm.nextDouble();
        System.out.print("Digite o tempo em minutos: ");
        tempo = kbm.nextDouble();

        velocicadeMedia = distancia / (tempo / 60);
        System.out.println("----------------------------------------");
        System.out.printf("Tempo: %.0f horas e %.0f minutos.\n", (tempo / 60), tempo % 60);
        System.out.printf("Velocidade: %.1f km/h.\n", velocicadeMedia);
        System.out.printf("Distância: %.1f km.\n", distancia);

        switch (caso) {
            case 1:
                System.out.printf("Litros gastos: %.1f L.\n", distancia / kmPorLitroGasolinaRodovia);
                System.out.printf("Gasto da Viagem na gasolina: R$ %.2f.\n", (distancia / kmPorLitroGasolinaRodovia) * 6);
                break;
            case 2:
                System.out.printf("Litros gastos: %.1f\n", distancia / kmPorLitroAlcoolRodovia);
                System.out.printf("Gasto da Viagem no alcool: %.2f\n", (distancia / kmPorLitroAlcoolRodovia) * 4.5);
                break;
            case 3:
                System.out.printf("Litros gastos: %.1f\n", distancia / kmPorLitroGasolinaUrbano);
                System.out.printf("Gasto da Viagem na gasolina: %.2f\n", (distancia / kmPorLitroGasolinaUrbano) * 6);
                break;
            case 4:
                System.out.printf("Litros gastos: %.1f\n", distancia / kmPorLitroAlcoolUrbano);
                System.out.printf("Gasto da Viagem no alcool: %.2f\n", (distancia / kmPorLitroAlcoolUrbano) * 4.5);
                break;
        }
        System.out.println("----------------------------------------");
    }
}
