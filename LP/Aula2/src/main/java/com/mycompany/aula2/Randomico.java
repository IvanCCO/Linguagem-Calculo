package com.mycompany.aula2;

import java.util.concurrent.ThreadLocalRandom;


public class Randomico {
    
    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++){
        
            int numero = ThreadLocalRandom.current().nextInt(10 , 20);
        
            System.out.printf("Uhulllll %d \n", numero);
        }
        
    }
}
