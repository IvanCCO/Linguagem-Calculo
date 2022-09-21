/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech.aulapoo02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ExemploLista {
    public static void main(String[] args) {
     
//        List listaLoka = new ArrayList();
//        
//        listaLoka.add("Diego");
//        listaLoka.add(29);
//        listaLoka.add(true);
//        listaLoka.add(1.83);
//        
//        for(int i=0; i<listaLoka.size(); i++){
//            System.out.println(listaLoka.get(i));
//        }
    
    // Tipo genérico ou generic type
        List <String> listaNome = new ArrayList();
        
        // adiciona 
        listaNome.add("Ajuda");
        listaNome.add("Rayssa");
        
        for(int i = 0; i<listaNome.size(); i++){
            System.out.println("Nomes: " + listaNome.get(i));
        }
        
        // Sobreescrve
        listaNome.set(1, "Joao");
       
        for(int i = 0; i<listaNome.size(); i++){
            System.out.println("Nomes: " + listaNome.get(i));
        }
    
        // Limpa
        listaNome.clear();
    }
}
