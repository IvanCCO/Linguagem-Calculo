package school.sptech.desafio.ivan.medeiros.poo;

public class App {
    
    public static void main(String[] args) {
        
        Colaborador col = new Colaborador();
        RecursosHumanos rh = new RecursosHumanos();
        
         col.setNome("Ivan medeiros");
         col.setCargo("Analista");
         col.setSalario(1239.0);
         
         System.out.println(col.toString());
         
         Double newSalario = rh.reajustarSalario(10.0);
         
         System.out.println(newSalario + ":" + col.getSalario());
         
    }
}
