/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaclasseabstrata;

/**
 *
 * @author olivers
 */
public abstract class Aluno {
    
	private String ra;
	private String nome;

	public Aluno(String ra, String nome){
            
           this.ra = ra;
           this.nome = nome;
            
        }
        
        public abstract Double getMedia();
        
        @Override
        public String toString(){
            return "RA: " + this.ra + "\nNome: " + this.nome;
        }
        
}
