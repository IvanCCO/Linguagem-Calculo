
package com.mycompany.lista_4.maria;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();
        
        
        bolo1.setSabor("Abacaxi com Côco");
        bolo1.setValor(40.5);
        bolo2.setSabor("Chocolate com creme");
        bolo2.setValor(39.9);
        bolo3.setSabor("Damasco");
        bolo3.setValor(46.7);
        
        String primeiroMenu = null;
       do{
            
            Integer quantidadeComprada;
            System.out.println("Escolha um item do menu");
            System.out.println(String.format("1 - %s", bolo1.getSabor()));
            System.out.println(String.format("2 - %s", bolo2.getSabor()));
            System.out.println(String.format("3 - %s", bolo3.getSabor()));
            System.out.println("Digite Sair para encerrar o programa");
            
            primeiroMenu = in.next();

            switch (primeiroMenu) {
                case "1":
                    System.out.println("Beleza, você escolheu " + bolo1.getSabor());
                    System.out.println("Quantas unidades deseja comprar?");
                    quantidadeComprada = in.nextInt();
                    bolo1.comprarBolo(quantidadeComprada);
                    bolo1.exibirRelatorio();
                    break;
                case "2":
                    System.out.println("Beleza, você escolheu " + bolo2.getSabor());
                    System.out.println("Quantas unidades deseja comprar?");
                    quantidadeComprada = in.nextInt();
                    bolo2.comprarBolo(quantidadeComprada);
                    bolo2.exibirRelatorio();
                    break;
                case "3":
                    System.out.println("Beleza, você escolheu " + bolo3.getSabor());
                    System.out.println("Quantas unidades deseja comprar?");
                    quantidadeComprada = in.nextInt();
                    bolo3.comprarBolo(quantidadeComprada);
                    bolo3.exibirRelatorio();
                    break;
                default:
                    System.out.println("Código inválido");
                    break;
            }
       }while(!primeiroMenu.toUpperCase().equals("SAIR"));
        
        
        System.out.println("Muito obrigado");
    }
}
