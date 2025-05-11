package modulo.cuatro.coderunner.cinco;

public class Gerente extends Persona {
    private String departamento;

    public Gerente(String nombre, int edad, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
    }

    public void presentarse() {
        System.out.printf("Hola, soy %s, tengo %d años y soy gerente del departamento de %s.\n", nombre, edad, departamento);
    }
}
