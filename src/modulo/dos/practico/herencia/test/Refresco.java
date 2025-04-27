package modulo.dos.practico.herencia.test;

public class Refresco extends Bebida {
    private String marca;

    public Refresco() {}

    public Refresco(String marca) {
        this.marca = marca;
    }

    public void tomarBebida() {
        System.out.println("Tomando refresco con efervescencia " + marca);
    }
}


