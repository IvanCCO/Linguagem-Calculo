package com.mycompany.lista_1;

import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {
        
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Qual o seu nome?\n");
        
        String nome = pergunta.nextLine();
        System.out.println("Olá " + nome + "! Qual o ano de seu nascimento?");
        int idade = pergunta.nextInt();
        int resultado = 2030 - idade;
        String frase = String.format("Em 2030 você terá %d", resultado);
        System.out.println(frase);
        
    }
}
