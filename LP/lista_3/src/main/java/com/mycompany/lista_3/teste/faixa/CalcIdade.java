package com.mycompany.lista_3.teste.faixa;


public class CalcIdade {
    
    void classificaIdade (int idade){
        
        String palavra;
        
        if(idade <= 2){      
            palavra = "Bebê";
        }else if(idade <= 11){
            palavra = "Criança";
        }else if(idade <= 19){
            palavra = "Adolescente";
        }else if (idade <= 30){
            palavra = "Jovem";
        }else if(idade <= 60){
            palavra = "Adulto";
        }else{
            palavra = "Idoso";
        }
        
        
        System.out.println(palavra);
    }
}
