/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classe.abstrata.funcionario;

/**
 *
 * @author ivanm
 */
public class Horista extends Funcionario{
    
    
    private Integer qtdHora;
    private Double valorHora ;

    public Horista(Integer qtdHora, Double valorHora, String cpf, String nome) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }
    

    @Override
    public Double calcSalario(){
    
        return qtdHora*valorHora;
    }
}
