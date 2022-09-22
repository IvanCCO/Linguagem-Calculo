/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_4.transportadora;

/**
 *tamanho (P, M ou G)
enderecoRemetente (Ex: Rua Santos da Glória, 18) 
enderecoDestinatario (Ex: Av Dr. Pedro, 255) 
distancia(Ex: 42.2) 
valorEncomenda (Ex: 87.50)
 * @author ivanm
 */
public class Encomenda {
    private char tamanho;
    private String enderecoRemetente, enderecoDestinatario;
    private Double distancia, valorEncomenda;
    

    public Encomenda(char tamanho, String enderecoRemetente, String enderecoDestinatario, Double distancia, Double valorEncomenda) {
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }

    

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorEncomenda() {
        return valorEncomenda;
    }

    public void setValorEncomenda(Double valorEncomenda) {
        this.valorEncomenda = valorEncomenda;
    }
    
    
    public Double calcularFrete(){
        
        Double valor = this.valorEncomenda;
        Double frete = null;
        
        if(this.tamanho == 'P'){
            frete = valor * 0.1;
        }else if(this.tamanho == 'M'){
            frete = valor * 0.3;
        }else if(this.tamanho == 'G'){
            frete = valor * 0.5;
        }
        
        if(this.distancia <= 50){
            frete += 3.0;   
        }else if (this.distancia <= 201){
            frete += 5.0;
        }else{
            frete += 7;
        }
   
        return frete;
    }
    
    public void emitirEtiqueta(){
        
        System.out.println("***ETIQUETA PARA ENVIO***");
        System.out.println("Endereço do remetente: " + this.enderecoRemetente);
        System.out.println("Endereço do Destinatário " + this.enderecoDestinatario);
        if(this.tamanho == 'P'){
            System.out.println("Tamanho: Pequeno");
        }else if(this.tamanho == 'M'){
            System.out.println("Tamanho: Médio");
        }else{
            System.out.println("Tamanho: Grande");
        }
        System.out.println("================");
        System.out.println("Valor encomenda: R$ " + this.valorEncomenda);
        Double frete = calcularFrete();
        System.out.println("Valor frete: " + frete);
        
        Double total = this.valorEncomenda + frete;
        System.out.println("Valor total: " + total);
        
    }
    
}
