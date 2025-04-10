package poov.compra_automovel;

public class AutomovelLuxo extends AutomovelBasico {

    //Atibutos ou cracteristicas
    boolean direcaoHidraulica;
    boolean cambioAutomatico;
    boolean vidros_travasEletricos;

    public AutomovelLuxo(String modelo, String cor, 
                         TipoCombustivelEnum combustivel, 
                         boolean retrovisarLado, boolean limpadorVidro, boolean radio, boolean direcaoHidraulica, boolean cambioAutomatico, boolean vidros_travasEletricos) {
        
        super(modelo, cor, combustivel, retrovisarLado, limpadorVidro, radio);
        this.direcaoHidraulica = direcaoHidraulica;
        this.cambioAutomatico = cambioAutomatico;
        this.vidros_travasEletricos = vidros_travasEletricos;
    }

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica, TipoCombustivelEnum combustivel, int preco) {
        this.direcaoHidraulica = direcaoHidraulica;
        // if(direcaoHidraulica)//tem diração hidraulica = true
        // {
        //     this.direcaoHidraulica = true;
        //     if(combustivel == TipoCombustivelEnum.ALCOOL){
        //         System.out.println("Valor do automovel R$" + preco);
        //     } 
             
        // } else {
        //     this.direcaoHidraulica = false;
        // }
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
        // if(cambioAutomatico){
        //     this.cambioAutomatico = true;
        // } else {
        //     this.cambioAutomatico = false;
        // }
    }

    public boolean isVidros_travasEletricos() {
        return vidros_travasEletricos;
    }

    public void setVidros_travasEletricos(boolean vidros_travasEletricos) {
        this.vidros_travasEletricos = vidros_travasEletricos;
        // if(vidros_travasEletricos){
        //     this.vidros_travasEletricos = true;
        // } else {
        //     this.vidros_travasEletricos = false;
        // }
        
    }
}

