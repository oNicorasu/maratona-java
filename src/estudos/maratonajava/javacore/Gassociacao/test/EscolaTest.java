package estudos.maratonajava.javacore.Gassociacao.test;

import estudos.maratonajava.javacore.Gassociacao.domain.Escola;
import estudos.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Luis Paulo"," ");
        Professor professor1 = new Professor("Marcelo"," ");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Cp2", professores);

        escola.imprime();
    }
}
