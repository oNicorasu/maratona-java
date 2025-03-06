package estudos.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida!");
            return;
        } else {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void comparaIdade(int idade) {
        if (this.idade == idade) {
            System.out.println("Idades iguais!");
        }
    }
}
