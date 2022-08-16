package com.mycompany.lista_1;

import java.util.Scanner;

public class Elevador {
    
    public static void main(String[] args) {
        
    Scanner pergunta = new Scanner(System.in);
        System.out.println("Qual é o limite de peso do elevador?");
        float limitePeso = pergunta.nextFloat();
        System.out.println("Qual o limite de pessoas?");
        int limitePessoas = pergunta.nextInt();
        System.out.println("Qual o peso da primeira pessoa?");
        float pesoPrimeira = pergunta.nextFloat();
        System.out.println("Qual o peso da segunda pessoa?");
        float pesoSegunda = pergunta.nextFloat();
        System.out.println("Qual o peso da terceira pessoa?");
        float pesoTerceira = pergunta.nextFloat();
        float total = pesoPrimeira + pesoSegunda + pesoTerceira;
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + limitePessoas + " pessoas.\n" +
"O peso total no elevador é de " + total + ", sendo que ele suporta " + limitePeso);
        
     
    }
     
     
     
}
