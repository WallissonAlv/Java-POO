package aula13;
public class Aula13 {
    public static void main(String[] args) {
        // PROGRAMA PRINCIPAL 
        
        Cachorro x = new Cachorro();
        
        x.reagir("Ola");
        x.reagir("Vai Apanhar");
        System.out.println("");
        
        x.reagir(11, 45);
        x.reagir(21,00);
        System.out.println("");
        
        x.reagir(true);
        x.reagir(false);
        System.out.println("");
        
        x.reagir(4, 2.1f);
        x.reagir(17, 4.5f);
    }
}
