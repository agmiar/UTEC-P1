package modulo.tres.teoria;
import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Marcos");
        mapa.put(2, "Hector");
        mapa.put(3, "Alberto");
        mapa.put(4, "Pilar");
        for (Integer p:  mapa.keySet()) {
            System.out.println("Clave : " + p + " Valor : " + mapa.get(p));
        }
    }
}
