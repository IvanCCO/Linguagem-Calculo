/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.heranca.aula.consultoria;

/**
 *
 * @author aluno
 */
public class DesenvolvedorMobile extends Desenvolvedor{
    
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;

    public DesenvolvedorMobile(Integer qtdHorasTrabalhadasMobile, Double valorHoraTrabalhadaMobile, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }
    
    /**
     *
     * @return
     */
    @Override
    public Double getSalario(){
        return super.getSalario() + (this.qtdHorasTrabalhadasMobile * this.valorHoraTrabalhadaMobile);
    }
    
    @Override
    
    public String toString(){
        
        return String.format("Nome: %s\nMobile: %.2f", nome, getSalario());
    }
            
}
