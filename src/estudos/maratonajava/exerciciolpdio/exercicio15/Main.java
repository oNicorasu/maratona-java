package estudos.maratonajava.exerciciolpdio.exercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dia, mes, ano, dias = 0, meses = 0, anos = 0;
        Scanner kbm = new Scanner(System.in);

        System.out.println("Digite sua data de aniversário");
        System.out.print("Dia: ");
        dia = kbm.nextInt();
        System.out.println("\n");
        System.out.print("Mes: ");
        mes = kbm.nextInt();
        System.out.println("\n");
        System.out.print("Ano: ");
        ano = kbm.nextInt();
        System.out.println("\n");

        anos = 2025 - ano;
        if (5 - mes < 0) {
            meses = 12 + (5 - mes);
        } else {
            meses = 5 - mes;
        }
        if (7 - dia < 0) {
            dias = 30 + (7 - dia);
        } else {
            dias = 7 - dia;
        }

        System.out.printf("Você tem %d anos, %d meses e %d dias.", anos, meses, dias);

    }
}
