
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_4.maria;

/**
 *
 * @author ivanm
 */
public class Bolo {

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    private String sabor;
    private Double valor;
    private Integer quantidadeVendida = 0;

    public void comprarBolo(Integer qtd) {

        if (isQuantidade(qtd)) {
            this.quantidadeVendida += qtd;
        } else {

            if (qtd < 0) {
                System.out.println("Quantidade inválida");
            } else {
                System.out.println("Seu pedido ultrapassou nosso limite diário(100) para esse bolo.");
            }

        }
    }

    public Boolean isQuantidade(Integer qtd) {
        if (this.quantidadeVendida > 100 || this.quantidadeVendida + qtd > 100) {
            return false;
        }
        return qtd > 0 && qtd <= 100;
    }

    public void exibirRelatorio() {

        Double total = this.valor * this.quantidadeVendida;

        System.out.println(String.format("O bolo do sabor %s, foi comprado %d vezes hoje, totalizando R$%.2f", this.sabor, this.quantidadeVendida, total));

    }

}
