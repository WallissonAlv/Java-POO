package motos;
public abstract class Moto {
    
    // ATRIBUTOS ===============================================================
    protected boolean ligada = false;
    protected String marca;
    protected String modelo;
    protected String placa;
    protected String fabricacao;
    
    // MÉTODOS PRINCIPAIS ======================================================

    public Moto(String marca, String modelo, String placa, String fabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.fabricacao = fabricacao;
    }
    
    public void darPartida(){
        this.ligada = true;
    }
    public void cortarPartida(){
        this.ligada = false;
    }
    
    // MÉTODOS ESPECIAIS =======================================================

    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getFabricacao() {
        return fabricacao;
    }
    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }
}
