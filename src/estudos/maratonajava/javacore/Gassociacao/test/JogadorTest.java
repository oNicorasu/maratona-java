package estudos.maratonajava.javacore.Gassociacao.test;

import estudos.maratonajava.javacore.Gassociacao.domain.Jogador;
import estudos.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Menino Ney");
        Jogador jogador2 = new Jogador("Coutinho");
        Jogador jogador3 = new Jogador("Rafinha");
        Time time = new Time("Vasco");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        for(int i = 0; i < jogadores.length; i++){
            jogadores[i].imprimir();
        }
    }
}
