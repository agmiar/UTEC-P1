package modulo.cuatro.coderunner.cinco;

public class Main {
    public static void main(String[] args) {
        Persona empleado = new Empleado("Juan", 30, "XYZ Company");
        Persona gerente = new Gerente("María", 40, "Recursos Humanos");

        empleado.presentarse();
        gerente.presentarse();
    }
}
