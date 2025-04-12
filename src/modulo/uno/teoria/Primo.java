package modulo.uno.teoria;

public class Primo {
    public static void main(String[] args) {
        boolean esPrimo = true;
        int candidato = 3;
        for (int i = 2; i < Math.sqrt(candidato); i++) {
            if (candidato % i == 0)
                esPrimo = false;
        }
        if (esPrimo == true)
            System.out.printf("%d es primo.", candidato);
    }
}
