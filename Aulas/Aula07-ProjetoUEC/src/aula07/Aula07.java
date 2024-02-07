package aula07;
public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f,
                           68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "brasil", 29, 1.68f,
                           57.8f, 14,2, 3);
        l[2] = new Lutador("SnapShadow","EUA",35, 1.65f, 
                           80.9f, 12, 2, 1);
        l[3] = new Lutador("DeadCode", "Australia", 28, 1.93f, 
                           81.6f, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.78f,
                           119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdart", "EUA", 30, 1.81f,
                           105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.MarcarLuta(l[4], l[5]);
        UEC01.Lutar();
        l[4].Status();
        l[5].Status();
    }
}
