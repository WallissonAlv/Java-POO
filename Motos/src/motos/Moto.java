package motos;
public abstract class Moto {
    
    // ATRIBUTOS ===============================================================
    private float cilindradas;
    private String tipomotor;
    private String combustivel;
    private String transmissao;
    private String partida;
    private float peso;
    private String rodas;
    private float captanque;
    private String farol;
    
    // MÉTODOS PRINCIPAIS ======================================================
    
    
    // MÉTODOS ESPECIAIS =======================================================
    public float getCilindradas(){
        return cilindradas;
    }
    public void setCilindradas(float cilindradas){
        this.cilindradas = cilindradas;
    }
    public String getTipoMotor(){
        return tipomotor;
    }
    public void setTipoMotor(String tipomotor){
        this.tipomotor = tipomotor;
    }
    public String getCombustivel(){
        return combustivel;
    }
    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }
    public String getTransmissao(){
        return transmissao;
    }
    public void setTransmissao(String transmissao){
        this.transmissao = transmissao;
    }
    public String getPartida(){
        return partida;
    }
    public void setPartida(String partida){
        this.partida = partida;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public String getRodas(){
        return rodas;
    }
    public void setRodas(String rodas){
        this.rodas = rodas;
    }
    public float getCapTanque(){
        return captanque;
    }
    public void setCapTanque(float captanque){
        this.captanque = captanque;
    }
    public String getFarol(){
        return farol;
    }
    public void setFarol(String farol){
        this.farol = farol;
    }
}
