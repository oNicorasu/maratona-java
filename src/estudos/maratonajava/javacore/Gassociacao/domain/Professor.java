package estudos.maratonajava.javacore.Gassociacao.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminario;
    }

    public void imprimir() {
        System.out.println("|-----------------------------------------|");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios == null) return;
        for (Seminario seminario : this.seminarios) {
            System.out.print("Seminarios: ");
            System.out.print(seminario.getTitulo() + " - ");
            System.out.print(seminario.getLocal().getEndereco());
            System.out.print("\nAlunos: \n");
            if (seminario.getAlunos() == null) continue;
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.print(aluno.getNome() + " - ");
                System.out.println(aluno.getIdade());
            }
        }

    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
