/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaclasseabstrata.uml;

/**
 *
 * @author olivers
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Vendedor vendedor1 = new Vendedor(20.50, 21.67, "9328932", "Ivan Freire");
        Horista horista1 = new Horista(12, 19.23, "323232", "Juliio");
        Vendedor vendedor2 = new Vendedor(32.22, 9.21, "3232", "Juliana");
        
        
        Empresa emp = new Empresa("Rockstar");
        
        emp.adicionarFuncionario(horista1);
        emp.adicionarFuncionario(vendedor1);
        emp.adicionarFuncionario(vendedor2);
        
        emp.exibeTodos();
        emp.exibeTotalSalario();
        
        
        
    }
    
}
