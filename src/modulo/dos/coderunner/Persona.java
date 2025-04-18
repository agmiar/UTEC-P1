package modulo.dos.coderunner;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Persona(){
        this("null", 0, "null");
    }

    public Persona(String nombre){
        this(nombre, 0, "null");
    }

    public Persona(int edad){
        this("null", edad, "null");
    }

    public Persona(String nombre, int edad){
        this(nombre, edad, "null");
    }

    public Persona(String nombre, String direccion){
        this(nombre, 0, direccion);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("------------------------");
    }
}
