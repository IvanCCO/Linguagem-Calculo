package com.mycompany.lista_1;

import java.util.Scanner;

public class CalculoMedia {
    
    public static void main(String[] args) {
        
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = pergunta.nextLine();
        System.out.println("Informe a primeira nota");
        double notaUm = pergunta.nextDouble();
        System.out.println("ótimo! Agora informe a segunda nota");
        double notaDois = pergunta.nextDouble();
        double media = (notaUm + notaDois) / 2;
        System.out.printf("Olá %s.Sua média foi de %.1f %n", nome, media);
    }
}
