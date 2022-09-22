/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_4.temperatura;

/**
 *
 * @author aluno
 */
public class Termometro {
 
    private Double temperaturaMin,
            temperaturaAtual,
            temperaturaMax;

    public Termometro() {
        this.temperaturaMax = -999.0;
        this.temperaturaAtual = 0.0;
        this.temperaturaMin = 999.0;
        
    }

    public Double getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(Double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Double getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(Double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }
    
    
public Double aumentaTemperatura(Double aumento){
        
    Double temp = getTemperaturaAtual();
    
    temp += aumento;
    
    Double tempMax = getTemperaturaMax();
    Double tempMin = getTemperaturaMin();

    if(temp > tempMax){
        setTemperaturaMax(temp);
    }
    
    if(temp < tempMin){
        setTemperaturaMin(temp);
    }
    
    setTemperaturaAtual(temp);
    return temp;
    }

public Boolean isTemperaturaMaior(Double temperatura){
    Double tempMax = getTemperaturaMax();
    return temperatura > tempMax;
    }

//public Boolean isTemperaturaMenor(Double temperatura){
//    
//    Double tempMin = getTemperaturaMin();
//    return temperatura < tempMin;
//    }



public Double diminuiTemperatura(Double diminuir){
    
    Double temp = getTemperaturaAtual();
    
    temp -= diminuir;
    
    Double tempMin = getTemperaturaMin();
    
    Double tempMax = getTemperaturaMax();
    
     if(temp > tempMax){
        setTemperaturaMax(temp);
    }

    if(temp < tempMin){
        setTemperaturaMin(temp);
    }
    setTemperaturaAtual(temp);
    return temp;
}

public void exibeFahrenheit(){
    
   Double conversor = this.temperaturaAtual * 1.8 + 32;
   
    System.out.println(String.format("A temperatura em Fahrenheit é de %.0f", conversor));
}

}



