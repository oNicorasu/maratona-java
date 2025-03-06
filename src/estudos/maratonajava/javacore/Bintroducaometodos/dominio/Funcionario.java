package estudos.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salary;
    private double mediaSalary;

    public double getMediaSalary() {
        return mediaSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public void mediaSalario() {
        if (salary != null) {
            for (int i = 0; i < salary.length; i++) {
                mediaSalary += salary[i];
            }
            System.out.println("Média dos salários: " + mediaSalary / salary.length);
        }
    }

    public void imprimeDados() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        if (salary != null) {
            for (int i = 0; i < salary.length; i++) {
                System.out.println(i + 1 + "° Salario: " + salary[i]);
            }
        }
        mediaSalario();
    }
}
