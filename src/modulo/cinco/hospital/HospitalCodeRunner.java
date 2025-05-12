package modulo.cinco.hospital;

import java.util.ArrayList;

abstract class Persona {
    String nombre;
    String documento;
    int edad;

    abstract public void mostrarInformacion();
}

interface Agendable {
    void agendarCita(String fecha, String titulo);
}

class Paciente extends Persona implements Agendable {
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public Paciente(String nombre, String documento, int edad){
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
    }

    public Paciente(String nombre, String documento){
        this(nombre, documento, 0);
    }

    public String getNombre() { return nombre; }

    public String getDocumento() {
        return documento;
    }

    public int getEdad() { return edad; }

    @Override
    public void agendarCita(String fecha, String titulo){
        Consulta consulta = new Consulta(fecha, titulo);
        consultas.add(consulta);
    }

    public void mostrarInformacion(){
        System.out.println("Paciente: " + nombre + " - Documento: "
                + documento + " - Edad: " + edad);

        if (consultas.isEmpty())
            System.out.println("Citas: []");
        else {
            System.out.printf("Citas: [");
            for (Consulta consulta : consultas) {
                consulta.mostrarInformacion();
            }
            System.out.println("]");
        }
    }
}


class Medico extends Persona implements Agendable {
    private ArrayList<Consulta> consultas = new ArrayList<>();

    private String nombre;
    private String documento;
    private int edad;
    private String especialidad;

    public Medico(String nombre, String documento, int edad, String especialidad){
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.especialidad = especialidad;
    }

    public Medico(String nombre, String documento){
        this(nombre, documento, 0, "");
    }

    @Override
    public void agendarCita(String fecha, String titulo){
        Consulta consulta = new Consulta(fecha, titulo);
        System.out.println("Médico " + nombre + " ha sido agendado para una cita el "
                + fecha + " por: " + titulo);
        consultas.add(consulta);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Médico: " + nombre + " - Documento: "
                + documento + " - Especialidad: " + especialidad);
    }
}

class Consulta {
    private String motivo;
    private Paciente paciente;
    private Medico medico;
    private String fecha;

    public Consulta(Paciente paciente, Medico medico, String fecha, String motivo){
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public Consulta(String motivo, Paciente paciente, Medico medico, String fecha){
        this.motivo = motivo;
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
    }

    public Consulta(String fecha, String motivo){
        this(motivo, null, null, fecha);
    }

    public String getMotivo(){
        return motivo;
    }

    public Persona getPaciente(){
        return paciente;
    }

    public Medico getMedico(){
        return medico;
    }

    public String getFecha(){
        return fecha;
    }

    public void mostrarInformacion(){
        System.out.printf("Fecha: %s, Motivo: %s", fecha, motivo);
    }

    public void mostrarDetalle(){
        /*
        Consulta:
        Paciente: Laura Gómez - Documento: 12345678 - Edad: 35
        Citas: [Fecha: 2025-04-01, Motivo: Control general]
        Médico: Dra. Ana Torres - Documento: 11223344 - Especialidad: Pediatría
        Fecha: 2025-04-01 - Motivo: Control general
        ---------------
        * */
        System.out.println("Consulta:");
        paciente.mostrarInformacion();
        medico.mostrarInformacion();
        System.out.printf("Fecha: %s - Motivo: %s\n", fecha, motivo);
        System.out.println("---------------");
    }

}

class PacienteNoEncontradoException extends Exception {
    public PacienteNoEncontradoException(String documento) {
        super("No se encontró un paciente con documento: " + documento);
    }
}

class Utilidades {
    public static Paciente buscarPacientePorDocumento(ArrayList<Paciente> pacientes, String documento)
            throws PacienteNoEncontradoException {
        int i = 0;
        try{
            while (i < pacientes.size() - 1 && !pacientes.get(i).getDocumento().equals(documento))
                i++;
            if (i < pacientes.size())
                throw new PacienteNoEncontradoException(documento);
        } catch (PacienteNoEncontradoException ex) {
            throw ex;
        }
        return pacientes.get(i);
    }
}