package estudos.maratonajava.javacore.Gassociacao.domain;

public class Jogador {
    private String nome;
    private Time time;

    public void imprimir() {
        System.out.print("Nome: " + this.nome);
        if(time != null){
            System.out.println(" - Time: " + time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }
}
