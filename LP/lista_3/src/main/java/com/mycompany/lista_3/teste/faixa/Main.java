package com.mycompany.lista_3.teste.faixa;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite sua idade");
        Integer idade = in.nextInt();
        
        CalcIdade calc = new CalcIdade();
        
        calc.classificaIdade(idade);
        
    }
    
    
}
