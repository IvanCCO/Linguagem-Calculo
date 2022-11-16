/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaclasseabstrata.exercicio2;

/**
 *
 * @author olivers
 */
public abstract class Figura {
  
    
    
    private String cor;
    private Integer espessura;

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }
   
    
    
    public abstract Double calculaArea();
    
    @Override
    public String toString(){
        return "Cor: " + this.cor + "\n Espessura: " + this.espessura;
    }
    
    
    
    
}
