/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_3.teste.primo;

import java.util.Scanner;

/**
 *
 * @author ivanm
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        CalcPrimo calc = new CalcPrimo();
        Scanner in = new Scanner(System.in);
        
        Integer numero;
        
        do {            
            System.out.println("Digite um número:");
            numero = in.nextInt();
            calc.verificarPrimo(numero);
            
        } while (numero >= 0);
        
        
    }
}
