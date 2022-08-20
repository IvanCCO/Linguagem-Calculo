package com.mycompany.lista_2;

import java.util.Scanner;

public class Pizza {
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        Integer mussa=0, cala=0, queijo=0;
        String sabor;
        
        for(int i=0; i<10; i++){
         
            while (true){
                
                System.out.println("Vote em um sabor de pizza");
                System.out.println("[5] Mussarela \n [25] Calabresa \n [50] Quatro Quejos");
                int voto = in.nextInt();
                
                if(voto == 5){
                    mussa++;
                    break;
                }else if(voto == 25){
                    cala++;
                    break;
                }else if(voto == 50){
                    queijo++;
                    break;
                }else{
                    System.out.println("Voto inválido");
                }
            }
            
            System.out.println("Voto computado");
        }
        
        System.out.println("Quantidade de votos: \n Mussarela: "+ mussa + "\n Calabresa: " + cala + "\n Quatro Queijos: "+ queijo);
        
        if(mussa >= cala && mussa >= queijo){
            sabor = "Mussarela";
        }else if(cala >= mussa && cala >= queijo){
            sabor = "Calabresa";
        }else{
            sabor = "Quatro Queijos";
        }
        
        System.out.println("O sabor favorito é: "+sabor);
        
    }
}
