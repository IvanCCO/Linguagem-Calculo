package com.sptech.atividade.com.testes;

public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos=0;
    private Integer quantidadeDeHoraExtra=0;

    public Hospital(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }
    
    
    public void realizarPagamento(Medico medico, Double valorPago){
        
        if(isMedicoValido(medico) && isValorValido(valorPago)){
            
            Double salario = medico.getSalario();
            salario += valorPago;
            medico.setSalario(salario);
            this.quantidadeDePagamentos ++;
        }
        
    }
    
    public void realizarPagamento(Medico medico, Double valorPago, Double horaExtra){
        
        if(isMedicoValido(medico) && isValorValido(valorPago)){
            
            if(horaExtra != null && horaExtra > 0){
                
                Double salario = medico.getSalario();
                salario += valorPago;
                salario += horaExtra;
                medico.setSalario(salario);
                this.quantidadeDeHoraExtra ++;
                this.quantidadeDePagamentos ++;
            }
        }
    }
 
    public Boolean isValorValido(Double valorPago){
        return valorPago != null && valorPago > 0;
    }
    
    public Boolean isMedicoValido(Medico medico){
        
        return medico != null && medico.getAtivo() == true;
        
    }
 
    public void desligarMedico(Medico medico){
        
        if(isMedicoValido(medico)){
            medico.setAtivo(false);
        }
    }
}
