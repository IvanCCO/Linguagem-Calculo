/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaclasseabstrata.exercicio2;

/**
 *
 * @author olivers
 */
public class Triangulo extends Figura {
    
    
    private Double base;
    private Double altura; 

    public Triangulo(Double base, Double altura, String cor, Integer espessura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }
    
    

    @Override
    public Double calculaArea() {
        return this.base * this.altura / 2;
    }
    
    
    
}
