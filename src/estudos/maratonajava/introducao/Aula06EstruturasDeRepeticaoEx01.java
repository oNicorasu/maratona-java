package estudos.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoEx01 {
    public static void main(String[] args) {

        // Imprima todos os números pares de 0 até 1000000

        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("Pares: " + i);
            }
        }


        // Dado um valor de um carro, descubra as opções de parcelamento possíveis
        // Sendo que valorParcela >= 1000;
        double carro = 30000;
        double valorParcela = 0;
        for (int i = 1; i < carro; i++) {
            valorParcela = carro / i;
            if (valorParcela >= 1000) {
                System.out.println("Parcelamento em  " + i + " valor R$ " + valorParcela);
            } else {
                break;
            }
        }

        for (int valor = (int) carro; valor >= 1; valor--) {
            valorParcela = carro / valor;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcelamento em  " + valor + " valor R$ " + valorParcela);
        }


    }
}
