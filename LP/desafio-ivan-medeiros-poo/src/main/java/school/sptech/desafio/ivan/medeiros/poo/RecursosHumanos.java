package school.sptech.desafio.ivan.medeiros.poo;

public class RecursosHumanos {
    
    private Integer quantidadePromovidos=0, quantidadeReajustes=0;
    
    Colaborador colaborador = new Colaborador();
    
    
    public Double reajustarSalario(String nome, Double porcentagem){
        
       if (porcentagem >= 0 && (nome != null && porcentagem != null)){
//       nome = colaborador.getNome();
       Double salario = colaborador.getSalario();
       porcentagem /= 100;
       salario +=(salario * porcentagem);
       
       colaborador.setSalario(salario);
       this.quantidadeReajustes += 1;
       }
       return colaborador.getSalario();  
    }
    
    public Double promoverColaborador(String nomeColaborador, String novoCargo, Double novoSalario){
        
       if(validarPromocao(novoCargo, novoSalario)){

           this.quantidadePromovidos += 1;
       }
        
        return 0.0;
    }
    
    public Boolean validarPromocao(String novoCargo, Double novoSalario){
        
        Double salarioAntigo = colaborador.getSalario();
        
        return colaborador != null && novoCargo != null && novoSalario != null && novoSalario > salarioAntigo;
        
    }
} 


