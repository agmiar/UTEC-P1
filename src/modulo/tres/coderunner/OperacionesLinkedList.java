package modulo.tres.coderunner;

import java.util.LinkedList;

public class OperacionesLinkedList {
    private LinkedList<Integer> lista;

    public OperacionesLinkedList() {
        lista = new LinkedList<>();
    }

    //Agregar un elemento
    public void agregarElemento(int elemento) {
        Integer aux = elemento;
        lista.addLast(aux);
    }

    //Eliminar un elemento
    public void eliminarElemento(int elemento) {
        Integer aux = elemento;
        lista.remove(aux);
    }

    //Mostrar la lista completa
    public String mostrarLista() {
        return lista.toString();
    }
}
