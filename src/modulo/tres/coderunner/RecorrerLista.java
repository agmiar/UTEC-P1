package modulo.tres.coderunner;

import java.util.LinkedList;

public class RecorrerLista {
    public static int sumarElementos(LinkedList<Integer> lista){
        int suma = 0;
        for(Integer i : lista){
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

    // Calcular la suma de los elementos usando el método sumarElementos
        int resultado = RecorrerLista.sumarElementos(lista);

    // Mostrar el resultado
        System.out.println("La suma de los elementos de la lista es: " + resultado);
    }
}
