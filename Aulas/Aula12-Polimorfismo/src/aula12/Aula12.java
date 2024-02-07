package aula12;
public class Aula12 {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra ();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        
        /* m.setPeso(35.7f);
        m.setCorPelo("Marron");
        m.alimentar();
        m.emitirSom();
        m.locomover(); */
        
        /* a.locomover();
        p.locomover();
        r.locomover(); */ 
        
        c.locomover();
        c.usarBolsa();
        c.emitirSom();
        System.out.println("");
        
        k.locomover();
        k.emitirSom();
    }
    
}
