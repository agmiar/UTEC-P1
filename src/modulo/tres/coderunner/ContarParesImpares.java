package modulo.tres.coderunner;

import java.util.LinkedList;

public class ContarParesImpares {
    public static int[] contarParesImpares(LinkedList<Integer> lista){
        // Inicializar contadores
        int pares = 0;
        int impares = 0;

        // Contar la cantidad de números pares e impares
        for (Integer i: lista){
            if (i % 2 == 0)
                pares++;
            else
                impares++;
        }

        // Crea y devuelve un arreglo de dos elementos
        return new int[]{pares, impares};
    }

    public static void main(String[] args){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        // Obtener la cantidad de números pares e impares usando el método contarParesImpares
        int[] resultado = ContarParesImpares.contarParesImpares(lista);

        // Mostrar el resultado
        System.out.println("Cantidad de números pares: " + resultado[0]);
        System.out.println("Cantidad de números impares: " + resultado[1]);
    }
}
