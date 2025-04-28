package modulo.tres.coderunner;

public class SumarElementosArray {
    public static int sumarElementos(int[] array) {
        int suma = 0;

        for (int i: array)
            suma += i;

        return suma;
    }
}
