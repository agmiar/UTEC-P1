package modulo.tres.teoria;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        // Creación de una lista
        // Notar que () queda vacío porque nunca sé la extensión de la lista de antemano
        LinkedList<Integer> numeros = new LinkedList<Integer>();

        // Agregar elementos a la lista
        numeros.add(5);
        numeros.add(-90);
        numeros.add(17);
        numeros.add(32);

        // Extensión/tamaño de la lista
        System.out.println(numeros.size());

        // contains()
        boolean seEncuentra = numeros.contains(-90);
        System.out.println("-90 se encuentra en la lista: " + seEncuentra);

        // get(x) --> retorna el elemento ubicado en la posición x
        System.out.println(numeros.get(0)); // 5

        // remove(x) --> elimina al elemento en la posición x
        numeros.remove(3); // elimina al 32
        System.out.println(numeros.contains(32)); // false

        System.out.println("");

        // Objeto iterator
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        numeros.add(0, 8);
    }
;}
