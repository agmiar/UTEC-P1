package modulo.dos.practico.herencia;

public class Id {
    private String nombre;
    private String apellido;
    private String telefono;
    private String cedulaIdentidad;

    public Id(){}

    public Id(String nombre, String apellido, String telefono, String cedulaId) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cedulaIdentidad = cedulaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public void setCedulaIdentidad(String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    @Override
    public String toString(){
        return "Titular: " + nombre + " " + apellido + " Teléfono: " + telefono + " Cédula: " + cedulaIdentidad;
    }
}
