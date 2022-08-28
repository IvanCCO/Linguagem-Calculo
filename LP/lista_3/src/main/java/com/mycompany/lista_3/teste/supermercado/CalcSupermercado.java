
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
        
        String linha = "-".repeat(50);
        
        String frase = String.format( "%s\nValor do produto: R$%.2f \nQuantidade: %d \n%s\n"
                + "Valor com desconto: R$%.2f \n ", linha, valor, qtd, linha, total);
        
        return frase;
    }
}
    


