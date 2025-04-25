package estudos.maratonajava.javacore.Lclasseabstratas.test;

import estudos.maratonajava.javacore.Lclasseabstratas.domain.Desenvolvedor;
import estudos.maratonajava.javacore.Lclasseabstratas.domain.Funcionario;
import estudos.maratonajava.javacore.Lclasseabstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nicolas",15000);
        System.out.println(gerente);

        Desenvolvedor dev = new Desenvolvedor("Victoria",15000);
        System.out.println(dev);

    }
}
