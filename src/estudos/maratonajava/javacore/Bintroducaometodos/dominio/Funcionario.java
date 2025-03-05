package estudos.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String name;
    public int age;
    public double[] salary;

    public void imprimeDados() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        if (salary != null) {
            for (int i = 0; i <salary.length; i++) {
                System.out.println(i+1 + "° Salario: " + salary[i]);
            }
        }
    }

    public void mediaSalario() {
        int soma =0;
        if (salary != null) {
            for (int i = 0; i <salary.length; i++) {
                soma += salary[i];
            }
            System.out.println("Média dos salários: " + soma/salary.length);
        }
    }
}
