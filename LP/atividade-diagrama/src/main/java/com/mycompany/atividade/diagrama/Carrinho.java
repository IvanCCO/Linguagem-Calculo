/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.diagrama;

import java.util.ArrayList;

/**
 *
 * @author ivanm
 */
public class Carrinho {
    
    private String cliente;
    private ArrayList<Produto> produtos;
    
   
    // Metodos

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList();
    }
    
    public Integer getQuantidade(){
        return produtos.size();
    }
    
    public Integer getQuantidadePorCategoria(String nome){
        
        int count = 0;
        
        for (Produto produto : produtos) {
            
            if(produto.getCategoria().equals(nome)){
                count++;
            }
        }
        
        return count;
    }
    
    public Boolean existsPorNome(String nome){
        
        for (Produto produto : produtos) {
                
            if(produto.getNome().equals("Carro")){
                return true;
            }
        }
        
        return false;
    }
    
    public void adicionar(Produto produto){
        
        produtos.add(produto);
    }
    
    public void limpar(){
        this.produtos.clear();
    }
    
    public void removerPorNome(String nome){
        
        for(int i = 0; i<produtos.size(); i++){
            
            Produto produto = produtos.get(i);
            if(produto.getNome().equals(nome)){
                produtos.remove(produto);
            }   
        }
    }
    
    public Produto getPorNome(String nome){
        
        for (Produto produto : produtos) {
            
            if(produto.getNome().equals(nome)){  
               
                return produto;
                
            }
        }
        
        
        return null;
    }
    
    public Double getValorTotal(){
        
        Double valorTotal = 0.0;
        
        for (Produto produto : produtos) {
            
            valorTotal += produto.getPreco();
        }
        
        return valorTotal;
    }       
        
}
