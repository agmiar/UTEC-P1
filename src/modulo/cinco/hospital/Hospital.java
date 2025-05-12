package modulo.cinco.hospital;

import java.util.ArrayList;

public class Hospital {
//    public static void main(String[] args) {
//        ArrayList<Paciente> pacientes = new ArrayList<>();
//        Paciente p1 = new Paciente("Laura Gómez", "12345678", 35);
//        pacientes.add(p1);
//        Medico m1 = new Medico("Dra. Ana Torres", "11223344", 45, "Pediatría");
//
//        p1.agendarCita("2025-04-01", "Control general");
//        m1.agendarCita("2025-04-01", "Consulta pediátrica");
//
//        p1.mostrarInformacion();
//
//        try {
//            Paciente buscado = Utilidades.buscarPacientePorDocumento(pacientes, "00000000");
//            buscado.mostrarInformacion();
//        }
//        catch (PacienteNoEncontradoException ex) {
//            System.out.println("Error: " + ex.getMessage());
//        }
//    }
//}
//
//abstract class Persona {
//    String nombre;
//    String documento;
//    int edad;
//
//    abstract public void mostrarInformacion();
//}
//
//interface Agendable {
//    void agendarCita(String fecha, String titulo);
//}
//
//class Paciente extends Persona implements Agendable {
//    private ArrayList<Consulta> consultas = new ArrayList<>();
//
//    public Paciente(String nombre, String documento, int edad){
//        this.nombre = nombre;
//        this.documento = documento;
//        this.edad = edad;
//    }
//
//    public Paciente(String nombre, String documento){
//        this(nombre, documento, 0);
//    }
//
//    public String getDocumento() {
//        return documento;
//    }
//
//    @Override
//    public void agendarCita(String fecha, String titulo){
//        Consulta consulta = new Consulta(fecha, titulo);
//        System.out.println();
//        consultas.add(consulta);
//    }
//
//    public void mostrarInformacion(){
////        System.out.println("Citas: " + consultas.toString());
//        System.out.println("Paciente: " + nombre + " - Documento: "
//                + documento + " - Edad: " + edad);
//        System.out.printf("Citas: [");
//        for (int i = 0; i < consultas.size(); i++) {
//            if (i == consultas.size() - 1)
//                System.out.printf("Fecha: %s, Motivo: %s]\n",
//                        consultas.get(i).getFecha(),
//                        consultas.get(i).getMotivo()
//                );
//            else
//                System.out.printf("Fecha: %s, Motivo: %s,",
//                        consultas.get(i).getFecha(),
//                        consultas.get(i).getMotivo()
//                );
//        }
//    }
//}
//
//class Medico extends Persona implements Agendable {
//    private ArrayList<Consulta> consultas = new ArrayList<>();
//
//    private String nombre;
//    private String documento;
//    private int edad;
//    private String especialidad;
//
//    public Medico(String nombre, String documento, int edad, String especialidad){
//        this.nombre = nombre;
//        this.documento = documento;
//        this.edad = edad;
//        this.especialidad = especialidad;
//    }
//
//    public Medico(String nombre, String documento){
//        this(nombre, documento, 0, "");
//    }
//
//    @Override
//    public void agendarCita(String fecha, String titulo){
//        Consulta consulta = new Consulta(fecha, titulo);
//        System.out.println("Médico " + nombre + " ha sido agendado para una cita el "
//                + fecha + " por: " + titulo);
//        consultas.add(consulta);
//    }
//
//    @Override
//    public void mostrarInformacion() {
//
//    }
//}
//
//class Consulta {
//    private String motivo;
//    private String paciente;
//    private String medico;
//    private String fecha;
//
//    public Consulta(String motivo, String paciente, String medico, String fecha){
//        this.motivo = motivo;
//        this.paciente = paciente;
//        this.medico = medico;
//        this.fecha = fecha;
//    }
//
//    public Consulta(String fecha, String motivo){
//        this(motivo, "", "", fecha);
//    }
//
//    public String getMotivo(){
//        return motivo;
//    }
//
//    public String getPaciente(){
//        return paciente;
//    }
//
//    public String getMedico(){
//        return medico;
//    }
//
//    public String getFecha(){
//        return fecha;
//    }
//}
//
//class PacienteNoEncontradoException extends Exception {
//    public PacienteNoEncontradoException(String documento) {
//        super("No se encontró un paciente con documento: " + documento);
//    }
//}
//
//class Utilidades {
//    public static Paciente buscarPacientePorDocumento(ArrayList<Paciente> pacientes, String documento)
//            throws PacienteNoEncontradoException {
//        int i = 0;
//        try{
//            while (i < pacientes.size() - 1 && !pacientes.get(i).getDocumento().equals(documento))
//                i++;
//            if (i < pacientes.size())
//                throw new PacienteNoEncontradoException(documento);
//        } catch (PacienteNoEncontradoException ex) {
//            throw ex;
//        }
//        return pacientes.get(i);
//    }
}