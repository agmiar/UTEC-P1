package modulo.cinco.veterinaria;

import java.util.ArrayList;
import java.util.Arrays;

interface ServicioVeterinario {
    public void realizarServicio(String tipoServicio);
}

abstract class Persona {
    private String nombre;
    private String documento;
    private String email;
}

class Cliente extends Persona {
    private String nombre;
    private String documento;
    private String email;
    ArrayList<Mascota> mascotas = new ArrayList<>();

    public Cliente(String nombre, String documento, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public String getNombre() { return nombre; }

    public void mostrarInformacion(){
        System.out.println("Cliente: " + nombre +
                " - Documento: " + documento + " - Email: " + email);
        System.out.println("Mascotas:");
        for (Mascota mascota : mascotas)
            mascota.mostrarInformacion();
    }
}

class Veterinario extends Persona implements ServicioVeterinario {
    private String nombre;
    private String documento;
    private String email;
    private String especialidad;

    public Veterinario(String nombre, String documento, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
    }

    public Veterinario(String nombre, String documento, String email, String especialidad){
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
        this.especialidad = especialidad;
    }

    public String getNombre(){return nombre;}

    @Override
    public void realizarServicio(String tipoServicio) {
        System.out.println("Veterinario " + nombre + " realizó servicio: " + tipoServicio);
    }
}

class Mascota implements ServicioVeterinario {
    private String nombre;
    private String tipo;
    private int edad;
    private Cliente clienteDuenio;
    ArrayList<String> serviciosRecibidos = new ArrayList<>();

    public Mascota(String nombre, String tipo, int edad, Cliente clienteDuenio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.clienteDuenio = clienteDuenio;
    }

    public Mascota(String nombre, String tipo, Cliente clienteDuenio) {
        this(nombre, tipo, 0, clienteDuenio);
    }

    public String getNombre() {return nombre;}
    public String getTipo() {return tipo;}
    public int getEdad() {return edad;}
    public Cliente getClienteDuenio() {return clienteDuenio;}

    public void mostrarInformacion(){
        System.out.printf("- %s (%s)\n", nombre, tipo);
    }

    @Override
    public void realizarServicio(String tipoServicio) {
        System.out.println("Mascota " + nombre + " recibió servicio: " + tipoServicio);
        serviciosRecibidos.add("Servicio: " + tipoServicio);
    }

    public void mostrarHistorialServicios(){
        System.out.printf("Historial de servicios de " + nombre + ": %s\n",
                Arrays.toString(serviciosRecibidos.toArray()));
    }
}

class Turno {
    private Mascota mascota;
    private Veterinario veterinario;
    private String fecha;
    private String tipoServicio;

    public Turno(Mascota mascota, Veterinario veterinario, String fecha, String tipoServicio) {
        this.fecha = fecha;
        this.tipoServicio = tipoServicio;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }

    public void mostrarDetalle(){
        System.out.println("Turno:");
        System.out.printf("- Mascota: %s\n", mascota.getNombre());
        System.out.printf("- Dueño: %s\n", mascota.getClienteDuenio().getNombre());
        System.out.printf("- Veterinario: %s\n", veterinario.getNombre());
        System.out.printf("- Fecha: %s\n", fecha);
        System.out.printf("- Servicio: %s\n", tipoServicio);
        System.out.println("---------------");
    }
}

class MascotaNoEncontradaException extends Exception {
    public MascotaNoEncontradaException(String nombreMascota) {
        super("No se encontró la mascota con nombre: " + nombreMascota);
    }
}

abstract class GestorVeterinaria {
    public static Mascota buscarMascotaPorNombre(ArrayList<Mascota> lista, String nombreMascota) throws MascotaNoEncontradaException {
        int i = 0;
        while (i < lista.size() && !lista.get(i).getNombre().equals(nombreMascota))
            i++;
        if (i == lista.size())
            throw new MascotaNoEncontradaException(nombreMascota);
        else
            return lista.get(i);
    }
}