package estudos.maratonajava.javacore.Npolimorfismo.domain;

public class Pc extends Produto {
    public static final double IMPOSTO_PORCENTAGEM = 0.21;
    public Pc(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaTaxa() {
        System.out.println("Calculando taxa do PC");
        return this.valor * IMPOSTO_PORCENTAGEM;
    }
}
