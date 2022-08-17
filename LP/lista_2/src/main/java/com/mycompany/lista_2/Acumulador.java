package com.mycompany.lista_2;

import java.util.Scanner;

public class Acumulador {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite números (0 para parar)");
        Integer numero, sum=0;
        do{
        numero = leitor.nextInt();    
        sum += numero;
        }while (numero != 0);
            
        System.out.println("A soma de todos os números é " + sum);
        
        
    }
}
