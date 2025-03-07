package estudos.maratonajava.javacore.Eblocosinicializacao.teste;

import estudos.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime("HxH");
        anime.imprime();
        anime2.imprime();
    }
}
