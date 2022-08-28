/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_3.teste.peso;

public class CalcPeso {
    
    void calculaPesoIdeal(String sexo, Double altura){
        
        Double peso;
        
        if(sexo.equals("M")){
            
            peso = (72.7 * altura) - 58;
            
        }else{
            
            peso = (62.1 * altura) - 44.7;
        }
        
        System.out.printf("O seu peso ideal é de %.2f \n", peso);
    }
}
