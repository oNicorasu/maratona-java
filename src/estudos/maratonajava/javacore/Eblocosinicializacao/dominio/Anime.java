package estudos.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // Bloco de inicialização de instância
    {
        // Inicialização do array
        episodios = new int[5];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        System.out.println("Array de episodios inicializado no bloco de inicialização");
    }

    public void imprime(){
        for (int i = 0; i < episodios.length; i++){
            System.out.println(episodios[i]);
        }
    }

    public Anime() {
        // O bloco de inicialização já inicializou o array episodios
        System.out.println("Construtor padrão executado");
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
