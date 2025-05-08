package estudos.maratonajava.exerciciolpdio.exercicio09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double peso, altura, IMC;
        Scanner kbm = new Scanner(System.in);
        System.out.print("Digite o peso em kg: ");
        peso = kbm.nextDouble();
        System.out.print("Digite o altura em metros: ");
        altura = kbm.nextDouble();

        IMC = peso / (altura * altura);

        if (IMC <= 18.5) {
            System.out.printf("Seu IMC é de %.2f\n", IMC);
            System.out.println("Tá raquítico pae! Tome bomba URGENTE!!!");
        }else if (IMC > 18.5 && IMC < 25) {
            System.out.printf("Seu IMC é de %.2f\n", IMC);
            System.out.println("Tá goat pae! Parabéns fez o mínimo, seu arrombado!");
        }else if (IMC > 25 && IMC < 30) {
            System.out.printf("Seu IMC é de %.2f\n", IMC);
            System.out.println("Tá no bulking pae, cuidado pode piorar kkkkkk!");
        }else if (IMC > 30 && IMC < 35) {
            System.out.printf("Seu IMC é de %.2f\n", IMC);
            System.out.println("Que isso pae ta roliço! Melhore!!!");
        }else if (IMC > 35 && IMC < 40) {
            System.out.printf("Seu IMC é de %.2f\n", IMC);
            System.out.println("Obesidade grau 2 NÃO é legal OH VIADO!!!");
        }else if (IMC > 40) {
            System.out.printf("Seu IMC é de %.2f\n", IMC);
            System.out.println("MAIS PESADO QUE TAÍS CARLA DPS DO RODÍZIO, FDP TU VAI MORRER!!!");
        }
    }
}
