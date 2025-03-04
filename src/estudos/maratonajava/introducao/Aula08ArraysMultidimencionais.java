package estudos.maratonajava.introducao;

public class Aula08ArraysMultidimencionais {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // Imprimindo uma matriz com for
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // Imprimindo uma matriz com foreach
        for (int[] matriz1:matriz) {
            for (int matriz2:matriz1) {
                System.out.print(matriz2 + " ");
            }
            System.out.print("\n");
        }
    }
}
