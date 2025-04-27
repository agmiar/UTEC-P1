package modulo.tres.teoria;

import java.util.Collections;
import java.util.LinkedList;

public class ClaseCollections {
    public static void main(String[] args){
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(5);
        numeros.add(-90);
        numeros.add(17);
        numeros.add(32);

// sort() --> ordena de forma ascendente
        Collections.sort(numeros); // -90, 5, 17, 32

        System.out.println(numeros);


// reverse() --> invierte el orden de los elementos
        Collections.sort(numeros); // -90, 5, 17, 32
        Collections.reverse(numeros); // 32, 17, 5, -90

        System.out.println(numeros);

        // binarySearch()
        Collections.sort(numeros);
        int indiceElementoBuscado = Collections.binarySearch(numeros, 32);
        System.out.println(indiceElementoBuscado); // 3
        // Si no encuentra el índice del elemento buscado, retorna -(largoLista - 1)
        indiceElementoBuscado = Collections.binarySearch(numeros, 15);
        System.out.println(indiceElementoBuscado == -(numeros.size() - 1)); // TRUE
    }
}
