package br.edu.iftm.poov.lampada;

public class LampaadaColorida extends Lampada {

    private String cor;

    public LampaadaColorida(){
        super(100,60,false);
        System.out.println("Construtor padrao LampadaColorida executado");
        cor = "Azul";
    }

    public LampaadaColorida(int tensao, int potencia, String cor){
        super(tensao, potencia);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void mostrarNaTela(){
        super.mostrarNaTela();
        System.out.println(cor);
    }
}
