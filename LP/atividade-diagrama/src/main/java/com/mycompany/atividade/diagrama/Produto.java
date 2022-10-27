/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.diagrama;

/**
 *
 * @author ivanm
 */
public class Produto {
    
    private String nome;
    private String categoria;
    private Double preco;

    public Produto(String nome, String categoria, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        if(isProdutoValido(preco)){     
        this.preco = preco;    
        }
        else{
            System.out.println("Preço Inválido");
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean isProdutoValido(Double preco){ 
        return preco > 0;
    }
    
    @Override
    public String toString(){
        
        return "Nome: " + this.nome + "\nCategoria: " + this.categoria + "\nPreço: " + this.preco;
    }
    
    public String toString(Produto produto){
        
        return "Nome: " + this.nome + "\nCategoria: " + this.categoria + "\nPreço: " + this.preco;
    }
    
    
 
    
}
