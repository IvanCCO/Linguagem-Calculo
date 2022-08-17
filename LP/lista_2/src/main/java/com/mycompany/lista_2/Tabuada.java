package com.mycompany.lista_2;

import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número");
        Integer numero = leitor.nextInt();
        System.out.println("Tabuada do " + numero + ":");
        Integer resultado;
        for(int i =0; i <= 10; i++){
            
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
           
        }
        
        System.out.println("Fim da execução");
    }
}
