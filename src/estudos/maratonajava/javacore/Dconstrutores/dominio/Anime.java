package estudos.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private String nome;
    private int episodios;
    private String genero;
    private int temporadas;

    public Anime(String tipo, String nome, int episodios, String genero, int temporadas) {
        this(tipo,nome,episodios,genero);
        this.temporadas = temporadas;
    }

    public Anime(String tipo, String nome, int episodios, String genero) {
        this();
        System.out.println("Dentro do Anime Construtor");
        this.tipo = tipo;
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime() {
        System.out.println("Dentro do Anime VazioConstrutor");
    }

    public void imprime() {
        System.out.println(this.tipo);
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}
