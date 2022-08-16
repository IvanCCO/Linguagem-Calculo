package com.mycompany.lista_1;

import java.util.Scanner;

public class CadastroUsuario {
    
    public static void main(String[] args) {
        
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite seu Login");
        String login = pergunta.nextLine();
        System.out.println("Digite sua senha");
        String senha = pergunta.nextLine();
        System.out.println("Quantas vezes pode errar a senha?");
        int PassError = pergunta.nextInt();
        String frase = String.format("Seu login é %s e sua senha é %s. Você tem"
                + " %d tentativas antes de ser bloqueado", login, senha, PassError);
        System.out.println(frase);
        
    }
}
