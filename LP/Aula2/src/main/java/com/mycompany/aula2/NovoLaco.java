/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author aluno
 */
public class NovoLaco {
    
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
        
        Integer resultado;
         
        int numero = ThreadLocalRandom.current().nextInt(10 , 20);   
        
        do {
            System.out.println("Digite um número");
            resultado = leitor.nextInt();
            
        }while (numero != resultado);          
            
        
        
        System.out.println("Você acertou o número é " + numero);
        
       
    }
}
