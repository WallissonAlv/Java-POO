package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    // VOID NÃO TEM RETORNO //
    
    public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Esta tampada? "+ this.tampada);
        System.out.println("");
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO, nao posso rabiscar!");
            System.out.println("");
        } else {
            System.out.println("Estou Rabiscando");
            System.out.println("");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
