package modulo.tres.coderunner;

public class TestSumarFilasColumnasMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Sumar FILAS
        int[] sumasFilas = SumarFilasColumnasMatriz.sumarFilas(matriz);
        for (int i : sumasFilas)
            System.out.print(i + "  ");

        System.out.println(" ");

        // Sumar COLUMNAS
        int[] sumasColumnas = SumarFilasColumnasMatriz.sumarColumnas(matriz);
        for (int j : sumasColumnas)
            System.out.print(j + " ");
    }
}
