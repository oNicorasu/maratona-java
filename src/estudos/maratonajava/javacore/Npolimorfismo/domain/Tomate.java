package estudos.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    public static final double IMPOSTO_PORCENTAGEM = 0.5;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaTaxa() {
        System.out.println("Calculando taxa do tomate...");
        return this.valor * IMPOSTO_PORCENTAGEM;
    }
}
