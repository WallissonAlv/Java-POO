package projetolivro;
public class Livro implements Publicacao {
    
    // ATRIBUTOS ---------------------------------------------------------------
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // MÉTODOS PRINCIPAIS ------------------------------------------------------
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public String Detalhes() {
        return "Livro{" + "titulo= " + titulo + " | autor= " + autor 
                + "\n- totPaginas= " + totPaginas + " | pagAtual= " 
                + pagAtual + " | aberto= " + aberto + "\n- leitor= "
                + leitor.getNome() + " | Idade= " + leitor.getIdade()
                + " | Sexo= " + leitor.getSexo() +'}';
    }
    
    // MÉTODOS ESPECIAIS -------------------------------------------------------
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }
    @Override
    public void fechar() {
        this.aberto = false;
    }
    @Override
    public void folhear(int p) {
        if (p < this.totPaginas){
            this.pagAtual = p;
        } else {
            this.pagAtual = 0;
        }
    }
    @Override
    public void avancarPag() {
        this.pagAtual++;
    }
    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
