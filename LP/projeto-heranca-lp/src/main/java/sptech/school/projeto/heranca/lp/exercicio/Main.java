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
        
        
        VendedorComissaoMaisFixo vendedorFixo = new VendedorComissaoMaisFixo(1200.00, 1, "Joao", 3500.00, 10.0);
        
        System.out.println(vendedorFixo.calcularSalario());
        
    }
    
}
