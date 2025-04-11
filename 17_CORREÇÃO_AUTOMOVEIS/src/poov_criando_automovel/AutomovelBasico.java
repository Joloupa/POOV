package poov_criando_automovel;

import java.math.BigDecimal;

public class AutomovelBasico extends Automovel{

    private boolean temRetrovisor;
    private boolean temLimpado;
    private boolean temRadio;

    public AutomovelBasico(String modelo, String cor, Combustivel combustivel, boolean temRetrovisor,
            boolean temLimpado, boolean temRadio) {
        super(modelo, cor, combustivel);
        this.temRetrovisor = temRetrovisor;
        this.temLimpado = temLimpado;
        this.temRadio = temRadio;
    }

    public void setAutomovelBasico(String modelo, String cor, Combustivel combustivel, boolean temRetrovisor,
    boolean temLimpado, boolean temRadio){

        setModelo(modelo);
        setCor(cor);
        setCombustivel(combustivel);        

        this.temRetrovisor = temRetrovisor;
        this.temLimpado = temLimpado;
        this.temRadio = temRadio;
    }


    public boolean isTemRetrovisor() {
        return temRetrovisor;
    }
    public void setTemRetrovisor(boolean temRetrovisor) {
        this.temRetrovisor = temRetrovisor;
    }


    public boolean isTemLimpado() {
        return temLimpado;
    }
    public void setTemLimpado(boolean temLimpado) {
        this.temLimpado = temLimpado;
    }


    public boolean istemRadio() {
        return temRadio;
    }
    public void settemRadio(boolean temRadio) {
        this.temRadio = temRadio;
    }
    
    public BigDecimal getPreco(){
        BigDecimal valor = super.getPreco();
        if(temRetrovisor){
            valor = valor.add(new BigDecimal("100.00"));
        }
        if(temLimpado){
            valor = valor.add(new BigDecimal("250.00"));
        }
        if(temRadio){
            valor = valor.add(new BigDecimal("300.00"));
        }
        return valor;
    }

    @Override
    public String toString() {
        return super.toString() + "AutomovelBasico [temRetrovisor=" + temRetrovisor + ", temLimpado=" + temLimpado + ", temRadio=" + temRadio + "Valor a pagar: R$ " + getPreco();
    }
}
