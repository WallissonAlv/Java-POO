package aula14.projetofinal;
public class Aula14ProjetoFinal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 15 Projeto Final");
        
        g[0] = new Gafanhoto("Jubileu","M",22 , "Juba");
        g[1] = new Gafanhoto("Creuza", "F", 12, "Cruzinha123");
        
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
