package poov.compra_automovel;

public class Automovel {
    private String  modelo;
    private String cor;
    private String combustivel;
    private int precoBase;
    private int precoFinal;

    //PADRÃO
    public Automovel(String modelo, String cor, String combustivel){  
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.precoBase = calcularPrecoBase();
    }
    
    private int calcularPrecoBase(){
        switch (combustivel) {
            case "ALCOOL": return 17000;
            case "GASOLINA": return 20000;
            case "DIESEL": return 25000;
            case "GAS": return 30000;
            default: return 0;
        }
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

//////////////////////////////////////////////////////////////////////////
    
public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
        this.precoBase = calcularPrecoBase();
    }

    public int getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(int Final){
        

    }

    public void mostrarDados(){
        // System.out.format("Automovel\n Modelo: %s,\n Cor: %s,\n Preço do carro com base no seu combustivel: R$ %d \n\n" ,modelo, cor, getPreco());
        System.out.println("[ Automovel ]\nModelo: " + modelo + "\nCor: " + cor + "\nTipo de Combuativel: " + combustivel +"\nValor do carro R$: " + precoBase);
    }


    // @Override
    // public String toString() {
    //     return "[ Automovel ] \nmodelo : " + modelo + ",\ncor: " + cor + ",\ncombustivel: " + combustivel + ",\npreco: " + getPreco();
    // }
    
}
