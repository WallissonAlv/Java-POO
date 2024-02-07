package aula14.projetofinal;
public class Video implements AcoesVideo{
    
    private String titulo, avaliacao;
    private boolean reproduzindo;
    private int views, curtidas;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = " " ;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    public String getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    public double getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public double getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    @Override
    public void like() {
        this.curtidas += 1;
    }
    @Override
    public String toString() {
        return "Video{" + "\n- titulo= " + titulo + "\n- reproduzindo=" 
                + reproduzindo + " | avaliacao=" + avaliacao + " | views=" 
                + views + " | curtidas=" + curtidas +'}'+ "\n";
    }
    
}
