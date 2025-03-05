package estudos.maratonajava.javacore.Aintroducaoclasses.test;

import estudos.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Subaru";
        carro1.ano = 2015;
        carro1.modelo = "Impreza";
        carro1.cor = "Azul";

        Carro carro2 = new Carro();
        carro2.nome = "Mitsubishi";
        carro2.ano = 2012;
        carro2.modelo = "Lancer Evolution IX";
        carro2.cor = "Cinza Strato";

        System.out.println("Marca: " + carro1.nome + " | Modelo: " + carro1.modelo + " | Ano: " + carro1.ano + " | Cor: " + carro1.cor);
        System.out.println("Marca: " + carro2.nome + " | Modelo: " + carro2.modelo + " | Ano: " + carro2.ano + " | Cor: " + carro2.cor);
    }
}
