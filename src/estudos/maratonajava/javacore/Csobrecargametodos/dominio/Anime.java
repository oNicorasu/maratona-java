package estudos.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    public String tipo;
    public String nome;
    public int episodios;
    public String genero;

    public void init(String tipo, String nome, int episodios) {
        this.tipo = tipo;
        this.nome = nome;
        this.episodios = episodios;
    }

    public void init(String tipo, String nome, int episodios, String genero) {
        init(tipo, nome, episodios);
        this.genero = genero;
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
}
