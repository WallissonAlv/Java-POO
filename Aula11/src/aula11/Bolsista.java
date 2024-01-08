package aula11;
public class Bolsista extends Aluno {
    
    //
    private float bolsa;
    
    //
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+ this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() +" e bolsista! Pagamento facilitado!");
    }
    //
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    @Override
    public String toString() {
        return "Bolsista{" + "nome= " + nome + " | idade= " + idade 
                + " | sexo= " + sexo + "\n- bolsa= " + bolsa + "%" +'}';
    }
    
}
