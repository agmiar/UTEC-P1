package modulo.dos.practico;

public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Maria", 19, "Derecho");
        Estudiante e2 = new Estudiante("Lorenzo", 24, "Veterinaria");
        Estudiante e3 = new Estudiante("Jose", 37, "Medicina");

        e2.cambiarCarrera("Policía");
        e3.cambiarCarrera("Marketing");

        System.out.printf("%s, %s, %s", e1.getCarrera(), e2.getCarrera(), e3.getCarrera());
    }
}
