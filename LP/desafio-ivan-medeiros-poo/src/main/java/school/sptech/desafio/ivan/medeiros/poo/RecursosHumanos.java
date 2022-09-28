package school.sptech.desafio.ivan.medeiros.poo;

public class RecursosHumanos {
    
    private Integer quantidadePromovidos=0, quantidadeReajustes=0;

    public Integer getQuantidadePromovidos() {
        return quantidadePromovidos;
    }

    public void setQuantidadePromovidos(Integer quantidadePromovidos) {
        this.quantidadePromovidos = quantidadePromovidos;
    }

    public Integer getQuantidadeReajustes() {
        return this.quantidadeReajustes;
    }

    public void setQuantidadeReajustes(Integer quantidadeReajustes) {
        this.quantidadeReajustes = quantidadeReajustes;
    }
    

    public Double reajustarSalario(Colaborador pessoa, Double porcentagem){
      
      if(pessoa != null ){
          
      
      if(porcentagem == null || porcentagem < 0){
          System.out.println("Valor nulo");
          
      }else{
      Double salario  = pessoa.getSalario();
      porcentagem /= 100;
      salario = salario + (salario * porcentagem);
      
      pessoa.setSalario(salario);
      
      this.quantidadeReajustes ++;
      }
      }
        
      return 0.0;
    } 
    
    public Double promoverColaborador(Colaborador pessoa, String novoCargo, Double novoSalario){
        
        if(isNadaNulo(pessoa, novoCargo)){    
            if(isValidarSalario(pessoa, novoSalario) && novoSalario != null){
            pessoa.setSalario(novoSalario);
            pessoa.setCargo(novoCargo);
            this.quantidadePromovidos++;
        }
    }
        
        
        return novoSalario;
    }
    
    public Boolean isValidarSalario(Colaborador pessoa, Double novoSalario){
        
       
        return pessoa != null && pessoa.getSalario() > 0 && novoSalario != null && novoSalario > pessoa.getSalario();
           
       
          
       
    }
    
    public Boolean isNadaNulo(Colaborador pessoa, String novoCargo){
        return pessoa != null && pessoa.getNome() != null && pessoa.getSalario() != null && pessoa.getCargo() != null && novoCargo != null;
    }
    
}


