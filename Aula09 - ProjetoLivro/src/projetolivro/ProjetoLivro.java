package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[2];
        
        p[0] = new Pessoa("Wallisson",21,"Masculino");
        p[1] = new Pessoa("Ingred", 30,"Feminino");
        
        
        l[0] = new Livro( "Amor a Cegas", "Cristovam", 
                125, p[0]);
        l[1] = new Livro("Java POO", "Gustavo Guanabara", 
                500, p[1]);
        
        
        l[1].abrir();
        l[1].avancarPag();
        l[1].voltarPag();
        l[1].folhear(120);
        
        System.out.println(l[1].Detalhes());
        
        l[1].fechar();
        System.out.println(l[1].Detalhes());
        /*
        l[0].abrir();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        
        System.out.println(l[0].Detalhes());*/
        
        
    }
}
