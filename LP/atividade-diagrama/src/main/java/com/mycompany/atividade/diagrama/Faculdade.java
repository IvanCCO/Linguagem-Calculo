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
public class Faculdade {
    
    private String nome;
    private ArrayList<Aluno> listaAlunos;
    
    String frase = "=".repeat(30);

    public Faculdade(String nome) {
        this.nome = nome;
        this.listaAlunos = new ArrayList();
    }
    
    
    public void matricularAluno(Aluno aluno){
        this.listaAlunos.add(aluno);
    }
    
    public void cancelarMatricula(String ra){
        
        for (Aluno listaAluno : listaAlunos) {
            
            if(listaAluno.getRa().equals(ra)){
                listaAluno.setAtivo(false);
            }
            
        }
    }
    
    public void exibirAlunos(){
        
        for (Aluno listaAluno : listaAlunos) {
            System.out.println(frase);
            System.out.println(listaAluno.toString());
        }
        
    }
    
    public void exibirAlunosPorSemestre(Integer semestre){
        
        for (Aluno listaAluno : listaAlunos) {
         
            if(listaAluno.getSemestre() == semestre){
                
                System.out.println(frase);
                System.out.println(listaAluno.toString());
                
            }
            
        }
    }
    
    public void exibirCancelados(){
        
        for (Aluno listaAluno : listaAlunos) {
            
            if(!listaAluno.isAtivo()){
                System.out.println(frase);
                System.out.println(listaAluno.toString());
            }
        }
        
    }
    
}
