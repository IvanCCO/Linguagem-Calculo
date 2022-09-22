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
        
        
        Empregado empregado1 = new Empregado("João", "Analista de Sistemas", 5400.00);
        
  
                
            System.out.println("Nome do funcionário?");
            String nome = in.next();
            System.out.println("Cargo do funcionário");
            String cargo = in.next();
            System.out.println("Salário");
            Double salario = in.nextDouble();
            
       

        Empregado empregado2 = new Empregado(nome, cargo, salario);
    
            System.out.println(String.format("Nome: %s\nCargo: %s\nSalario antigo: %.2f\nSalario Atual: %.2f", empregado1.getNome(), empregado1.getCargo(), empregado1.getSalario(), empregado1.reajustarSalario(15.0)));   
            String linha = "*";
            System.out.println(linha.repeat(30));
            System.out.println(String.format("Nome: %s\nCargo: %s\nSalario antigo: %.2f", empregado2.getNome(), empregado2.getCargo(), empregado2.getSalario()));   
            System.out.println("Quantos porcento deseja reajustar o salário?");
            Double ajuste = in.nextDouble();
            Double reajuste = empregado2.reajustarSalario(ajuste);
            System.out.println(String.format("Nome: %s\nCargo: %s\nSalario antigo: %.2f\nSalario Atual: %.2f", empregado2.getNome(), empregado2.getCargo(), empregado2.getSalario(), reajuste));   

        
    }
}
