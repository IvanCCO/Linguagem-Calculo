/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.projeto.heranca.lp.exercicio;

/**
 *
 * @author aluno
 */
public class Main {
  
    public static void main(String[] args) {
        
        Departamento dpt = new Departamento("IlaIA");
        VendedorComissaoMaisFixo vendedorFixo = new VendedorComissaoMaisFixo(1230.40, 1, "Joao", 3500.00, 10.0);
        VendedorComissaoMaisFixo vendedorFixo2 = new VendedorComissaoMaisFixo(1302.20, 2, "Pedrinho", 1355.90, 10.0);
        VendedorComissao vendedorComissao = new VendedorComissao(1, "Pedro", 1203.21, 10.0);
        System.out.println(vendedorFixo.calcularSalario());
        
        dpt.adicionaVendedor(vendedorFixo);
        dpt.adicionaVendedor(vendedorFixo2);
        dpt.adicionaVendedor(vendedorComissao);
        
        System.out.println(dpt.getTotalSalario());
        System.out.println(dpt.getQuantidadeVendedoresFixo());
        
        
    }
    
}
