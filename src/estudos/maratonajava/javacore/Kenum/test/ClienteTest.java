package estudos.maratonajava.javacore.Kenum.test;

import estudos.maratonajava.javacore.Kenum.domain.Cliente;
import estudos.maratonajava.javacore.Kenum.domain.TipoCliente;
import estudos.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Mariana", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Mariana", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calculaValorDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calculaValorDesconto(100));
    }
}
