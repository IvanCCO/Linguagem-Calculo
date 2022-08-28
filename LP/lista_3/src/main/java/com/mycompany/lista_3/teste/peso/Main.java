/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_3.teste.peso;
import java.util.Scanner;
/**
 *
 * @author ivanm
 */
public class Main {
    
    public static void main(String[] args) {
        
        CalcPeso calc = new CalcPeso();
        
        while(true){
                 
        String sexo;
        Double altura;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Pesquisa de Peso Ideal \nDigite 0 na altura para sair");
        
        do {            
            System.out.println("Qual seu sexo?");
            sexo = in.nextLine();
        } while (!(sexo.equals("M") || sexo.equals("F")));
        
        System.out.println("Qual sua altura?");
        altura = in.nextDouble();
        
        if(altura == 0){
            break;
        }
        
        calc.calculaPesoIdeal(sexo, altura);
        }
        System.out.println("Programa finalízado");
        
    }
}
