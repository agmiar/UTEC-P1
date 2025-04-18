package modulo.dos.practico;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void cambiarCarrera(String carrera) {
        this.carrera = carrera;
        System.out.println("Carrera cambiada con éxito.");
    }
}
