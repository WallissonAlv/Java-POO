package aula14.projetofinal;
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews((int)this.filme.getViews() + 1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao("Bom");
    }
    public void avaliar(int nota){
        if(nota <= 3){
            this.filme.setAvaliacao("Ruim");
        }else if(nota <= 5){
            this.filme.setAvaliacao("Regular");
        }else if(nota <= 7){
            this.filme.setAvaliacao("Bom");
        }else if(nota <= 8){
            this.filme.setAvaliacao("Satisfatorio");
        }else{
            this.filme.setAvaliacao("Perfeito");
        }
    }
    public void avaliar(String aval){
        if(aval.equals("Ruim")){
            this.filme.setAvaliacao("Ruim");
        }else if(aval.equals("Regular")){
            this.filme.setAvaliacao("Regular");
        }else if(aval.equals("Bom")){
            this.filme.setAvaliacao("Bom");
        }else if(aval.equals("Satisfatorio")){
            this.filme.setAvaliacao("Satisfatorio");
        }else{
            this.filme.setAvaliacao("Perfeito");
        }
    }
    
    
    
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
}
