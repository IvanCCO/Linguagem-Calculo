package school.sptech.desafio.ivan.medeiros.poo;

public class App {
    
    public static void main(String[] args) {
        
        Colaborador col = new Colaborador("Ivan", "Dev.JR", 1341.32);
        RecursosHumanos rh = new RecursosHumanos();
        
        System.out.println(col.toString());
        
        rh.reajustarSalario(col, 10.0);
         
        System.out.println(col.toString());
        
        rh.promoverColaborador(col, "Dev Pleno", 1720.0);
        
        System.out.println(col.toString());
    }
}
