package modulo.cinco.veterinaria;

public class VeterinariaTest {
    public static void main (String[] args){
        Cliente cliente1 = new Cliente("Lucía Díaz", "12312312", "lucia@gmail.com");
        Mascota mascota = new Mascota("Firulais", "Perro", 3, cliente1);
        cliente1.agregarMascota(mascota);

        Veterinario vet = new Veterinario("Dr. Juan Pérez", "44556677", "juan@vet.com");

        mascota.realizarServicio("Consulta general");
        vet.realizarServicio("Consulta general");

        mascota.mostrarHistorialServicios();
    }
}