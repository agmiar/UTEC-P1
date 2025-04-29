package modulo.tres.practico;

public class Arrays {
    public static void main(String[] args) {
        // Ejercicio 1
        int[] numeros = {1, 2, 3, 4, 5};

        int suma = 0;

        for (int i: numeros)
            suma += i;

        System.out.println("Suma de números del 1 al 5: " + suma);

        // Ejercicio 2
        String[] arr = {"Hola", "Mundo", "Java", "Programación"};
        
        for (String s: arr)
            System.out.printf("La palabra \"%s\" tiene %d caracteres\n", s, s.length());

        // Ejercicio 3
        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};

        for (int i: numeros2)
            if (i % 2 == 0)
                System.out.print(i + " - ");

        System.out.println(" ");

        // Ejercicio 4

        int[][] numeros3 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < numeros3.length; i++)
            for (int j = 0; j < numeros3[0].length; j++)
                System.out.print(numeros3[i][j] + " - ");
    }
}
