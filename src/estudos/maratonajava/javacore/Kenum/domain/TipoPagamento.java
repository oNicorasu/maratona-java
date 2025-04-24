package estudos.maratonajava.javacore.Kenum.domain;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calculaValorDesconto(double valorDesconto) {
            return valorDesconto * 0.1;
        }
    }, CREDITO{
        @Override
        public double calculaValorDesconto(double valorDesconto) {
            return valorDesconto * 0.05;
        }
    };

    public double calculaValorDesconto(double valorDesconto) {
        return 0;
    }
}
