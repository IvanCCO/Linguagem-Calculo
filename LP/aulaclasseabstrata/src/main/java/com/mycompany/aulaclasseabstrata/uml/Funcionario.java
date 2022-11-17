/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaclasseabstrata.uml;

/**
 *
 * @author olivers
 */
public abstract class Funcionario {

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    
    
    private String cpf;
    private String nome;
    
    public abstract Double calcSalario();
    
    @Override
    public String toString(){
        
        return "CPF: " + this.cpf + "\nNome: " + this.nome;
        
    }
    
    
}
