package estudos.maratonajava.javacore.Hheranca.test;

import estudos.maratonajava.javacore.Hheranca.domain.Endereco;
import estudos.maratonajava.javacore.Hheranca.domain.Funcionario;
import estudos.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua do amigo");
        endereco.setCep("128361-123");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pessoa");
        pessoa.setCpf("123.456.789");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("|------------------------|");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Funcionario");
        funcionario.setCpf("123.456.789");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1500);
        funcionario.imprime();
        System.out.println(funcionario.getSalario());

    }
}
