package estudos.maratonajava.javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Física"),
    PESSOA_JURIDICA(2,"Pessoa Jurídica");

    private int codigo;
    private String descricao;

    TipoCliente(int cod, String descricao){
        this.codigo = cod;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
