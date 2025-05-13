package modulo.pruebafinal;

public class CRUD {}

// clase Producto

class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

// Interfaz que tienen los métodos abstractos

interface ICrudProductos {
    public void agregar(Producto p);

    public void modificar(Producto p);

    public void eliminar(Producto p);

    public void listar();
}

// Clase que implementa la interfaz , parte de esta deben completar

class CrudProductosImpl implements ICrudProductos {
    @SuppressWarnings("unchecked")
    java.util.HashMap<Integer, Producto> productos = new java.util.HashMap();

    @Override
    public void agregar(Producto p) {
        // aca deben colocar código
        productos.put(p.getId(), p);

    }

    @Override
    public void modificar(Producto p) {
        if (productos.containsKey(p.getId())) {

            // aca deben colocar codigo
            productos.replace(p.getId(), p);

        } else {
            System.out.println("No se pudo modificar al producto");
        }

    }

    @Override
    public void eliminar(Producto p) {
        if (productos.containsKey(p.getId())) {

            // aca deben colocar codigo
            productos.remove(p.getId());

        } else {
            System.out.println("No se pudo eliminar al producto");
        }
    }

    @Override
    public void listar() {
        for (Integer p : productos.keySet()) {
            System.out.println("Clave: " + p + " valor: " + productos.get(p));
        }
    }
}


