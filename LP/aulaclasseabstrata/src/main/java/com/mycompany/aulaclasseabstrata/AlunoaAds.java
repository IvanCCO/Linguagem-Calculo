/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaclasseabstrata;

/**
 *
 * @author olivers
 */
public class AlunoaAds extends Aluno{

    private Double notaContinuada;
    private Double notaIntegrada;

    public AlunoaAds(Double notaContinuada, Double notaIntegrada, String ra, String nome) {
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }

    @Override
    public Double getMedia() {
        
        return (notaContinuada + notaIntegrada) / 2;
    }
    
    
    
    
}
