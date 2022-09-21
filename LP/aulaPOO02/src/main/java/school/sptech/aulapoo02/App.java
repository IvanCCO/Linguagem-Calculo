/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech.aulapoo02;

/**
 *
 * @author aluno
 */
public class App {
    public static void main(String[] args) {
        
        String[] arrNomes = new String[3];
        String[] nomes = {"Joao", "Pedro", "vitoria"};
        
        for(int i = 0; i<arrNomes.length; i++){
            arrNomes[i] = nomes[i];
            System.out.println(arrNomes[i]);
        }
    }
}
