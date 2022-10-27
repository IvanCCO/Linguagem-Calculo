
package com.mycompany.lista_3.teste.classe;


public class ContaClasse {
    
    double qntSalario(double renda){
        
        double salario = renda / 1045;
        
        return salario;
    }
    
    String classe(double salario){
        
        if(salario < 2){
            return "E";
        }else if(salario < 4){
            
            return "D";
        }else if(salario < 10){
            
            return "C";
        }else if(salario < 20){
            
            return "B";
        }else{
            return "A";
        }
    }
    
}


