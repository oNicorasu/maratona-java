package estudos.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {

        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        count = 0;
        do {
            System.out.println("do-while: " + count);
            count++;
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("for: " + i);
        }


        // Break and Continue
        // Imprima os primeiros 25 números de um valor dado. ex: 50
        int maxValue = 50;
        for (int i = 0; i < maxValue; i++) {
            if (i > 25) {
                break;
            }
            System.out.println("25 primeiros núm: " + i);
        }
    }
}
