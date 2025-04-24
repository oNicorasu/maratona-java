package estudos.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    private String nome;
    private  String cpf;
    private Endereco endereco;

    public Pessoa() {}
    public Pessoa(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("Endereco: " + endereco.getRua() + " " + endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
