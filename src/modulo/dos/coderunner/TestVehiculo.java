package modulo.dos.coderunner;

public class TestVehiculo {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Toyota", "Camry", 4);
        Motocicleta motocicleta = new Motocicleta("Honda", "CBR500R", 500);
        automovil.abrirPuertas();
        motocicleta.acelerar();

        // Polimorfismo: Almacenamos instancias de ambas clases en un arreglo de tipo Vehiculo
        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = automovil;
        vehiculos[1] = motocicleta;

        // Llamar a algunos métodos comunes usando polimorfismo
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo());
            vehiculo.arrancar();
            System.out.println("------------------------------");
        }
    }
}