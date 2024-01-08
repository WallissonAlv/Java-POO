package aula07;
public class Lutador {
    
    // Atributos ---------------------------------------------------------------
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Métodos Publicos -----------------------------------------------------
    public void Apresentar(){
        System.out.println("---------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador "+ this.getNome());
        System.out.println("Diretamente de: "+ this.getNacionalidade());
        System.out.println("Com "+ this.getIdade()+ " anos e "+ this.getAltura() +"m de Altura");
        System.out.println("Pesando "+ this.getPeso()+"Kg");
        System.out.println("Vitorias: "+ this.getVitorias());
        System.out.println("Derrotas: "+ this.getDerrotas());
        System.out.println("Empates: "+ this.getEmpates());
    }
    public void Status(){
        System.out.println(this.getNome() +" E um peso "+ this.getCategoria());
        System.out.println("Ganhou "+ this.getVitorias() +" vezes");
        System.out.println("E perdeu "+ this.getDerrotas()+ " vezes");
        System.out.println("Com "+ this.getEmpates()+ " empates.");
    }
    public void GanharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void PerderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void EmpatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    // Métodos Especiais -------------------------------------------------------
    public Lutador(String no, String na, int id, float al, float pe, int vi
    , int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float al){
        this.altura = al;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }
    public String getCategoria(){
        return categoria;
    }
    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "invalido";
        } else if (this.peso <= 70.3){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9){
            this.categoria = "Médio";
        } else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }
    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int em){
        this.empates = em;
    }
}  
    

  


