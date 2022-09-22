/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_4.temperatura;

import java.util.Scanner;


/**
 *
 * @author aluno
 */
public class TesteTermometro {
    public static void main(String[] args) {
       
        
        Scanner in = new Scanner(System.in);
        
        Termometro term = new Termometro();

        System.out.println("A temperatura se inicia em 0 como default");
        while (true){
            
            System.out.println("1- Temperatura atual\n2- Aumentar temperatura\n3- Diminuir temperatura\n4- Sair");
            int resposta = in.nextInt();
            
            if(resposta == 4){
                break;
            }else{
                if(resposta == 1){
                
                System.out.println("Digite a temperatura");
                Double temperatura = in.nextDouble();
                term.setTemperaturaAtual(temperatura);
                System.out.println("A temperatura atual é de " + term.getTemperaturaAtual());
                
                }else if(resposta == 2){
                
                    System.out.println("O quanto deseja aumentar?");
                    Double aumento = in.nextDouble();
                    Double aumentaTemperatura = term.aumentaTemperatura(aumento);
                    System.out.println(String.format("A temperatura atual é de %.1f",aumentaTemperatura ));
                 
                }else if(resposta == 3){
                     System.out.println("O quanto deseja diminuir?");
                    Double diminui = in.nextDouble();
                    Double diminuiTemperatura = term.diminuiTemperatura(diminui);
                    System.out.println(String.format("A temperatura atual é de %.1f", diminuiTemperatura));
                }
                
     
            }
            
        }
        
        System.out.println("A temperatura atual é de " + term.getTemperaturaAtual());
        System.out.println("A temperatura máxima foi de " + term.getTemperaturaMax());
        System.out.println("A temperatura mínima foi de " + term.getTemperaturaMin());
        term.exibeFahrenheit();
        
    }
}
