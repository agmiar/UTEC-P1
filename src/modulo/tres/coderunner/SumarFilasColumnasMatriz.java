package modulo.tres.coderunner;

public class SumarFilasColumnasMatriz {
    public static int[] sumarFilas(int[][] matriz) {
        // Verifica si la matriz no está vacía
        if (matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("La matriz no puede estar vacía.");
        }

        int[] sumasFilas = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) { // recorre cada fila
            for (int j = 0; j < matriz[i].length; j++) { // recorre cada columna
                sumasFilas[i] += matriz[i][j];
            }
        }

        return sumasFilas;
    }

    public static int[] sumarColumnas(int[][] matriz) {
        // Verifica si la matriz no está vacía
        if (matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("La matriz no puede estar vacía.");
        }

        int[] sumasColumnas = new int[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) { // recorre cada columna
            for (int i = 0; i < matriz.length; i++) { // recorre cada fila
                sumasColumnas[j] += matriz[i][j];
            }
        }

        return sumasColumnas;
    }
}