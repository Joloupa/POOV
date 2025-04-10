package poov.compra_automovel;

import java.math.BigDecimal;
import java.util.ArrayList;


// import java.lang.Math;

public class AutomovelBasico extends Automovel{

    private boolean retrovisorLado;
    private boolean limpadorVidro;
    private boolean radio;
    // private String ponto;
    private ArrayList<String> valores = new ArrayList<String>();
    // private long[] vlrs = new long[3];
    

    public AutomovelBasico(String modelo, String cor, 
                           String combustivel, 
                           boolean retrovisarLado, boolean limpadorVidro, boolean radio) {
        
        super(modelo, cor, combustivel);
        this.retrovisorLado = retrovisarLado;
        this.limpadorVidro = limpadorVidro;
        this.radio = radio;

        //Preenche a lista e o vetor inicialmente com três valores zerados
        // for(int i = 0; i < 3; i++){
            // vlrs[i] = 0;
            // valores.add(0);
        // } 
            
    }




    public boolean getRetrovisorLado() {
        return retrovisorLado;
    }
    public void setRetrovisorLado(boolean retrovisarLado, String valor) {
        this.retrovisorLado = retrovisarLado;
        valor = (retrovisarLado ? "100" : "0");
        // vlrs[0] = valor;
        this.valores.add(valor);
        // valores.set(0, valor);//atualiza posição 0 da lista

        // if(retrovisarLado){//verdade
        //     this.retrovisorLado = retrovisarLado;            
        //     valores.add(100);
        //     vlrs[0] = 100;

        // } else{
        //     this.retrovisorLado = retrovisarLado;
        //     valores.add(0);
        //     vlrs[0] = 0;
        // }
        
    }



    public boolean getLimpadorVidro() {
        return limpadorVidro;
    }
    public void setLimpadorVidro(boolean limpadorVidro, String valor) {
        this.limpadorVidro = limpadorVidro;
        valor = limpadorVidro ? "250" : "0";
        // vlrs[1] = valor;
        this.valores.add(valor);
        // valores.set(1, valor);
        
        // if(limpadorVidro){
        //     this.limpadorVidro = limpadorVidro;
        //     // this.valor = 250;
        //     valores.add(250);
        //     vlrs[1] = 250;
           
        // }
        // else{
        //     this.limpadorVidro = limpadorVidro;
        //     valores.add(0);
        //     vlrs[1] =  0;
        // }
    }


    public boolean getRadio() {
        return radio;
    }
    public void setRadio(boolean radio, String valor){
        this.radio = radio;
        valor = radio ? "300" : "0";
        // vlrs[2] = valor;
        this.valores.add(valor);

        // valores.set(2, valor);
        // if(radio){//vdd
        //     this.radio = radio;
        //     // this.valor = 300;
        //     valores.add(300);
        //     vlrs[2] = 300;
        // }
        // else{
        //     this.radio = radio;
        //     valores.add(0);
        //     vlrs[2] = 0;
        // }
    }


    // public int getVlrs(){
    //     return vlrs;
    // }

    @Override
    public void mostrarDados(){
        // super.mostrarDados();
        System.out.println("[Automovel Basico] " + "\nRetrovisor do Lado do passageiro: " + retrovisorLado + "\nLimpador de vidro: " + limpadorVidro + "\nRadio AM/FM: " + radio);
        
        // System.out.println("\n--- Valores em vlrs ---");
        // for(int i = 0; i < vlrs.length; i++){
        //     System.out.format("\nposição(%d) , vlrs: %d%n", i, vlrs[i]);
        // }


        
        System.out.println("\n--- Valores no ArrayList ---");
        for(int i=0; i<valores.size(); i++){
            System.out.println("valores = " + valores.get(i));
        }
        
        // for(String val : valores){
        //     System.out.format("valores = %s ",val);
        // }

        
        
    }

    

    // @Override
    // public String toString() {
    //     return "[ AutomovelBasico ] \nretrovisar do Lado: " + retrovisarLado + ",\nLimpador de Vidro: " + limpadorVidro + "Rádio AM/FM: " +",\nModelo: " + getModelo() + ",\nCor: "
    //             + getCor() + ",\nTipo de Combustivel: " + getCombustivel() + ",\nPreco: " + getPreco();
    // }
    
}


