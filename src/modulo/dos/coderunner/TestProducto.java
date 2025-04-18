package modulo.dos.coderunner;

public class TestProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop");
        Producto producto2 = new Producto("Teléfono", 499.99);
        Producto producto3 = new Producto("Tablet", 299.99, 50);
        producto1.mostrarInformacion(true);
        System.out.println("------------------------");
        producto2.mostrarInformacion(true);
        System.out.println("------------------------");
        producto3.mostrarInformacion(true, 20.0);
    }
}
