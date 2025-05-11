package modulo.cuatro.teoria;

interface LocalComercial{
    public static final int IVA = 22;
    public void pagarFactura(String factura, int monto);
    public String[] facturasPendientes();
}

interface ManipulacionComida{
    public void cocinar(String alimento);
    public void servir(String alimento);
}

class Cafeteria implements LocalComercial, ManipulacionComida{

    private int cantidadEmpleados;
    private String direccion;

    public Cafeteria(int cantidadEmpleados, String direccion) {
        this.cantidadEmpleados = cantidadEmpleados;
        this.direccion = direccion;
    }

    @Override
    public void cocinar(String alimento) {
        System.out.println("Preparando " + alimento);
    }

    @Override
    public void servir(String alimento) {
        System.out.println("Sirviendo " + alimento);
    }

    @Override
    public void pagarFactura(String factura, int monto){
        System.out.println("Pagando " + factura + " " + monto + " UYU");
    }

    @Override
    public String[] facturasPendientes() {
        return new String[0];
    }
}

public class Interfaces {
}
