package estudos.maratonajava.javacore.Bintroducaometodos.test;

import estudos.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Maria");
        p.setIdade(-1);
        System.out.println(p.getNome());
        System.out.println(p.getIdade());
    }
}
