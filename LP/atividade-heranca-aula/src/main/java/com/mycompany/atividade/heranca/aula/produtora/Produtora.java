/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.heranca.aula.produtora;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Produtora {
    
    private String nome;
    private Integer vagas;
    ArrayList<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList();
    }
    
    public Boolean existePorNome(String nome){
        
        return true;
    }
    
    public void contratar(Ator ator){
        atores.add(ator);
    }
    
    public Integer getQuantidadeAtor(){
        
        return atores.size();
    }
    
    public Integer getQuantidadeProtagonista(){
        
        Integer count = 0;
        
        
        for (Ator ator : atores) {
            if(ator instanceof Protagonista){
                
                count++;
            }
        }
        
        return count;
    }
    
    
}
