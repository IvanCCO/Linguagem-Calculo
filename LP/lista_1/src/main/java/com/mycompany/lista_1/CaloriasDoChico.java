
package com.mycompany.lista_1;

import java.util.Scanner;

public class CaloriasDoChico {
    
    public static void main(String[] args) {
        
        Scanner pergunta = new Scanner(System.in);
        
        System.out.println("Quanto tempo você passou aquecendo (em minutos)");
        int aquecimento = pergunta.nextInt();
        System.out.println("Quanto tempo de aeróbicos");
        int aerobico = pergunta.nextInt();
        System.out.println("Quanto tempo de musculação");
        int muscula = pergunta.nextInt();
        int pt = (aquecimento * 12) + (aerobico * 20) + (muscula * 25);
        int totalMinutos = aquecimento + aerobico + muscula;
        String frase = String.format("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", totalMinutos, pt);
        System.out.println(frase);
    }
}
