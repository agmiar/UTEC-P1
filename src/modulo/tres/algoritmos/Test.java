package modulo.tres.algoritmos;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Tipo de dato primitivo
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        Sort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("");

        // Tipo de dato complejo
        Persona[] personas = new Persona[3];
        personas[0] = new Persona("Patricio", 22);
        personas[1] = new Persona("Rosita", 15);
        personas[2] = new Persona("Nahiara", 19);
        System.out.println(Arrays.deepToString(personas));
        Sort.insertionSort(personas);
        System.out.println(Arrays.deepToString(personas));
        System.out.println("");

        // Búsqueda binaria de tipo de dato primitivo
        int valorBuscado, posicionValorBuscado;

        for (int i = 1; i < 4; i++){
            valorBuscado = (int)(Math.round(Math.random() * 10));
            posicionValorBuscado = Search.binarySearch(arr, valorBuscado);
            System.out.printf("El valor %d se encuentra en la posición %d del arreglo\n"
                    , valorBuscado, posicionValorBuscado);
        }
        System.out.println("");

        // Búsqueda binaria de tipo de dato complejo
        int[] edades = new int[3];
        edades[0] = personas[0].getEdad();
        edades[1] = personas[1].getEdad();
        edades[2] = personas[2].getEdad();

        posicionValorBuscado = Search.binarySearch(edades, 15);
        System.out.printf("El nombre de la persona que tiene %d años es: %s\n",
                personas[posicionValorBuscado].getEdad(),
                personas[posicionValorBuscado].getNombre()
        );

        posicionValorBuscado = Search.binarySearch(edades, 19);
        System.out.printf("El nombre de la persona que tiene %d años es: %s\n",
                personas[posicionValorBuscado].getEdad(),
                personas[posicionValorBuscado].getNombre()
        );

        posicionValorBuscado = Search.binarySearch(edades, 22);
        System.out.printf("El nombre de la persona que tiene %d años es: %s\n",
                personas[posicionValorBuscado].getEdad(),
                personas[posicionValorBuscado].getNombre()
        );
    }
}