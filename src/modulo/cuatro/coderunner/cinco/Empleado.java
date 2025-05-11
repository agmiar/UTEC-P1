package modulo.cuatro.coderunner.cinco;

public class Empleado extends Persona {
    private String empresa;

    public Empleado(String nombre, int edad, String empresa) {
        this.empresa = empresa;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse(){
        System.out.printf("Hola, soy %s, tengo %d años y trabajo en %s.\n", nombre, edad, empresa);
    }
}
