
package com.mycompany.lista_3.teste.classe;

import java.util.Scanner;


public class ClassesSociais {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Qual sua renda mensal?");
        double renda = in.nextDouble();
        
        ContaClasse conta = new ContaClasse();
        
        double salariosMinimos = conta.qntSalario(renda);
        
        String classe = conta.classe(salariosMinimos);
        
        System.out.println(classe);
        
    }
}
