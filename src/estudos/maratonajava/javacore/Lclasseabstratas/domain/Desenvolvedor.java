package estudos.maratonajava.javacore.Lclasseabstratas.domain;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
        calculaBonus();
        imprime();
    }

    @Override
    public void calculaBonus() {
        salario += salario * 0.3;
    }

    @Override
    protected void imprime() {
        System.out.println("Sou Dev");
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
