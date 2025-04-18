package modulo.dos.practico.herencia;

public class Automovil extends Vehiculo {

    private String modelo;
    private Id duenio;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, Id duenio) {
        this.setMarca(marca);
        this.modelo = modelo;
        this.duenio = duenio;
    }

    public Automovil(String marca, String modelo) {
        this(marca, modelo, null);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Id getDuenio() {
        return duenio;
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo automóvil");
    }
}