package school.sptech.desafio.ivan.medeiros.poo;

public class RecursosHumanos {
    
    private Integer quantidadePromovidos=0, quantidadeReajustes=0;
    

    public Double reajustarSalario(Colaborador pessoa, Double porcentagem){
        
      Double salario  = pessoa.getSalario();
      porcentagem /= 100;
      salario = salario + (salario * porcentagem);
      
      pessoa.setSalario(salario);
        
      return salario;
    } 
    
    public Double promoverColaborador(Colaborador pessoa, String novoCargo, Double novoSalario){
        
        pessoa.setCargo(novoCargo);
        if(validarSalario(pessoa, novoSalario)){
            
            pessoa.setSalario(novoSalario);
        }
        
        return novoSalario;
    }
    
    public Boolean validarSalario(Colaborador pessoa, Double novoSalario){
        
        Double salarioAntigo = pessoa.getSalario();
     
        return novoSalario > salarioAntigo;
    }
    
}


