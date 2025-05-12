package modulo.cinco.hospital;

import java.util.ArrayList;

public class HospitalCodeRunnerTest {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        Paciente p1 = new Paciente("Laura Gómez", "12345678", 35);
        pacientes.add(p1);
        Medico m1 = new Medico("Dra. Ana Torres", "11223344", 45, "Pediatría");

        p1.agendarCita("2025-04-01", "Control general");
        m1.agendarCita("2025-04-01", "Consulta pediátrica");

        p1.mostrarInformacion();

        try {
            Paciente buscado = Utilidades.buscarPacientePorDocumento(pacientes, "00000000");
            buscado.mostrarInformacion();
        }
        catch (PacienteNoEncontradoException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
