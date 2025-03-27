package br.edu.iftm.poov.lampada;


public class Lampada {

    private int tensao;
    private int potencia;
    private boolean acesa;
    private boolean queimada;
    private boolean quebrada;

    
// Padrao
public Lampada() {
    this(110, 40);//deve-se colocar como a primeira linha do dogido, 
    System.out.println("Construtor padrao executado");
    // setTensao(110);
    // setPotencia(40);
}

// Inicializacao 1
public Lampada(int t, int p) {
    this(t, p, false);
    System.out.println("Construtor de inicializacao 1 executado");
    // setTensao(t);
    // setPotencia(p);
}

// Inicializacao 2
public Lampada(int t, int p, boolean a) {
    System.out.println("Construtor de inicializacao 2 executado");
    setTensao(t);
    setPotencia(p);
    acesa = a;
}

public void setTensao(int tensao) {
    if (tensao == 110 || tensao == 220) {
        this.tensao = tensao;
    } else {
        System.err.println("Valor inválido de tensão. Usando o valor padrão 220V.");
        this.tensao = 220;
    }
}

public int getTensao() {
    return tensao;
}

public void setPotencia(int potencia) {
    if (potencia == 40 || potencia == 60 || potencia == 100 || potencia == 150) {
        this.potencia = potencia;
    } else {
        System.err.println("Valor inválido de potência. Usando o valor padrão 40W.");
        this.potencia = 40;
    }
}

public int getPotencia() {
    return potencia;
}

public void setAcesa(boolean acesa) {
    if (acesa) { //acesa true
        if (!quebrada && !queimada) {
            this.acesa = true;
        }
    } else { //acesa false
        this.acesa = false;
    }
}

public boolean isAcesa() {
    return acesa;
}

public void setQuebrada(boolean quebrada) {
    if (quebrada) {  // quebrada true
        this.quebrada = true;
        if (acesa) {
            queimada = true;
            acesa = false;
        }
    } else {  // quebrada false
        this.quebrada = false;
    }
}

public boolean isQuebrada() {
    return quebrada;
}

public void setQueimada(boolean queimada) {
    if (queimada) {  // queimada true
        this.queimada = true;
        acesa = false;
    } else { // queimada false
        this.queimada = false;
    }
}

public boolean isQueimada() {
    return queimada;
}

public void acender() {
    setAcesa(true);
}

public void apagar() {
    setAcesa(false);
}

public void quebrar() {
    setQuebrada(true);
}

public void queimar() {
    setQueimada(true);
}

public void mostrarNaTela() {
    System.out.println(tensao + "V");
    System.out.println(potencia + "W");
    System.out.println(acesa ? "Acesa" : "Apagada");
    if (queimada) {
        System.out.println("Queimada");
    }
    if (quebrada) {
        System.out.println("Quebrada");
    }
}

    //inicializando
    
}