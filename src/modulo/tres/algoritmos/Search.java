package modulo.tres.algoritmos;

public class Search {
    public static int binarySearch(int[] arr, int valorBuscado){
        int izquierda = 0;
        int derecha = arr.length - 1;
        int medio;

        while(izquierda <= derecha){
            medio = (izquierda + derecha)/2;
            if(arr[medio] == valorBuscado)
                return medio;
            else if(arr[medio] < valorBuscado)
                izquierda = medio + 1;
            else
                derecha = medio - 1;
        }
        return -1;
    }
}
