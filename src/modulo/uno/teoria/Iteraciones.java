package modulo.uno.teoria;

public class Iteraciones {
    public static void main(String[] args) {
        int vacas = 1;
        for (int pasto = 15; pasto > 0; pasto--){
            vacas++;
        }
        // pasto terminó siendo 0
        System.out.printf("Hay %d vacas. \n", vacas);

        // AHORA CON WHILE
        vacas = 1;
        int pasto = 15;
        while(pasto > 0){
            vacas++;
            pasto--;
        }
        // pasto terminó siendo 0
        System.out.printf("Hay %d vacas. \n", vacas);

        // AHORA CON DO WHILE
        vacas = 1;
        pasto = 15;
        do {
            vacas++;
            pasto--;
        } while (pasto > 0);
        // pasto terminó siendo 0
        System.out.printf("Hay %d vacas. \n", vacas);

        for (int i = 0; i <= 20; i++){
            if(i % 2 != 0) continue;
            System.out.printf("%d - ", i);
        }
    }
}
