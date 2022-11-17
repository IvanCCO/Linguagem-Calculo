/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaclasseabstrata.exercicio2;

import java.util.ArrayList;

/**
 *
 * @author olivers
 */
public class Imagem {
    
    private ArrayList<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList();
    }
    
    
    public void adicionarFigura(Figura f){
        
        figuras.add(f);
    }
    
    
    public void exibeFiguras(){
        
        for (Figura figura : figuras) {
            System.out.println(figura.toString());
        }
    }
    
    public void exibeSomaArea(){
        
        Double total = 0.0;
        
        for (Figura figura : figuras) {
            total += figura.calculaArea();
        }
        
        System.out.println(total);
    }
    
    
    public void exibeFIguraAreaMaior(){
        
        Double maior = 0.0;
        boolean isPrimeiroObj = true;
        
        for (Figura figura : figuras) {
            
            if(isPrimeiroObj){
                maior = figura.calculaArea();
                isPrimeiroObj = false;
            }
            
            if(maior < figura.calculaArea()){
                maior = figura.calculaArea();
            }
            
        }
        
        System.out.println("A maior área é " + maior);
        
    }
    
    
    public void exibeQuadrado(){
        
        for (Figura figura : figuras) {
            
            if(figura instanceof Quadrado){
                System.out.println(figura.toString());
            }
            
        }
    }
    
}
