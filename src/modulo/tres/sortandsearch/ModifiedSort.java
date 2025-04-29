package modulo.tres.sortandsearch;

public class ModifiedSort {
    // Bubble sort con tipo de dato complejo - Clase Persona
    public static void bubbleSortPersona(Persona[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < (a.length - 1 - i); j++) {
                if (a[j].getEdad() > a[j + 1].getEdad()) {
                    // Hay que pensar que las variables en este caso operan como referencias a objetos,
                    // lo único que hago es cambiar hacia qué objeto apuntan, no creo nuevos objetos
                    Persona aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }

    // Selection sort de MAYOR a MENOR
    public static void selectionSortMayorMenor(int[] arr) {
        int N = arr.length;
        int aux;
        int jMaximo;

        for (int i = 0; i < N - 1; i++) {
            jMaximo = i;
            for (int j = i + 1; j < N; j++)
                if (arr[j] > arr[jMaximo])
                    jMaximo = j;

            if (jMaximo != i) {
                // Swap
                aux = arr[jMaximo];
                arr[jMaximo] = arr[i];
                arr[i] = aux;
            }
        }
    }

    public static void insertionSortStrings (String[]arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && !(StringOps.estarOrdenadas(arr[j - 1], arr[j]))) {
                String aux = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = aux;
                j--;
            }
        }
    }
}
