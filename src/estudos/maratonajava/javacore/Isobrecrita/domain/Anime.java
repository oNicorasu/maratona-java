package estudos.maratonajava.javacore.Isobrecrita.domain;

public class Anime {

    private String nome;

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}