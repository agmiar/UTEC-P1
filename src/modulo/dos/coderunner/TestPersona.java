package modulo.dos.coderunner;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Alice");
        Persona persona2 = new Persona("Bob", 25);
        Persona persona3 = new Persona("Charlie", 30, "123 Main St");
        Persona persona4 = new Persona("David", "456 Oak St");
        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
        persona3.mostrarInformacion();
        persona4.mostrarInformacion();
    }
}
