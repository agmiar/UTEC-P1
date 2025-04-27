package modulo.dos.practico.herencia.test;

public class Bebida {
    private String nombre;

    public Bebida(String nombre) {
        this.nombre = nombre;
    }

    public Bebida() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void tomarBebida(){
        System.out.println("Tomando la bebida " + nombre);
    }
}
