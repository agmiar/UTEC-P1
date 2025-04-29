package modulo.tres.sortandsearch;

public class Sort {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {           // Pasadas
            for (int j = 0; j < arr.length - 1 - i; j++) {   // Comparaciones
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar (Swap)
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int N = arr.length;
        int aux = 0;
        int jMinimo = 0;

        for (int i = 0; i < N - 1; i++) {
            jMinimo = i;
            for (int j = i + 1; j < N; j++)
                if (arr[j] < arr[jMinimo])
                    jMinimo = j;

            if (jMinimo != i) {
                // Swap
                aux = arr[jMinimo];
                arr[jMinimo] = arr[i];
                arr[i] = aux;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int aux = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = aux;
                j--;
            }
        }
    }
}
