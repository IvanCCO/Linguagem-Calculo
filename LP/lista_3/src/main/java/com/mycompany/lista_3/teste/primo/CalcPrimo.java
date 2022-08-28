/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_3.teste.primo;

/**
 *
 * @author ivanm
 */
public class CalcPrimo {
    
    void verificarPrimo(Integer num){
        
        if(num >= 0){
         
        
        Integer contador = 0;
        
        for(int i = 1; i<=num; i++){
            
            if(num % i == 0){
                contador++;
            }
        }
        
        if(contador == 2){
            System.out.println("Primo");
        }else{
            System.out.println("Não primo");
        }
        
        }else{
            System.out.println("Programa Finalizado");
        }
    }
}
