package aula14.projetofinal;
public class Aula14ProjetoFinal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO.");
        v[1] = new Video("Aula 12 de PHP..");
        v[2] = new Video("Aula 15 Projeto Final...");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu","M",22 , "Juba");
        g[1] = new Gafanhoto("Creuza", "F", 12, "Cruzinha123");
        
        Visualizacao [] vis = new Visualizacao [5];
        
        vis[0] = new Visualizacao(g[0],v[2]); // JUBILEU ASSISTE AULA 15
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0],v[1]); // JUBILEU ASSISTE AULA 12
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
        vis[2] = new Visualizacao(g[1],v[0]);
        vis[2].avaliar(10);
        System.out.println(vis[2].toString());
        
        /*System.out.println("VIDEOS\n-------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("\nGAFANHOTO\n--------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
        
        
    }
}
