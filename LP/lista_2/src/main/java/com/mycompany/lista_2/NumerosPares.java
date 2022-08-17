package com.mycompany.lista_2;


public class NumerosPares {
    
    public static void main(String[] args) {
      
        int contador = 0;
        
        do {            
            if(contador % 2 == 0){
            System.out.println(contador);    
            }
            contador++;
        } while (contador <= 40);
    }   
}
