
package com.mycompany.lista_1;

import java.util.Scanner;

public class AjudandoChico {
    
    public static void main(String[] args) {
        
        double desconto, total, salario, vt;
        
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Qual o seu salário bruto?");
        salario = pergunta.nextDouble();
        System.out.println("Qual Valor da condução diária (só ida)");
        vt = pergunta.nextDouble();
        desconto = (salario * 0.1) + (salario * 0.2) + (vt * 44);
        total = salario - desconto;
        String frase = String.format("Seu salário bruto é R$%.2f, tem um "
                + "total de R$%.2f em descontos e receberá um líquido de R$%.2f", salario, desconto, total);
        
        if(total < 0){
            System.out.println("Você deve R$" + total*-1);
        }else{
            System.out.println(frase);
        }
        
        
        
    }
}
