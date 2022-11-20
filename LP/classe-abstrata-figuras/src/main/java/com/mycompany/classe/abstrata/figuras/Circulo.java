/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classe.abstrata.figuras;

/**
 *
 * @author ivanm
 */
public class Circulo extends Figura {
    
    private Double raio;

    public Circulo(Double raio, String cor, Integer espessura) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calculaArea() {
        Double pi = Math.PI;
        return pi * (raio * raio);
    }
    
}
