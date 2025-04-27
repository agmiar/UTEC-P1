package modulo.tres.algoritmos;

public class Sort {
    public static void insertionSort(int[] a){
        for (int i = 0; i < a.length - 1; i++){
            for (int j = 0; j < (a.length - 1 - i); j++){
                if (a[j] > a[j+1]){
                    int aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
    }

    public static void insertionSort(Persona[] a){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < (a.length - 1 - i); j++){
                if (a[j].getEdad() > a[j+1].getEdad()){
                    // Hay que pensar que las variables en este caso operan como referencias a objetos,
                    // lo único que hago es cambiar hacia qué objeto apuntan, no creo nuevos objetos
                    Persona aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
    }
}
