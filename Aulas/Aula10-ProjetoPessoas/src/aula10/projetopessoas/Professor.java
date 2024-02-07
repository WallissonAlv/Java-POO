package aula10.projetopessoas;
public class Professor extends Pessoa {
    
    // ATRIBUTOS
    private String especialidade;
    private float salario;
    
    // METODOS PRINCIPAIS
    public void receberAumento(float aum){
        this.salario += aum;
    }
    
    // METODOS ESPECIAIS

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
}
