package modulo.pruebafinal;

public class LibroTest {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El código Da Vinci", "Dan Brown", 2003, "9780307474278", true);
        libro1.mostrarInformacion();
        libro1.estaDisponible();
    }
}

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String isbn;
    private boolean estaDisponible;

    public Libro(String titulo, String autor, int anioPublicacion, String isbn, boolean estaDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.estaDisponible = estaDisponible;
    }

    public void mostrarInformacion(){
        System.out.printf("Título: %s\n", titulo);
        System.out.printf("Autor: %s\n", autor);
        System.out.printf("Año de publicación: %d\n", anioPublicacion);
        System.out.printf("ISBN: %s\n", isbn);
        System.out.printf("Esta Disponible: %b\n", estaDisponible);
    }

    public void estaDisponible() {
        if (estaDisponible)
            System.out.println("Está disponible.");
        else
            System.out.println("No está disponible.");
    }
}
