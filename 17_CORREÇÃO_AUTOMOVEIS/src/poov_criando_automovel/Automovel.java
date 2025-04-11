package poov_criando_automovel;

import java.math.BigDecimal;

public class Automovel {

    private String modelo;
    private String cor;
    private Combustivel combustivel;
    public BigDecimal valor;
    
    public Automovel(String modelo, String cor, Combustivel combustivel) {
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
    
    public BigDecimal getPreco(){
    
        if(this.combustivel == Combustivel.ALCOOL){
            return valor = new BigDecimal("17000");
        }
        else if(this.combustivel == Combustivel.GASOLINA){
            return valor = new BigDecimal("2000");
        }
        else if(this.combustivel == Combustivel.DIESEL){
            return valor = new BigDecimal("25000");
        }
        else if(this.combustivel == Combustivel.GAS){
            return valor = new BigDecimal("30000");
        }
        else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "Automovel \nmodelo = " + modelo + ", \ncor = " + cor + ", \ncombustivel = " + combustivel;
    }

    

}
