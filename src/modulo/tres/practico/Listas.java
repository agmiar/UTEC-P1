package modulo.tres.practico;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Listas {
    public static void main(String[] args) {
        LinkedList<String> listaStrings = new LinkedList<>();
        listaStrings.add("Hola");
        listaStrings.add("chau");
        listaStrings.add("otro texto");

        for (String s: listaStrings)
            System.out.println(s);

        if (listaStrings.contains("chau"))
            System.out.println("La lista contiene al elemento \"chau\"");
        else
            System.out.println("La lista NO contiene al elemento \"chau\"");

        listaStrings.remove("chau");

        for (String s: listaStrings)
            System.out.println(s);

        System.out.println("--------------iterator:");

        // Iterator
        Iterator<String> it = listaStrings.iterator();

        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("--------------list iterator:");
        ListIterator<String> lit = listaStrings.listIterator(listaStrings.size());

        while (lit.hasPrevious())
            System.out.println(lit.previous());
    }
}
