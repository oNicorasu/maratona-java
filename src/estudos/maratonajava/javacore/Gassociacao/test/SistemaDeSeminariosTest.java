package estudos.maratonajava.javacore.Gassociacao.test;

import estudos.maratonajava.javacore.Gassociacao.domain.Aluno;
import estudos.maratonajava.javacore.Gassociacao.domain.Local;
import estudos.maratonajava.javacore.Gassociacao.domain.Professor;
import estudos.maratonajava.javacore.Gassociacao.domain.Seminario;

public class SistemaDeSeminariosTest {
    public static void main(String[] args) {

        Local local = new Local("Rua do local");
        Local local2 = new Local("Rua do local 2");
        Local local3 = new Local("Rua do local 3");
        Local local4 = new Local("Rua do local 4");

        Aluno aluno = new Aluno("Luffy",18);
        Aluno aluno2 = new Aluno("Zoro",21);
        Aluno aluno3 = new Aluno("Nami",19);
        Aluno aluno4 = new Aluno("Usopp",16);

        Aluno[] alunos = {aluno, aluno2};
        Aluno[] alunos2 = {aluno3, aluno4};

        Seminario seminario = new Seminario("Hacking Ético",alunos);
        Seminario seminario2 = new Seminario("CELPIP",alunos2);
        Seminario seminario3 = new Seminario("TOFEL");
        Seminario seminario4 = new Seminario("Redes");

        Seminario[] seminarios = {seminario, seminario3};
        Seminario[] seminarios2 = {seminario2, seminario4};

        Professor professor = new Professor("Luis Paulo","Françês",seminarios);
        Professor professor2 = new Professor("Raylaeght","Haki",seminarios2);

        seminario.setLocal(local);
        seminario2.setLocal(local2);
        seminario3.setLocal(local3);
        seminario4.setLocal(local4);

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        aluno3.setSeminario(seminario2);
        aluno4.setSeminario(seminario2);


        professor.imprimir();
        professor2.imprimir();

        //seminario.imprimir();
        //seminario2.imprimir();
    }
}
