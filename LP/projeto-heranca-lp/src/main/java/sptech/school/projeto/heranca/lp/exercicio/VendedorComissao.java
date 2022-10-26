/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.projeto.heranca.lp.exercicio;

/**
 *
 * @author aluno
 */
public class VendedorComissao {
  
    protected Integer codigo;
    protected String nome;
    protected Double vendas;
    protected Double taxa;

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }

    

    
    public Double calcularSalario(){
        
        return (taxa/100) * vendas;
        
    }
    
}
