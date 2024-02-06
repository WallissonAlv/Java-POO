package motos;
/**
 * @author Wallisson Alves
 */
public class Motos {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Street y = new Street("Yamaha", "YBR Factor", "RIB0K84",
            "20/2021",125.0f, "4 Tempos", 
            "BlueFlex", "5 Marchas", 125.0f,
            "Liga-Leve",15.7f, "LED");
        
        /*y.darPartida();
        y.cortarPartida();*/
        System.out.println(y.toString());
    }
}
