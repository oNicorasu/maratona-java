package estudos.maratonajava.javacore.Npolimorfismo.servico;

import estudos.maratonajava.javacore.Npolimorfismo.domain.Pc;
import estudos.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class Calculadoraimposto {
    public static void calculaImpostoPC(Pc pc) {
        System.out.println("Relatório de imposto do PC");
        double imposto = pc.calculaTaxa();
        System.out.println("PC: " + pc.getNome());
        System.out.println("Valor: " + pc.getValor());
        System.out.println("Imposto: " + imposto);
    }

    public static void calculaImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do Tomate");
        double imposto = tomate.calculaTaxa();
        System.out.println("PC: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto: " + imposto);
    }
}
