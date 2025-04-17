package modulo.dos.coderunner;

// Clase base
class Vehiculo {
    // Atributos
    private String marca;
    private String modelo;

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(){
    }

    // Métodos
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void arrancar(){
        System.out.println("El vehículo está arrancando.");
    }
}

// Clase derivada
class Automovil extends Vehiculo {
    // Atributos adicionales
    private int numeroPuertas;

    // Constructor
    public Automovil(String marca, String modelo, int numeroPuertas) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.numeroPuertas = numeroPuertas;
    }

    // Métodos adicionales
    public int getNumeroPuertas() {
        return this.numeroPuertas;
    }

    public void abrirPuertas(){
        System.out.println("Las puertas del automóvil se están abriendo.");
    }
}

// Clase derivada
class Motocicleta extends Vehiculo {
    // Atributos adicionales
    private int cilindrada;

    // Constructor
    public Motocicleta(String marca, String modelo, int cilindrada) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.cilindrada = cilindrada;
    }

    public Motocicleta(){
    }

    // Métodos adicionales
    public int getCilindrada() {
        return this.cilindrada;
    }

    public void acelerar(){
        System.out.println("La motocicleta está acelerando.");
    }
}