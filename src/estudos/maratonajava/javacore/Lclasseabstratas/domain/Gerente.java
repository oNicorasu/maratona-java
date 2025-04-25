package estudos.maratonajava.javacore.Lclasseabstratas.domain;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
        calculaBonus();
        imprime();
    }

    @Override
    public void calculaBonus() {
        salario = salario + (salario * 0.2);
    }

    @Override
    protected void imprime() {
        System.out.println("Sou Gerente");
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
