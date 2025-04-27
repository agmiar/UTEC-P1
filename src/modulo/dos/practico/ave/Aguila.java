package modulo.dos.practico.ave;

public class Aguila extends Ave {
    private double envergadura;

    public Aguila() {}

    public Aguila(double envergadura) {
        this.setNombre("Aguila");
        this.envergadura = envergadura;
    }

    public void volarAlto(){
        System.out.println("El águila está volando alto...");
    }
}



