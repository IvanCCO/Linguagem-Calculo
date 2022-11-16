/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaclasseabstrata.exercicio2;

/**
 *
 * @author olivers
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Quadrado quadrado1 = new Quadrado(2.0, "Vermelho", 1);
        Quadrado quadrado2 = new Quadrado(3.0, "Preto", 1);
        
        Retangulo ret = new Retangulo(2.5, 3.5, "Vermelho", 2);
        
        Triangulo tri = new Triangulo(4.2, 2.3, "Verde",  4);
        
        Circulo cir = new Circulo(5.0, "Laranja", 3);
        
        
        Imagem img = new Imagem();
        
        img.adicionarFigura(cir);
        img.adicionarFigura(tri);
        img.adicionarFigura(quadrado1);
        img.adicionarFigura(quadrado2);
        img.adicionarFigura(ret);
        
        String corte = "----".repeat(30);
        
        img.exibeFIguraAreaMaior();
        System.out.println(corte);
        img.exibeFiguras();
        System.out.println(corte);
        
        img.exibeQuadrado();
        System.out.println(corte);
        
        img.exibeSomaArea();
        System.out.println(corte);
        
        
    }
    
}
