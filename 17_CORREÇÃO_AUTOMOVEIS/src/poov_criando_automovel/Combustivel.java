package poov_criando_automovel;

public enum Combustivel {

    ALCOOL("Alcool"), 
    GASOLINA("Gasolina"), 
    FLEX("Flex"), 
    DIESEL("Diesel"), 
    GAS("Gas"), 
    HIBRIDO("Hibrido"), 
    ELETRICO("Eletrico");

    private String descricao;

    private Combustivel(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // public

    // private
}
