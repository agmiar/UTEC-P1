package modulo.dos.coderunner;

public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Juan");
        estudiante1.setEdad(20);
        estudiante1.setNota(85.5);
        System.out.println(estudiante1.toString());

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Pedro");
        estudiante2.setEdad(20);
        estudiante2.setNota(75.5);
        System.out.println(estudiante2.toString());
    }
}
