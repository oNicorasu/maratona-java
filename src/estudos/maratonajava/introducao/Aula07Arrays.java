package estudos.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {

        // Arrays
        int[] array1 = {3,2,1};
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array[1]);

        // Imprimi o array com for
        for (int i = 0; i < array.length; i++) {
            System.out.println("print do array na posição " + i + ", valor: " + array[i]);
        }

        // Imprimi o array usando o foreach
        for(int imprimir: array1) {
            System.out.println(imprimir);
        }
    }
}
