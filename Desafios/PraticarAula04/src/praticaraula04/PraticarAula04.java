package praticaraula04;
public class PraticarAula04 {

    public static void main(String[] args) {
        Tenis t1 = new Tenis("GelNimbus", "Branco", "Women", 37,     "4578789897897");
        t1.status();
        
        Tenis t2 = new Tenis("GelKayano", "Evening Teal", "Men", 42, "1425142255648");
        t2.status();
        
        Tenis t3 = new Tenis("Pacemaker 4", "White/White", "Men", 44, "4253486555423");
        t3.cor = "Laranja";
        //t3.setCor("Preto");
        t3.status();  
    }
}