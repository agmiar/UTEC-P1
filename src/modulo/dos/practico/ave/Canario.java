package modulo.dos.practico.ave;

public class Canario extends Ave{
    private String canto; // descripción del canto

    public Canario() {}

    public Canario(String color, String canto) {
        this.setNombre("Canario");
        this.setColor(color);
        this.canto = canto;
    }

    public void cantar(){
        System.out.println(this.canto);
    }
}
