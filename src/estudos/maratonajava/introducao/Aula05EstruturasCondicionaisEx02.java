package estudos.maratonajava.introducao;

public class Aula05EstruturasCondicionaisEx02 {
    public static void main(String[] args) {

        // Imprimir se um dia é util, considerando de 1 a 7 e que 1 seja domingo usando switch

        byte dia = 6;
        switch (dia) {
            case 1:
                System.out.println("Dom");
                System.out.println("Não é dia utíl");
                break;
            case 2:
                System.out.println("Seg");
                System.out.println("É dia útil");
                break;
            case 3:
                System.out.println("Ter");
                System.out.println("É dia útil");
                break;
            case 4:
                System.out.println("Qua");
                System.out.println("É dia útil");
                break;
            case 5:
                System.out.println("Qui");
                System.out.println("É dia útil");
                break;
            case 6:
                System.out.println("Sex");
                System.out.println("É dia útil");
                break;
            case 7:
                System.out.println("Sab");
                System.out.println("Não é dia útil");
                break;
            default:
                System.out.println("Opção Inválida");

        }
    }
}
