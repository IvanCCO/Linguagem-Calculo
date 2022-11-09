/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.projeto.heranca.lp.exercicio;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Departamento {
 
    private String nome;
    private ArrayList<VendedorComissao> vendedores;
    
    
    // Métodos

    public Departamento(String nome) {
        this.nome = nome;
        this.vendedores = new ArrayList();
    }    
    public void adicionaVendedor(VendedorComissao vendedor){
        
        this.vendedores.add(vendedor);
        
    }
    
    public Integer getQuantidadeVendedores(){
        return vendedores.size();
    }
    
    
    
   
    public Double getTotalSalario(){
        
        Double total = 0.0;
        
        for (VendedorComissao vendedor : vendedores) {
            
            if(vendedor instanceof VendedorComissaoMaisFixo){
                
                VendedorComissaoMaisFixo castMaisFixo = 
                        (VendedorComissaoMaisFixo) vendedor;
                
                ((VendedorComissaoMaisFixo) vendedor).calcularSalario();
                System.out.println(castMaisFixo.calcularSalario());
                total += castMaisFixo.calcularSalario();
            }
        }
        
        return total;
    }
    
    
    
    public Integer getQuantidadeVendedoresFixo(){
        
        Integer total =0;
        
        for (VendedorComissao vendedor : vendedores) {
            
            
            if(vendedor instanceof VendedorComissaoMaisFixo){
                
                total ++;
            }
        }
        
        return total;
    }
}
