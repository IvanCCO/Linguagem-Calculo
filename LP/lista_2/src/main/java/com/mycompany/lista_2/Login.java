/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_2;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Faça seu login");
        String user, senha;
        boolean isSenhaCerta = true;
        do {
            System.out.println("Nome de Usuário: ");
            user = leitor.next();
            System.out.println("Senha: ");
            senha = leitor.next();
            if (!user.equals("admin" ) && !senha.equals("#SPtech2022")) {
                System.out.println("Senha/Usuário inválidos");
            } else {
                isSenhaCerta = false;
            }
        } while (isSenhaCerta);

        System.out.println("Login realizado com sucesso");
    }
}
