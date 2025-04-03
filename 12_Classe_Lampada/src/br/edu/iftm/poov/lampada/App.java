package br.edu.iftm.poov.lampada;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

    //    Lampada l1 = new Lampada();
    //    Lampada l2 = new Lampada(110, 100);
    //    Lampada l3 = new Lampada(-1000, -1000, true);


       LampaadaColorida lc1 = new LampaadaColorida();
       lc1.setCor("Azul");
       lc1.acender();
       lc1.mostrarNaTela();

       LampaadaColorida lc2 = new LampaadaColorida(220, 100, "Vermelha");
       lc2.mostrarNaTela();

       LampaadaColorida lc3 = new LampaadaColorida(220, 100, "Amarela");
       lc3.mostrarNaTela();

    //    l2.setAcesa(true);
    //    l2.acender();
    //    //l2.setAcesa(false);
    //    l2.apagar();


    //    l3.setTensao(-1000);
    //    l3.setPotencia(-1000);
    //    l3.acender();
    //    l3.queimar();
    //    l3.quebrar();


         // l2.setTensao(220);
        // int total = l1.getPotencia() + l2.getPotencia() + l3.getPotencia();
        // if (l3.isAcesa()) {      
        // }

        // l1.mostrarNaTela();
        // l2.mostrarNaTela();
        // l3.mostrarNaTela();
    }
}
