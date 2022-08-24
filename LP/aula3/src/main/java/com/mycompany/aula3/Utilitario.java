package com.mycompany.aula3;

import java.util.Scanner;

public class Utilitario {
    
    void exibirLinha(){
        
        /* Assinatura do método é composta por:
            - tipo de retorno
            - nome dp método
            - parâmetros -> argumento
        
            Void = método não possui retorno
        */
        
        System.out.println("-".repeat((30))); 
    }
    
    
    void exibirNome(String nome){
        
        System.out.println(String.format("**** %s ****", nome));
        
    }
    
    void exibirNomeComLinha(String nome){
        
         Scanner in = new Scanner(System.in);
         
         System.out.println("To na função");
         
         String ihul = in.nextLine();
         
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }
    
}
