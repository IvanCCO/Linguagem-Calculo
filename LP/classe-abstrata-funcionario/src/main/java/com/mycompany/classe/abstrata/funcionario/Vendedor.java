/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classe.abstrata.funcionario;

/**
 *
 * @author ivanm
 */
public class Vendedor extends Funcionario{
    
    
    private Double vendas;
    private Double taxa;

    public Vendedor(Double vendas, Double taxa, String cpf, String nome) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }
    
    
    
    @Override
    public Double calcSalario(){
        return taxa*vendas;
    }
    
}