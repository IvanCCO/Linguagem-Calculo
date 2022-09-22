/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_4.transportadora;

import java.util.Scanner;

/**
 *
 * @author ivanm
 */
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Faça sua encomenda");
        

        char[] tamanho = {'P', 'M', 'G'};
        
        char tamanhoPergunta= 'q';
        
        while(tamanhoPergunta != tamanho[0] && tamanhoPergunta != tamanho[1]&& tamanhoPergunta != tamanho[2]){
            
            System.out.println("Qual o tamanho da encomenda?\n P - Pequeno\n M - Médio\n G - Grande");
            tamanhoPergunta = in.next().charAt(0);
          
            for(int i=0; i<tamanho.length; i++){
               
                if(tamanho[i] == tamanhoPergunta){
                    System.out.println("Tamanho cadastrado");
                    break;
                }
                
            }
            
        }
        
        System.out.println("Digite o endereço");
        String enderecoRemetente = in.next();
        System.out.println("Digite o destinatário");
        String enderecoDestinatario = in.next();
        System.out.println("Digite a distância");
        Double distancia = in.nextDouble();
        System.out.println("Qual é o valor da encomenda?");
        Double valorEncomenda = in.nextDouble();
        
        Encomenda encomenda = new Encomenda(tamanhoPergunta, enderecoRemetente, enderecoDestinatario, distancia, valorEncomenda);
        
        encomenda.emitirEtiqueta();
        
        
        
       
    }
}
