
package com.mycompany.lista_3.teste.supermercado;

public class CalcSupermercado {
 
    Double calcularDesconto(Double valor, Integer qtd){
        
        Double total;
        
        if(qtd == 1){
            
           total = (valor * qtd);
           total = total - (total * 0.1);
       
        }else if(qtd == 2){
            
            total = (valor * qtd);
           total = total - (total * 0.2);
        }else{
            total = (valor * qtd);
            total = total - (total * 0.3);
        }
        
        return total;
    }
        
    String exibirNotaFiscal(Double valor, Integer qtd, Double total){
        
        String linha = "-".repeat(20);
        
        String frase = String.format("Bem-vindo ao Sistema de desconto progressivo\n "
                    + "Digite o valor unitário do produto: \n %.2f \n Digite a quantidade: %d \n" + linha +
                "Valor do produto: %.2f \n ", args)
        
        return "dime";
    }
}
    


