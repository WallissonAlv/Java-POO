package aula14.projetofinal;
public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int idade,
    String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }
    public void viuMaisUm(){
        
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() 
                + "\n- login= " + login + " | totAssistido= " 
                + totAssistido + '}'+ "\n";
    }
    
}
