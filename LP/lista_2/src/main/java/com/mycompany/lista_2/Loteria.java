/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Loteria {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer numero, aleatorio, contador=0;
        
        System.out.println("Digite um número");
        numero = leitor.nextInt();
        
        do {            
            
           aleatorio = ThreadLocalRandom.current().nextInt(0 , 11);
           contador ++;
            System.out.println("Tentativa: " + contador + "\n resultado: "+aleatorio);
            
        } while (aleatorio != numero);
        
        
        if(contador <= 3){
            System.out.println("Você é muito sortudo acertou na " + contador + " tentativa");
        }else if(contador <= 10){
            System.out.println("Você é sortudo acertou na " + contador + " tentativa");
        }else{
            System.out.println("É melhor você parar de apostar e ir trabalhar acertou na " + contador + " tentativa");
        }
        
    }
}
