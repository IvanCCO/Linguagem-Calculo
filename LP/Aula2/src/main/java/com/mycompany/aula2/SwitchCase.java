package com.mycompany.aula2;

import java.util.Scanner;

public class SwitchCase {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número");
        Integer numeroDigitado = leitor.nextInt();
        
        String diaDaSemana;
        
        switch (numeroDigitado) {
            case 1:
                diaDaSemana = "Domingou...";
                
            case 2:
                diaDaSemana = "Sextou";
                
            
                
            default:
                diaDaSemana = "Jogo da Brasil";
                break;
        }
        
        System.out.println(diaDaSemana);
    }
}
