package aula11;
public class Professor extends Pessoa {
    
    // ATRIBUTOS
    private String especialidade;
    private float salario;

    // MÉTODOS PRINCIPAIS
    public void receberSalario(){
        this.salario += 550.90;
        System.out.println("Salario alterado, aumento de "+ this.salario);
    }
    
    // MÉTODOS ESPECIAIS
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Dados{nome= " + nome + " | idade= " + idade + " | sexo= "
                + sexo + "\n- Especialidade= " + especialidade + " | salario= "
                + salario + '}';
    }
    
}
