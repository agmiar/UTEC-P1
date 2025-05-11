package modulo.cuatro.coderunner.dos;

public class Cancion implements Reproducible {
    private String titulo;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void reproducir() {
        System.out.printf("Reproduciendo la canción: %s\n", titulo);
    }
}
