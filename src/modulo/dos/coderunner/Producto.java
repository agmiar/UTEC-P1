package modulo.dos.coderunner;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Constructor que toma solo el nombre
    public Producto(String nombre) {
        this.nombre = nombre;
    }

    // Constructor que toma el nombre y el precio
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Constructor que toma el nombre, el precio y la cantidad en stock
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Método para calcular el valor total del stock
    public double calcularValorTotal() {
        return precio * cantidadEnStock;
    }


    // Sobrecarga del método para calcular el valor total con descuento
    public double calcularValorTotal(double descuento) {
        // Si tomo al descuento como un porcentaje, tiene que ser del 0 al 100
//        return (precio - precio * descuento / 100) * cantidadEnStock;
        return precio * cantidadEnStock - descuento;
        // En UTEC tomaron el descuento como un voucher de plata a descontar del total calculado
    }

    // Método para mostrar la información básica del producto
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en Stock: " + cantidadEnStock);
    }

    // Sobrecarga del método para mostrar información adicional
    public void mostrarInformacion(boolean enStock) {
        if (enStock) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad en Stock: " + cantidadEnStock);
            System.out.println("Valor Total del Stock: $" + calcularValorTotal());
        }
    }

    // Sobrecarga del método para mostrar información adicional con descuento
    public void mostrarInformacion(boolean enStock, double descuento) {
        if (enStock) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad en Stock: " + cantidadEnStock);
            System.out.println("Valor Total del Stock con Descuento: $" + calcularValorTotal(descuento));
        }
    }
}
