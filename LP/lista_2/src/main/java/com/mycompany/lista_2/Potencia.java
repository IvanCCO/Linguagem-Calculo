
package com.mycompany.lista_2;  

import java.util.Scanner;

public class Potencia {
    
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
        Integer A,B, aux;
        
        System.out.println("Digite um valor para Base");
        A = in.nextInt();
        System.out.println("Digite um valor para Potência");
        B = in.nextInt();
        aux = A;
        
        for(int i = 1; i<B; i++){
            
            A *= aux;
        }
        
        System.out.println("O número " + aux + " elevado a " + B + " resulta em " + A);
    }
    
    
    
}
