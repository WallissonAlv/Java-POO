package motos;

/* indicadas para a circulação nas cidades */

public class Street extends Moto {
    
    // ATRIBUTOS ===============================================================
    private float cilindradas;
    private String tipomotor;
    private String combustivel;
    private String transmissao;
    private float peso;
    private String rodas;
    private float captanque;
    private String farol;
    
    // MÉTODOS PRINCIPAIS ======================================================
    public Street (String marca, String modelo, String placa, String fabricacao,
        float cilindradas, String tipomotor, String combustivel,
        String transmissao, float peso, String rodas, float captanque, 
        String farol){
        super(marca, modelo, placa, fabricacao);
        this.cilindradas = cilindradas;
        this.tipomotor = tipomotor;
        this.combustivel = combustivel;
        this.transmissao = transmissao;
        this.peso = peso;
        this.rodas = rodas;
        this.captanque = captanque;
        this.farol = farol;
        
    }
    @Override
    public void darPartida(){
        this.ligada = true;
        System.out.println("VRUM VRUM!!!");
    }
    @Override
    public void cortarPartida(){
        this.ligada = false;
        System.out.println("Motor desligado");
    }
    
    // MÉTODOS ESPECIAIS  ======================================================

    @Override
    public String getMarca() {
        return marca;
    }
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String getModelo() {
        return modelo;
    }
    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String getPlaca() {
        return placa;
    }
    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    @Override
    public String getFabricacao() {
        return fabricacao;
    }
    @Override
    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }
    public float getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(float cilindradas) {
        this.cilindradas = cilindradas;
    }
    public String getTipomotor() {
        return tipomotor;
    }
    public void setTipomotor(String tipomotor) {
        this.tipomotor = tipomotor;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public String getTransmissao() {
        return transmissao;
    }
    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getRodas() {
        return rodas;
    }
    public void setRodas(String rodas) {
        this.rodas = rodas;
    }
    public float getCaptanque() {
        return captanque;
    }
    public void setCaptanque(float captanque) {
        this.captanque = captanque;
    }
    public String getFarol() {
        return farol;
    }
    public void setFarol(String farol) {
        this.farol = farol;
    }

    @Override
    public String toString() {
        return "------| Motocicleta Street |------ \n MARCA: "+marca+" | MODELO: "
                +modelo+" | PLACA: "+placa+" | FABRICACAO: "+fabricacao+"\n | Cilindradas= " 
                +cilindradas+"cc | Tipo do Motor= "+tipomotor+" | Combustivel= "
                +combustivel+"\n | transmissao= "+transmissao+" | peso= "+peso 
                + "Kg | rodas= "+rodas+"\n | captanque= "+captanque+" | farol= " 
                + farol+"\n |-------------------------------------------------|";
    }
    
}
