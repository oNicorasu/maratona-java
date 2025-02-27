package estudos.maratonajava.introducao;

/**
 * Operadores básicos: soma = +, subtração = -, divisão = /, multiplicação = * e resto = % ;
 * relacionais: menor = <, menor ou igual = <=, maior = >, maior ou igual = >=, igual = ==, diferente = != ;
 * lógicos: AND = &&, OR = || e NOT = ! ;
 * atribuição: = += -= *= /= %=
 * operadores unários: ++ --
 */

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 + n2);
        System.out.println(n1 * n2);
        System.out.println(n2 / n1);
        System.out.println(n2 - n1);


        // %
        System.out.println(n1 % n2);


        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte " + isDezDiferenteQueVinte);


        // && || !
        int age = 35;
        int haveCollege = 1; // 1 tem College e 0 não tem
        boolean isPodeReceberSalario = age >= 30 && haveCollege == 1;
        boolean notPodeReceberSalario = age <= 30 && haveCollege == 1;
        System.out.println("notPodeReceberSalario " + notPodeReceberSalario);
        System.out.println("isPodeReceberSalario " + isPodeReceberSalario);

        float valorRTX5090 = 23000F;
        float banco = 20000F;
        float emprestimo = 15000F;
        boolean isRTXCompravel = banco >= valorRTX5090 || banco + emprestimo >= valorRTX5090;
        System.out.println("isRTXCompravel " + isRTXCompravel);

        boolean isNotVelho = !(age <= 30);
        System.out.println("isNotVelho " + isNotVelho);


        // = += -= *= /= %=
        float tax = 1500F;
        tax *= 2;
        tax += 50;
        tax -= 100;
        tax /= 2;
        tax %= 5;
        System.out.println("tax " + tax);

        // ++ --
        int contador = 0;
        contador++;
        System.out.println(contador); // contador = 1;
        System.out.println(contador++); // contador = 1; A variável foi usada antes de incrementar.
        System.out.println(contador); // contador = 2;
        System.out.println(++contador); // contador = 3; Foi incrementado antes de usar a variável.
    }
}
