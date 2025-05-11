package modulo.cuatro.coderunner.dos;

public class Podcast implements Reproducible {
    private String episodio;

    public Podcast(String episodio) {
        this.episodio = episodio;
    }

    @Override
    public void reproducir() {
        System.out.printf("Reproduciendo el episodio de podcast: %s\n", episodio);
    }
}
