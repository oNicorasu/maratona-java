package estudos.maratonajava.javacore.Aintroducaoclasses.test;

import estudos.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.name = "Luffy";
        estudante.age = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sexo);
    }
}
