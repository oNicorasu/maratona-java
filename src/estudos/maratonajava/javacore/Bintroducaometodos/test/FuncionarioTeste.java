package estudos.maratonajava.javacore.Bintroducaometodos.test;

import estudos.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Iruma");
        funcionario.setAge(16);
        funcionario.setSalary(new double[]{2500,5000,10000});

        funcionario.imprimeDados();
    }
}
