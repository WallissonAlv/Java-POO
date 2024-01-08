package aula11;
public class Aluno extends Pessoa {
    //
    private int matricula;
    private String curso;
    
    //
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de "+ this.getNome());
    }
    
    //
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome= " + nome + " | idade= " + idade + " | sexo= " 
                + sexo + "\n- matricula= " + matricula + " | curso= " + curso + '}';
    }
    
}
