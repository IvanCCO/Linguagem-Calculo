/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.heranca.aula.consultoria;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        
    Consultoria consultoria = new Consultoria("Papagaio", 2);
    Desenvolvedor desenvolvedor = new Desenvolvedor("Joao", 10, 10.0);
    Desenvolvedor desenvolvedor1 = new Desenvolvedor("Gabriel", 10, 10.0);
    DesenvolvedorMobile desenvolvedorMobile = new DesenvolvedorMobile(8, 10.0, "Ivan", 5, 5.0);
    
    consultoria.contratar(desenvolvedor);
    consultoria.contratar(desenvolvedorMobile);
    
    System.out.println(consultoria.getQuantidadeDesenvolvedoresMobile());
//    System.out.println(consultoria.buscarDesenvolvedorPorNome("Ivan").toString());
    }
    
    
}
