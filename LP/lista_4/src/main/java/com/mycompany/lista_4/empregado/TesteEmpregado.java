/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_4.empregado;

import java.util.Scanner;

/**
 *
 * @author ivanm
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        
        Empregado empregado1 = new Empregado("João", "Analista de Sistemas", 5.400);
        
  
                
            System.out.println("Nome do funcionário?");
            String nome = in.next();
            System.out.println("Cargo do funcionário");
            String cargo = in.next();
            System.out.println("Salário");
            Double salario = in.nextDouble();
            
       

        Empregado empregado2 = new Empregado(nome, cargo, salario);
    
            System.out.println(String.format("Nome: %s\nCargo: %s\nSalario antigo: %.2f\nSalario Atual: " + empregado1.reajustarSalario(15.0), empregado1.getNome(), empregado1.getCargo(), empregado1.getSalario()));    
    
        
        
        
    }
}
