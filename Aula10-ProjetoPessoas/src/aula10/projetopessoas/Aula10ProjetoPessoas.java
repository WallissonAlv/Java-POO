package aula10.projetopessoas;
public class Aula10ProjetoPessoas {
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Clauduo");
        p4.setNome("Fabiana");
        
        p1.setSexo("Masculino");
        p4.setSexo("Feminino");
        p2.setIdade(18);
        p3.setIdade(28);
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        /*  p1.receberAumento(550.20f);
            p2.mudarTrabalho();
            p4.cancelarMatr();   */
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
