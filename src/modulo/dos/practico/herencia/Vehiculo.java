package modulo.dos.practico.herencia;

public class Vehiculo {
    private String marca;

    public Vehiculo() {
    }

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void encender(){
        System.out.println("Encendiendo vehículo");
    }
}
