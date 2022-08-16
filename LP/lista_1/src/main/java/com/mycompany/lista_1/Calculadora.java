
package com.mycompany.lista_1;

import java.util.Scanner;


public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite um número");
        double x = pergunta.nextDouble();
        System.out.println("Digite outro");
        double y = pergunta.nextDouble();
        double mult, div, soma, sub;
        mult = x * y;
        div = x / y;
        sub = x - y;
        soma = x + y;
        
        System.out.println("Resultado da Soma: \n" + soma);
        System.out.println("Resultado da subtração: \n" + sub);
        System.out.println("Resultado da multiplicação: \n" + mult);
        System.out.printf("Resultado da divisão: \n %.1f %n", div);
        
    }
}
