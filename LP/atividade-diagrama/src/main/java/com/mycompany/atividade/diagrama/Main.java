/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.diagrama;

import java.util.ArrayList;

/**
 *
 * @author ivanm
 */
public class Main {
 
    public static void main(String[] args) {
        
        
        // Diagrama 1  -- ^v^
        
        
//        Carrinho carrinho = new Carrinho("Joao");
//        
//        Produto produto1 = new Produto("Carro", "Automovel", 1245.00);
//        Produto produto2 = new Produto("Vassoura", "Doméstico", 120.0);
//        Produto produto3 = new Produto("Mouse", "Eletronico", 23.00);
//        Produto produto4 = new Produto("Teclado", "Eletronico", 25.00);
//        
//        carrinho.adicionar(produto1);
//        carrinho.adicionar(produto2);
//        carrinho.adicionar(produto3);
//        carrinho.adicionar(produto4);
//        
//        System.out.println(carrinho.getPorNome("Mouse").toString());
//        
//        System.out.println(carrinho.getValorTotal());
    

        // Diagrama 2 -- ^v^
        
        Faculdade faculdade = new Faculdade("SPTECH");
        
        Aluno aluno1 = new Aluno("45234324", "Gui", 1);
        Aluno aluno2 = new Aluno("32324324", "Ivan", 1);
        Aluno aluno3 = new Aluno("55234324", "Duda", 3);
        Aluno aluno4 = new Aluno("65234324", "Nene", 2);
        
        faculdade.matricularAluno(aluno1);
        faculdade.matricularAluno(aluno2);
        faculdade.matricularAluno(aluno3);
        faculdade.matricularAluno(aluno4);
        
        faculdade.cancelarMatricula("32324324");
        
        faculdade.exibirAlunosPorSemestre(1);
        
        faculdade.exibirCancelados();
        

    }
    
}
