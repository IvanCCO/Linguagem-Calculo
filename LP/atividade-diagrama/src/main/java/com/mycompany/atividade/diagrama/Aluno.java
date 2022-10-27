/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.diagrama;

/**
 *
 * @author ivanm
 */
public class Aluno {
 
    
    private String ra;
    private String nome;
    private Integer semestre;
    private boolean ativo = true;

    public Aluno(String ra, String nome, Integer semestre) {
        this.ra = ra;
        this.nome = nome;
        
        if(isSemestreValido(semestre))
        {
            this.semestre = semestre;
        }
        
    }
    
    
    private boolean isSemestreValido(Integer semestre){
 
        return semestre > 0;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    public String toString(){
        
        return "RA: " + this.ra + "\nNome: " + this.nome + "\nSemestre: " + this.semestre + "\nStatus: " + this.ativo;
    }
    
    
}
