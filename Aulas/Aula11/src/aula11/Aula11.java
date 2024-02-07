package aula11;
public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        
        Professor p1 = new Professor();
        p1.setNome("Guanabara");
        p1.setIdade(42);
        p1.setSexo("Masculino");
        p1.setEspecialidade("Matematica");
        p1.setSalario(3450.00f);
        System.out.println(p1.toString());
        p1.receberSalario();
        System.out.println("");
        
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        System.out.println(v1.toString()+ "\n");
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("Masculino");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        System.out.println("");
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setIdade(22);
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        System.out.println("");
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Mariana");
        t1.setMatricula(987542);
        t1.setRegistroProfissional(154354);
        t1.setIdade(25);
        t1.setSexo("Feminino");
        System.out.println(t1.toString());
        t1.praticar();
        t1.pagarMensalidade();
    }
}
