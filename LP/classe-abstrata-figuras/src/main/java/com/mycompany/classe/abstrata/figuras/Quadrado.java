/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classe.abstrata.figuras;

/**
 *
 * @author ivanm
 */
public class Quadrado extends Figura{
    
    private Double lado;

    public Quadrado(Double lado, String cor, Integer espessura) {
        super(cor, espessura);
        this.lado = lado;
    }

    @Override
    public Double calculaArea() {
        return this.lado*this.lado;
    }
    
    @Override
    public String toString(){
        
        return "lado " + this.lado;
    }
}
