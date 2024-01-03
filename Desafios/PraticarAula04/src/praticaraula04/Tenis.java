package praticaraula04;
public class Tenis {
    
    private String modelo;
    public String cor;
    private String sexo;
    private int tamanho;
    private String code; 
    
    public Tenis(String m, String c, String s, int t, String co){
        this.modelo = m;
        this.cor = c;
        this.sexo = s;
        this.tamanho = t;
        this.code = co;
    }   
    /* ----------------------------------------------------------------------*/
    /* ---------------------- GETTERS AND SETTERS ---------------------------*/
   
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    /* ----------------------------------------------------------------------*/
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    /* ----------------------------------------------------------------------*/
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }
    /* ----------------------------------------------------------------------*/
    public int getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(int t){
        this.tamanho = t;
    }
    /* ----------------------------------------------------------------------*/
    public String getCode(){
        return this.code;
    }
    public void setCode(String co){
        this.code = co;
    }
    
    /* ---------------------- FIM GETTERS SETTERS ---------------------------*/
    /* ----------------------------------------------------------------------*/
    
    public void status(){
        System.out.println("-----| ASICS |-----");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Para: "+ this.sexo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Tamanho: "+ this.tamanho);
        System.out.println("Code: "+ this.code);
        System.out.println("");
    }
    
    
    
}
