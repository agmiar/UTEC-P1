package modulo.cuatro.coderunner.dos;

public class Main {
    public static void main(String[] args){
        Reproducible cancion = new Cancion("Canción A");
        Reproducible podcast = new Podcast("Episodio 1");

        cancion.reproducir();
        podcast.reproducir();

        System.out.println("----------------");

        Reproducible cancionB = new Cancion("Canción B");
        Reproducible podcastB = new Podcast("Episodio 1");

        cancionB.reproducir();
        podcastB.reproducir();
    }
}
