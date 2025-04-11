package poov_criando_automovel;

import java.math.BigDecimal;

public class AutomovelLuxo extends AutomovelBasico{

    private  boolean temDirecao;
    private boolean temCambio;
    private boolean temTravas;
    
    public AutomovelLuxo(String modelo, String cor, Combustivel combustivel, boolean temRetrovisor,
    boolean temLimpado, boolean temRadio, boolean temDirecao, boolean temCambio, boolean temTravas){

        super(modelo, cor, combustivel, temRetrovisor, temLimpado, temRadio);
        this.temCambio = temCambio;
        this.temDirecao = temDirecao;//seria Direcao como o padrão do exercicio
        this.temTravas = temTravas;

    }

    public boolean isTemDirecao() {
        return temDirecao;
    }
    public void setTemDirecao(boolean temDirecao) {
        this.temDirecao = temDirecao;
    }
    public boolean isTemCambio() {
        return temCambio;
    }
    public void setTemCambio(boolean temCambio) {
        this.temCambio = temCambio;
    }
    public boolean isTemTravas() {
        return temTravas;
    }
    public void setTemTravas(boolean temTravas) {
        this.temTravas = temTravas;
    }


    public BigDecimal getPreco(){
        BigDecimal valor = super.getPreco();
        if(temDirecao){
            valor = valor.add(new BigDecimal("100.00"));
        }
        if(temCambio){
            valor = valor.add(new BigDecimal("250.00"));
        }
        if(temTravas){
            valor = valor.add(new BigDecimal("300.00"));
        }
        return valor;
    }

    @Override
    public String toString() {
        return super.toString() + "AutomovelLuxo [temDirecao=" + temDirecao + ", temCambio=" + temCambio + ", temTravas=" + temTravas + "Valor a pagar: R$ " + getPreco();
    }
    

}
