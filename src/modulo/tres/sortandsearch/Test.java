package modulo.tres.sortandsearch;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("Bubble sort con tipo de dato primitivo");
        int[] arr1 = {40,50,90,5,-10,3,4,15};
        System.out.println(Arrays.toString(arr1));
        Sort.bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        System.out.println("Bubble sort con tipo de dato complejo");
        Persona[] personas = new Persona[3];
        personas[0] = new Persona("Patricio", 22);
        personas[1] = new Persona("Rosita", 15);
        personas[2] = new Persona("Nahiara", 19);
        System.out.println(Arrays.deepToString(personas));
        ModifiedSort.bubbleSortPersona(personas);
        System.out.println(Arrays.deepToString(personas));
        System.out.println();

        System.out.println("Selection sort con tipo de dato primitivo");
        int[] arr2 = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr2));
        Sort.selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        System.out.println("Búsqueda binaria de tipo de dato primitivo");
        int valorBuscado, posicionValorBuscado;

        for (int i = 1; i < 4; i++){
            valorBuscado = (int)(Math.round(Math.random() * 10));
            posicionValorBuscado = Search.binarySearch(arr2, valorBuscado);
            System.out.printf("El valor %d se encuentra en la posición con índice %d del arreglo\n"
                    , valorBuscado, posicionValorBuscado);
        }
        System.out.println();

        System.out.println("Búsqueda binaria - ejemplo con Clase Persona");
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

        System.out.println();

        System.out.println("Selection sort modificado (de mayor a menor)");
        int[] arr3 = {-50, 34, 22, 10, -40, 15, 32};
        ModifiedSort.selectionSortMayorMenor(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println();

        System.out.println("Insertion sort modificado (ordena Strings)");
        String[] nombres = {"Maria", "Rosa", "Cristina", "Guadalupe", "Amalia"};
        ModifiedSort.insertionSortStrings(nombres);
        System.out.println(Arrays.toString(nombres));
    }
}