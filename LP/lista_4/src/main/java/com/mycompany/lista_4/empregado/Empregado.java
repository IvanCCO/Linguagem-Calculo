/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_4.empregado;

/**
 *
 * @author ivanm
 */
public final class Empregado {
    private String nome;
    private String cargo;
    private Double salario;

    public Empregado(String nome, String cargo, Double salario) {
        
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
  
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Boolean isSalarioValido(){

        return salario >= 0;

    }
        
    public Double reajustarSalario(Double porcReajuste){
        
        porcReajuste /= 100;
        
        return (this.salario * porcReajuste);
        
    }
}
