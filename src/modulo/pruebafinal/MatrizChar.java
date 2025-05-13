package modulo.pruebafinal;

public class MatrizChar {
    public static void matrizMostrar(char[][] matriz) {
        // inicializar la matriz con datos

        // Aca debe agregarse el código para este
        // caso, debe utilizar una estructura de for
        // anidado para econtrar una posible solución
        // de cargar el contenido de la matriz solicitado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz.length - 1)
                    matriz[i][j] = '#';
            }
        }


        // mostrar matriz luego de cargada.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

