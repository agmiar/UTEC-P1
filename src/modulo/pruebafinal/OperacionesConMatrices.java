package modulo.pruebafinal;

import java.awt.font.FontRenderContext;

public class OperacionesConMatrices {
    // Método para sumar todos los elementos de una matriz
    public static int sumaElementosMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(matriz[i][j] + "\t"); // "\t" significa "tab"
            }
            System.out.printf("\n");
        }
    }


    // Método para sumar dos matrices
    public static int[][] sumarMatrices(int[][] m1, int[][] m2) {
        int[][] resultante = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                resultante[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return resultante;
    }

}
