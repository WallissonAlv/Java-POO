package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    // VOID NÃO TEM RETORNO //
    
    void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Esta tampada? "+ this.tampada);
        System.out.println("");
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO, nao posso rabiscar!");
            System.out.println("");
        } else {
            System.out.println("Rabiscando");
            System.out.println("");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
