/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_3.teste.media;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite 2 notas");
        System.out.println("Nota um:");
        double nota1 = in.nextDouble();
        System.out.println("Nota dois:");
        double nota2 = in.nextDouble();
        
        CalcMedia calc = new CalcMedia();
        
        double resposta = calc.calcularMedia(nota1, nota2);
        
        System.out.println(resposta);
        
        
    }
}
