package poov.compra_automovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner s = new Scanner(System.in);
        // String M = s.nextLine();//Modelo
        // String C = s.nextLine();//Cor 
        // String Comb = s.nextLine();//Combustivel
        //  SomaPreco Final = new SomaPreco();
        // List<Integer> p = new ArrayList<>();
        int[] vlr = new int[3];



        // Automovel c1 = new Automovel("chevrolet Camaro", "Cinza", "ALCOOL");
        // // c1.toString();
        // c1.mostrarDados();

        // System.out.println("\n\n");

        AutomovelBasico c2 = new AutomovelBasico("chevrolet Monza", "branco", "ALCOOL", true, true, true);
        c2.mostrarDados();

        System.out.println("\n\n");

        AutomovelBasico c3 = new AutomovelBasico("chevrolet Astro", "Cinza", "GASOLINA", false, false, false);
        c3.mostrarDados();
        // AutomovelLuxo c3 = new AutomovelLuxo("Fiat 147", "Amarelo", "ALCOOL", false, false, false, false, false, false);
        // c3.toString();
      

        // Automovel carro2 = new Automovel("Chevorlet Monza", "Preto");
        // carro2.mostrarDados();

        // Automovel carro3 = new Automovel("Jeep Renegade", "Preto");
        // carro3.mostrarDados();

        // Automovel carro4 = new Automovel("Chevrolet Astra Multipower", "Branco");
        // carro4.mostrarDados();

        // TipoCombustivelEnum[] tipos = TipoCombustivelEnum.values();
        // for (TipoCombustivelEnum valores : tipos) {
        //     System.out.println(valores);
        // }
    }

    // public enum combustivel{
    // // alcool, gasolina(20000), flex, diesel, gas, hibrido, eletrico;
    // }
}
