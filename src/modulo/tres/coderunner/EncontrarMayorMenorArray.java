package modulo.tres.coderunner;

public class EncontrarMayorMenorArray {
    public static int encontrarMayor(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }

        int mayor = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] > mayor){
                mayor = array[i];
            }
        }

        return mayor;
    }

    public static int encontrarMenor(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }

        int menor = array[0];

        for (int i = 0; i < array.length; i++){
            if (menor > array[i]){
                menor = array[i];
            }
        }

        return menor;
    }
}