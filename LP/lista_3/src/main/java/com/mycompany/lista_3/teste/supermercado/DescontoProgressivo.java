/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_3.teste.supermercado;

import java.util.Scanner;

public class DescontoProgressivo {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Bem vindo ao Sistema de desconto progressivo!");
        
        System.out.println("Qual o valor unitário do produto?");
        Double valorUnitario = in.nextDouble();
        System.out.println("Quantas Unidades você comprou?");
        Integer qtdProduto = in.nextInt();
        
        CalcSupermercado calc = new CalcSupermercado();
        
        Double total = calc.calcularDesconto(valorUnitario, qtdProduto);
        
       String notaFiscal = calc.exibirNotaFiscal(valorUnitario, qtdProduto, total);
       
        System.out.println(notaFiscal);
               
        
    }
}
