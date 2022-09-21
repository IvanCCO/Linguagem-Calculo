/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech.aulapoo02;

/**
 *
 * @author aluno
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        
        List <Integer> numeracao = new ArrayList();
        
        
        
        String strTeste = in.nextLine();
        
        Integer numTeste = Integer.parseInt(strTeste);
        
        
        for(int j=0; j<numTeste; j++){
            
          
            String palavra = in.next();
            char arrLetraPalavra[] = palavra.toCharArray();
            Integer posicao = in.nextInt();
            
            for(int k=0; k<arrLetraPalavra.length; k++){
                
                for(int l=0; l<alphabet.length; l++){
                 
                    if(arrLetraPalavra[k] == alphabet[l]){
                        
                        numeracao.add(l);
                    }

                }
            }
            
            Integer numeros[] = new Integer[numeracao.size()];
            for(int m=0; m<numeracao.size(); m++){
                
                numeros[m] = numeracao.get(m) - posicao;
                
                if(numeros[m] < 0){
                    numeros[m] += 26;
                }
                
                System.out.print(alphabet[numeros[m]]);
            }
                System.out.println();
            numeracao.clear();
            
            
            
            
            
        }
        
    }
}

