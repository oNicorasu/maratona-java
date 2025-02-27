package estudos.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        // if
        int age = 21;
        if(age > 18){
            System.out.println("Pode comprar bebidas alcoólicas");
        }


        // else
        age = 15;
        if(age > 18){
            System.out.println("Pode comprar bebidas alcoólicas");
        } else{
            System.out.println("Não pode comprar bebidas alcoólicas");
        }


        // else-if
        if(age >= 18){
            System.out.println("AdultoNey");
        } else if(age >= 13){
            System.out.println("MeninoNey");
        } else {
            System.out.println("CriançaNey");
        }


        // Operador Ternário: (condição) ? verdadeiro : falso
        System.out.println(age > 13 ? "adolescente" : "criança");


        // Ternário no caso de else-if
        System.out.println(age >= 18 ? "AdultoNey" : age >= 13 ? "MeninoNey" : "CriançaNey");


        // Switch
        // Imprimir o dia da semana, considerando 1 como Domingo
        byte dia = 7;
        switch(dia){
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
