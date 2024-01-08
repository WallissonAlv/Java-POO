package aula10.projetopessoas;
public class Funcionario extends Pessoa {
    
    // ATRIBUTOS
    private String setor;
    private boolean trabalhando;
    
    // METODOS PRINCIPAIS
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
    
    // METODOS ESPECIAIS
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
