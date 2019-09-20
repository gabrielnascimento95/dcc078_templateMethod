/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethodpattern;

/**
 *
 * @author ice
 */
public class TemplateMethodPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlunoGraduacao aluno1 = new AlunoGraduacao();
        aluno1.setNome("Marco");
        aluno1.setInstituicaoOrigem("João XXIII");
        
        
        AlunoPosGraduacao aluno2 = new AlunoPosGraduacao();
        aluno2.setNome("Antônio");
        aluno2.setInstituicaoOrigem("UFJF");
        
        System.out.println(aluno1.getDadosAluno());
        System.out.println("\n");
        System.out.println(aluno2.getDadosAluno());
    }
    
}
