/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classe.abstrata.funcionario;

import java.util.ArrayList;

/**
 *
 * @author ivanm
 */
public class Empresa {
    private ArrayList<Funcionario> funcionarios;
    private String nome;

    public Empresa(String nome) {
        this.funcionarios = new ArrayList();
        this.nome = nome;
    }
    
    
    
    
    public void adicionarFuncionario(Funcionario f){
        
        funcionarios.add(f);
    }
    
    public void exibeTodos(){
        
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }
  
    
    public void exibeTotalSalario(){
        
        
        Double total = 0.0;
        
        for (Funcionario funcionario : funcionarios) {
           
            total += funcionario.calcSalario();
        }
        
        System.out.println(total);
    }
}
