package estudos.maratonajava.exerciciolpdio.exercicio18;

public class Main {
    public static void main(String[] args) {

        double francisco = 1.50;
        double sara = 1.10;
        int i = 0;

        while (sara < francisco) {
            sara += 0.03;
            francisco += 0.02;
            i++;
        }

        System.out.printf("Para que Sara seja maior que Francisco deve se passar %d anos.\n", i);
        System.out.printf("Sara: %.2f metros \n", sara);
        System.out.printf("Francisco: %.2f metros \n", francisco);
    }
}
