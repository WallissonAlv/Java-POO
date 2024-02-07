package projetolivro;
public class Pessoa {
    
    // ATRIBUTOS ---------------------------------------------------------------
    private String nome;
    private int idade;
    private String sexo;
    
    // MÉTODOS PRINCIPAIS ------------------------------------------------------
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public void fazerAniver(){
        
    }
    // MÉTODOS ESPECIAIS -------------------------------------------------------

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
