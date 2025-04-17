package modulo.dos.coderunner;

public class CuentaBancaria {
    // Atributos
    private String nombreCliente;
    private double saldo;

    // Constructor (si lo consideras necesario)
    public CuentaBancaria(String nombreCliente, double saldo){
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }
    // Métodos
    public String getNombreCliente(){
        return this.nombreCliente;
    }

    public void setNombreCliente(String nuevoNombre){
        this.nombreCliente = nuevoNombre;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double nuevoSaldo){
        this.saldo = nuevoSaldo;
    }

    public void depositar(double cantidad){
        this.setSaldo(saldo + cantidad);
        System.out.printf("Depósito de %.1f realizado con éxito.\n", cantidad);
    }

    public void retirar(double cantidad){
        if (cantidad <= saldo) this.setSaldo(saldo - cantidad);
        System.out.printf("Retiro de %.1f realizado con éxito.\n", cantidad);
    }

    @Override
    public String toString(){
        return "Cuenta de " + nombreCliente + ", Saldo: " + saldo;
    }
}