package estudos.maratonajava.exerciciolpdio.exercicio23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double horaAula, INSS;
        int qtdAulasMes;
        Scanner kbm = new Scanner(System.in);

        System.out.println("Quantidade de aulas: ");
        qtdAulasMes = kbm.nextInt();
        System.out.println("Valor hora/Aula: ");
        horaAula = kbm.nextDouble();
        System.out.println("Valor INSS em porcentagem (apenas números): ");
        INSS = kbm.nextDouble();

        System.out.println("Sálario Bruto: " + (horaAula * qtdAulasMes));
        System.out.println("Valor INSS: " + ((horaAula * qtdAulasMes) * (INSS / 100)));
        System.out.println("Sálario Líquido: " + ((horaAula * qtdAulasMes) * (1-(INSS / 100))));
    }
}
