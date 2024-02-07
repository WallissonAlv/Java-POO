package aula10.projetopessoas;
public class Aluno extends Pessoa{
    
    // ATRIBUTOS
    private int mat;
    private String curso;
    
    //METODOS PRINCIPAIS
    public void cancelarMatr(){
        System.out.println("Matricula cancelada!");
    }
    
    //METODOS ESPECIAIS
    public int getMat() {
        return mat;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
