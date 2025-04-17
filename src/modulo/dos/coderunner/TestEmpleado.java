package modulo.dos.coderunner;

public class TestEmpleado {
    public static void main(String[] args) {
        Programador programador = new Programador();
        Vendedor vendedor = new Vendedor();
        Empleado[] empleados = new Empleado[2];
        empleados[0] = programador;
        empleados[1] = vendedor;

        // Llamamos al método calcularSalario() para cada empleado usando polimorfismo
        for (Empleado empleado : empleados) {
            empleado.calcularSalario();
        }
    }
}
