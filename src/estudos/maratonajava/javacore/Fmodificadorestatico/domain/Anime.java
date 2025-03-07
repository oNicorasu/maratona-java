package estudos.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // Bloco de inicialização Estática
    static{
        // Inicialização do array
        episodios = new int[5];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        System.out.println("Array de episodios inicializado no bloco de inicialização estático");
    }
    {
        System.out.println("Array de episodios inicializado no bloco de inicialização não estático");
    }

    public void imprime(){
        for (int i = 0; i < episodios.length; i++){
            System.out.print(episodios[i] + " ");
        }
        System.out.println();
    }

    public Anime() {
        // O bloco de inicialização já inicializou o array episodios
        System.out.println("Construtor padrão executado");
        for (int i = 0; i < episodios.length; i++){
            System.out.print(episodios[i] + " ");
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
        // O bloco de inicialização já inicializou o array episodios
        // Apenas definimos o nome
        System.out.println("Construtor com nome executado: " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
