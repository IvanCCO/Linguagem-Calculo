package com.mycompany.aula3;

import java.util.Scanner;


public class App {
    
    public static void main(String[] args) {
        
        Utilitario util = new Utilitario();
               
//        util.exibirLinha();
//        System.out.println("Ivan");
//        util.exibirLinha();
//        System.out.println("Medeiros");
//        util.exibirLinha();
//               
        Scanner in = new Scanner(System.in);
        
//        System.out.println("Digite seu nome");
        
//        String nomeDigitado = in.nextLine();
                
//        util.exibirNome(nomeDigitado);

//        util.exibirNomeComLinha(nomeDigitado);
        
        System.out.println("Digite um número");
        double numero1 = in.nextDouble();
        System.out.println("Digite outro número");
        double numero2 = in.nextDouble();
        System.out.println("Numero 3");
        double numero3 = in.nextDouble();
        
        Calculadora util2 = new Calculadora();
        
        System.out.println(util2.somar(numero1, numero2, numero3));
  
        
    }
    
}
