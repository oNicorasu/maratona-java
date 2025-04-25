package estudos.maratonajava.javacore.Npolimorfismo.test;

import estudos.maratonajava.javacore.Npolimorfismo.domain.Pc;
import estudos.maratonajava.javacore.Npolimorfismo.domain.Produto;
import estudos.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import estudos.maratonajava.javacore.Npolimorfismo.servico.Calculadoraimposto;

public class ProdutoTest {
    public static void main(String[] args) {

        Pc pc = new Pc("Asus",3000);
        Tomate tomate = new Tomate("Tomate",30);

        Calculadoraimposto.calculaImpostoPC(pc);
        System.out.println("------------------------------");
        Calculadoraimposto.calculaImpostoTomate(tomate);
    }
}
