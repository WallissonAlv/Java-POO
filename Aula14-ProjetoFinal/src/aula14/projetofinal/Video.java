package aula14.projetofinal;
public class Video implements AcoesVideo{
    
    private String titulo;
    private boolean reproduzindo;
    private int avaliacao, views, curtidas;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
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
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova =((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
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
