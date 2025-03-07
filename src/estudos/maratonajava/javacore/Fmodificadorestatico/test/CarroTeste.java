package estudos.maratonajava.javacore.Fmodificadorestatico.test;

import estudos.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota","Supra",280);
        Carro carro2 = new Carro("Mitsubishi","Lancer EVO X",300);
        Carro carro3 = new Carro("Mitsubishi","Eclipse",260);
        carro.imprime();
        carro2.imprime();
        Carro.velocidadeLimite = 450;
        carro3.imprime();
    }
}
