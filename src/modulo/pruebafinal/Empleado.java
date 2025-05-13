package modulo.pruebafinal;


class Empleado {
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }
}

// Clase Gerente debe heredar de Empleado
class Gerente {
    private String nombre;
    private String apellido;
    private double salario;
    // Añade el atributo extra
    private String departamento;

    // Constructor para inicializar todos los atributos
    public Gerente(String nombre, String apellido, double salario, String departamento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Sobreescribe el método calcularSalario()
    public double calcularSalario() {
        return 1.10 * salario;
    }
}

// Clase Desarrollador
class Desarrollador extends Empleado {
    public Desarrollador(String nombre, String apellido, double salario) {
        super(nombre, apellido, salario);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.20; // Agrega un bono del 20%
    }
}