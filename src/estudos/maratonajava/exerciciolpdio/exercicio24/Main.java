package estudos.maratonajava.exerciciolpdio.exercicio24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kmPorLitro = 12;
        double distancia, tempo, velocicadeMedia;
        Scanner kbm = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida em km: ");
        distancia = kbm.nextDouble();
        System.out.println("Digite o tempo em minutos: ");
        tempo = kbm.nextDouble();

        velocicadeMedia = distancia / (tempo / 60);

        System.out.println("Tempo em minutos: " + tempo);
        System.out.printf("Velocidade: %.2f\n", velocicadeMedia);
        System.out.println("Distância: " + distancia);
        System.out.printf("Litros gastos: %.2f\n", distancia / kmPorLitro);

    }
}
