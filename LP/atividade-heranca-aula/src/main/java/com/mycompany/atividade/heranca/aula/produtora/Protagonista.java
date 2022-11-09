/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.heranca.aula.produtora;

/**
 *
 * @author aluno
 */
public class Protagonista extends Ator{
    
    private Integer qtdHoraTrabalhadaProtagonista;
    private Double valorHoraTrabalhadaProtagonista; 

    public Protagonista(Integer qtdHoraTrabalhadaProtagonista, Double valorHoraTrabalhadaProtagonista, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHoraTrabalhadaProtagonista = qtdHoraTrabalhadaProtagonista;
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhada;
    }
    
    
    public Double getSalario(){
        
        return super.getSalario() + (qtdHoraTrabalhadaProtagonista * valorHoraTrabalhada);
    }
}
