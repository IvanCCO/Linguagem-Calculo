/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.projeto.heranca.lp;

/**
 *
 * @author aluno
 */



public class AlunoPos extends Aluno{
        
    private Double nota3;
    

    public AlunoPos(Double nota3, Integer ra, String nome, Double nota1, Double nota2) {
        super(ra, nome, nota1, nota2);
        this.nota3 = nota3;
    }
     
    
    @Override
    public Double calcularMedia(){
        
        return (super.getNota1() + super.getNota2() + nota3) / 3;
    }
    
}
