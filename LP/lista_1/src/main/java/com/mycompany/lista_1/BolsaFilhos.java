
package com.mycompany.lista_1;

import java.util.Scanner;

public class BolsaFilhos {
    
    public static void main(String[] args) {
        
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Quantos filhos possui? \n");
        System.out.println("De 0 a 3");
        int filhosUm = pergunta.nextInt();
        System.out.println("De 4 a 16");
        int filhosDois = pergunta.nextInt();
        System.out.println("De 17 a 18");
        int filhosTres = pergunta.nextInt();
        double totalMoney = (filhosUm * 25.12) + (filhosDois * 15.88) + (filhosTres * 12.44);
        int totalFilhos = filhosUm + filhosDois + filhosTres;
        String frase = String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", totalFilhos, totalMoney);
        System.out.println(frase);
        
        
    }
}
