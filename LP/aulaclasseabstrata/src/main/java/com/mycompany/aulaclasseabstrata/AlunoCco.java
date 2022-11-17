/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaclasseabstrata;

/**
 *
 * @author olivers
 */
public class AlunoCco extends Aluno{
    
    private Double notaIntegrada; 
    private Double notaManografia; 

    public AlunoCco(Double notaIntegrada, Double notaManografia, String ra, String nome) {
        super(ra, nome);
        this.notaIntegrada = notaIntegrada;
        this.notaManografia = notaManografia;
    }

    @Override
    public Double getMedia() {
       
        return (notaIntegrada + notaManografia) / 2;
        
    }
   
    
}
