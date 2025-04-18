package modulo.dos.practico;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int numPaginas;

    public Libro(String titulo, String autor, int anioPublicacion, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumPaginas() {
        return this.numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void mostrarInformacion(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año Publicación: " + this.anioPublicacion);
        System.out.println("Número de paginas: " + this.numPaginas);
    }
}
