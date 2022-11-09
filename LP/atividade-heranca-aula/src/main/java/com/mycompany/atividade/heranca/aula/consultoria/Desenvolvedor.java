/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.heranca.aula.consultoria;

/**
 *
 * @author aluno
 */
public class Desenvolvedor {
    
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }  
    
    public Double getSalario(){
        
        return this.qtdHorasTrabalhadas * this.valorHoraTrabalhada;
    }
    
   @Override
   public String toString(){
    
       return String.format("Nome: %s\nSalário: %.2f", this.nome, getSalario());
   }
}
