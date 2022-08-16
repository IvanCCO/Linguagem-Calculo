
package com.mycompany.lista_1;

import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
        
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Qual o valor do produto?");
        float valor = pergunta.nextFloat();
        System.out.println("Qual foi a Quantidade Comprada.");
        float quantidade = pergunta.nextFloat();
        System.out.println("Quanto pagou?");
        float pagar = pergunta.nextFloat();
        float troco = pagar - (valor * quantidade);
        if(troco >= 0){
            System.out.println("Seu troco será de " + troco + "Reais");
        }else{
            System.out.println("Você nâo tem dinheiro suficiente para efetuar a compra");
        }
        
    }
}
