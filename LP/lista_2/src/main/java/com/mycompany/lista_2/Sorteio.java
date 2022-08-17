package com.mycompany.lista_2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer numero, randomico, odds=0, even=0, contador=0;
        
        System.out.println("Digite um número");
        numero = leitor.nextInt();
        
        do {            
            randomico = ThreadLocalRandom.current().nextInt(1, 101);
            contador++;
            
            if(randomico % 2 == 0){
                odds++;
            }else{
                even++;
            }
            
            System.out.println("Tentativa " + contador + "\n resultado: "+ randomico);
                
        } while (contador < 200 || numero == randomico);
        
        System.out.println("================================================");
        System.out.println("Tentativas: " + contador);
        System.out.println("Pares: " + odds);
        System.out.println("ímpares: "+ even);
        
    }
}
