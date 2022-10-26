/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.projeto.heranca.lp.exercicio;

/**
 *
 * @author aluno
 */
public class VendedorComissaoMaisFixo extends VendedorComissao{
    
    protected Double salarioFixo;

    public VendedorComissaoMaisFixo(Double salarioFixo, Integer codigo, String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + salarioFixo;
    }
    
   
}
