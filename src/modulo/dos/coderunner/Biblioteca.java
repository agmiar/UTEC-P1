package modulo.dos.coderunner;

public class Biblioteca {
    // Atributos
    String nombre;
    int librosDisponibles;
    int librosPrestados;

    // Constructor
    public Biblioteca(String nombre, int librosDisponibles, int librosPrestados){
        this.nombre = nombre;
        this.librosDisponibles = librosDisponibles;
        this.librosPrestados = librosPrestados;
    }

    public Biblioteca(String nombre, int librosDisponibles){
        this(nombre, librosDisponibles, 0);
    }

    // Métodos
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public int getLibrosDisponibles(){
        return this.librosDisponibles;
    }

    public void setLibrosDisponibles(int nuevaCantidad){
        this.librosDisponibles = nuevaCantidad;
    }

    public int getLibrosPrestados(){
        return this.librosPrestados;
    }

    public void setLibrosPrestados(int nuevaCantidad){
        this.librosPrestados = nuevaCantidad;
    }

    public void prestarLibro(){
        if (librosPrestados < librosDisponibles){
            librosPrestados++;
            librosDisponibles--;

        }
    }

    public void devolverLibro(){
        if (librosPrestados > 0){
            librosPrestados--;
            librosDisponibles++;
        }
    }

    @Override
    public String toString(){
        return "Biblioteca: " + nombre + ", Libros Disponibles: " + librosDisponibles + ", Libros Prestados: " + librosPrestados;
    }
}
