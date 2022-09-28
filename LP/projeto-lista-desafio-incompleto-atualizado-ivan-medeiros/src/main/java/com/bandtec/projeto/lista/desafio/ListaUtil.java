package com.bandtec.projeto.lista.desafio;

import java.util.List;
import java.util.ArrayList;

public class ListaUtil {

  private List<Integer> inteiros;

  public ListaUtil() {
    this.inteiros = new ArrayList<>();
  }

  public void add(Integer valor) {
    
    if(valor != null){
    this.inteiros.add(valor);    
    }
    
      
  }

  public void remove(Integer valor) {
      
   this.inteiros.remove(valor);
  }

  public Integer count() {
    
    return this.inteiros.size();
  }

  public Integer countPares() {
    
      Integer pares = 0;
      
      for (Integer inteiro : inteiros) {
          if(inteiro % 2 == 0){
              pares++;
          }
      }
      return pares;
  }

  public Integer countImpares() {
    
      Integer impares = 0;
      
      for (Integer inteiro : inteiros) {
         if(inteiro % 2 != 0){
              impares++;
          }
      }
      return impares;
  }

  public Integer somar() {
    Integer total = 0;
      for (Integer inteiro : inteiros) {
          total += inteiro;
      }
      return total;
  }

  public Integer getMaior() {
      
      Integer maior = 0;
      Boolean isPrimeiroNumero = true;
      
      
      for (Integer inteiro : inteiros) {
          
          if(isPrimeiroNumero){
              maior = inteiro;
              isPrimeiroNumero = false;
          }
          if(maior < inteiro){
              maior = inteiro;
          }
      }
      
      
      return maior;
  }

  public Integer getMenor() {
     
      Integer menor = 0;
      Boolean isPrimeiroNumero = true;
      
      
      for (Integer inteiro : inteiros) {
          
          if(isPrimeiroNumero){
              menor = inteiro;
              isPrimeiroNumero = false;
          }
          if(menor > inteiro){
              menor = inteiro;
          }
      }
      
      
      return menor;
  }

  public Boolean hasDuplicidade() {
      
      
      for (Integer inteiro : inteiros) {
          int count = 0;
          for (Integer inteiro1 : inteiros) {
             
              if(inteiro.equals(inteiro1)){
                  count++;
              }
              
              if(count >= 2){
                  return true;
              }
          }
      }
      
      return false;
    
  }
}
