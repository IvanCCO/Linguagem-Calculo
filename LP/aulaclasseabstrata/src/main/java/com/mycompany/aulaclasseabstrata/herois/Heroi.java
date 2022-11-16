/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaclasseabstrata.herois;

/**
 *
 * @author olivers
 */
public class Heroi extends Personagem{

    public Heroi(String codinome, String nome) {
        super(codinome, nome);
    }
    
    
    @Override
    public Double getForcaTotal() {
        
        Double total = 0.0;
        
        for (Object poderes : getPoderes()) {
                    
            if(poderes instanceof Heroi){
                
                     
            }
            
        }
        
        return total * 1.15;
        
    }
    
    
}
