package modulo.cuatro.coderunner.seis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa tu edad: ");
            int edad = scanner.nextInt();

            validarEdad(edad);

            System.out.println("Edad válida: " + edad + " años.");

        } catch (InputMismatchException ex) {
            System.out.println("Error: Ingresa un número entero válido para la edad. Inténtalo de nuevo.");
            scanner.next(); // Limpiar el buffer del scanner para evitar un bucle infinito.

        } catch (EdadFueraDeRangoException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        scanner.close();
    }

    private static void validarEdad(int edad) throws EdadFueraDeRangoException {
        if (edad < 1 || edad > 100) {
            throw new EdadFueraDeRangoException("La edad debe estar entre 1 y 100 años.");
        }
    }
}

class EdadFueraDeRangoException extends Exception {
    public EdadFueraDeRangoException(String mensaje) {
        super(mensaje);
    }
}