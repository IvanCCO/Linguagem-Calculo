/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaclasseabstrata;

import java.util.ArrayList;

/**
 *
 * @author olivers
 */
public class Main {

    public static void main(String[] args) {
        
     
        AlunoaAds alunosAds = new AlunoaAds (9.1, 8.8,  "92912" , "Ivan Cheiro");
        
        AlunoCco alunoCco1 = new AlunoCco(8.9, 8.7, "0221021", "Julio freire");
        
        
        AlunoaAds alunoTeste = new AlunoaAds(9.7, 8.2, "02921", "Viviane teixiera");
        
        
        
        
        ArrayList<Aluno> alunos = new ArrayList();
        
       
        alunos.add(alunoTeste);
        alunos.add(alunoCco1);
        alunos.add(alunosAds);
        
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
        
    }
}
