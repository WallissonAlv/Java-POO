package aula11;
public class Tecnico extends Aluno {
    public int registroProfissional;
    
    public void praticar(){
        System.out.println("Praticando as aulas...");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }
    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "nome= " + nome + " | idade= " + idade 
                + " | sexo= " + sexo + "\n- registroProfissional= " 
                + registroProfissional + '}';
    }
    
}
