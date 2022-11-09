/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.heranca.aula.consultoria;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Consultoria {
    
    private String nome;
    private Integer vagas;
    ArrayList<Desenvolvedor> desenvolvedores;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList();
    }
    
    
    
    // métodos
    
    public Boolean existePorNome(String nome){
        
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            
            if(desenvolvedor.nome.equals(nome))return true;
        }
        return false;
    }
    
    public void contratar(Desenvolvedor desenvolvedor){
        
        if(vagas > desenvolvedores.size()){
            desenvolvedores.add(desenvolvedor);
        }else{
            System.out.println("Sem vagas disponíveis");
        }
        
    }
    
    public Integer getQuantidadeDesenvolvedores(){
        
        return desenvolvedores.size();
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile(){
        
        int count = 0;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            
            if(desenvolvedor instanceof DesenvolvedorMobile){
                count++;
            }
           
        }
        return count;
    }
    
    public Double getTotalSalarios(){
        
        Double total = 0.0;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            
            if(desenvolvedor instanceof DesenvolvedorMobile){
                
                DesenvolvedorMobile castDesenvolvedorMobile = (DesenvolvedorMobile) desenvolvedor;
                
                ((DesenvolvedorMobile) desenvolvedor).getSalario();
                total+= castDesenvolvedorMobile.getSalario();
            }else{
                total += desenvolvedor.getSalario();
            }
        }
        
        return total;
    }
    
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome){
        
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if(desenvolvedor.nome.equals(nome)){
                return desenvolvedor;
            }
        }
        return null;
    }
    
    
    
}
