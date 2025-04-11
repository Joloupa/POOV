package poov_criando_automovel;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        ArrayList<AutomovelBasico> automoveisBasicos = new ArrayList<>();
        ArrayList<AutomovelBasico> automoveisLuxuosos = new ArrayList<>();
        int op1, op2, pagar;
        boolean terminar = false;

        Scanner s = new Scanner(System.in);

        String modelo, cor;
        Combustivel combustivel;
        boolean temRetrovisor = false, temLimpador = false, temRadio = false;
        boolean temDirecao = false, temCambio = false, temTravas = false;

        AutomovelBasico ab;
        AutomovelLuxo al;

        do{
            temRetrovisor = temLimpador = temRadio = false;
            temDirecao  = temCambio = temTravas = false;

            System.out.println("Modelo: ");
            modelo = s.nextLine();
            System.out.println("Cor: ");
            cor = s.nextLine();

            System.out.println("1 - Alcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Flex");
            System.out.println("4 - Diesel");
            System.out.println("5 - Gas");
            System.out.println("6 - Hibrido");
            System.out.println("7- Eletrico");
            op1 = Integer.parseInt(s.nextLine());

            combustivel = Combustivel.values()[op1 - 1];

            System.out.println("1 - Automovel Basico");
            System.out.println("2 - Automovel Luxo");
            System.out.print("\nOpcao: ");

            op1 = Integer.parseInt(s.nextLine());

            switch (op1) {
                case 1:
                    do{
                        System.out.println("1 - com retrovisor");
                        System.out.println("2 - com limpador");
                        System.out.println("3 - com radio");
                        System.out.println("4 - Terminar");
                        System.out.print("\nOpcao: ");
                        op2 = Integer.parseInt(s.nextLine());
                        switch (op2) {
                            case 1:
                                temRetrovisor = true;
                                pagar = getPreco();
                                break;
                            case 2:
                                temLimpador = true;
                                break;
                            case 3:
                                temRadio = true;
                                break;
                        }
                    }while(op2 != 4);
                    ab = new AutomovelBasico(modelo, cor, combustivel, temRetrovisor, temLimpador, temRadio);
                    automoveisBasicos.add(ab);
                    break;
                case 2:
                    do{
                        System.out.println("1 - Com retrovisor");
                        System.out.println("2 - Com limpador");
                        System.out.println("3 - Com radio");
                        System.out.println("4 - Com direção hidráulica");
                        System.out.println("5 - Com câmbio automatico");
                        System.out.println("6 - Com travas e vidros eletricos");
                        System.out.println("7 - Termina");
                        System.out.print("\nOpção: ");
                        op2 = Integer.parseInt(s.nextLine());
                        switch(op2){
                            case 1:
                                temRetrovisor = true;
                                break;
                            case 2:
                                temLimpador = true;
                                break;
                            case 3:
                                temRadio = true;
                                break;
                            case 4:
                                temDirecao = true;
                                break;
                            case 5:
                                temCambio = true;;
                                break;
                            case 6:
                                temTravas = true;
                                break;
                        }
                    }while(op2 != 7);
                    al = new AutomovelLuxo(modelo, cor, combustivel, temRetrovisor, temLimpador, temRadio, temDirecao, temCambio, temTravas);
                    automoveisLuxuosos.add(al);
                    break;

                default:
                    System.out.println("Opção inavalida.");
                    break;
            }

            System.out.println(automoveisBasicos);
            System.out.println(automoveisLuxuosos);

            System.out.println("Quer rodar de novo?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.print("\nOpção: ");
            op1 = Integer.parseInt(s.nextLine());

            if(op1 == 2){
                terminar = true;
            }

        }while(!terminar);

        s.close();

    }
}
