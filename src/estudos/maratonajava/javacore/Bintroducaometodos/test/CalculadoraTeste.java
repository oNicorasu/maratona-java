package estudos.maratonajava.javacore.Bintroducaometodos.test;

import estudos.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(10,2);
    }
}
