package modulo.tres.coderunner;

public class TestOperacionesLinkedList {
    public static void main(String[] args) {
        OperacionesLinkedList operaciones = new OperacionesLinkedList();
        operaciones.agregarElemento(1);
        operaciones.agregarElemento(2);
        operaciones.agregarElemento(7);
        System.out.println("Lista inicial: " + operaciones.mostrarLista());

        System.out.println("-----------------");

        OperacionesLinkedList operaciones2 = new OperacionesLinkedList();
        operaciones2.agregarElemento(1);
        operaciones2.agregarElemento(2);
        operaciones2.agregarElemento(3);
        operaciones2.eliminarElemento(2);
        System.out.println("Lista después de eliminar 2: " + operaciones2.mostrarLista());
    }
}
