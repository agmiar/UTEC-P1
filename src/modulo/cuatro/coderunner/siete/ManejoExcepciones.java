package modulo.cuatro.coderunner.siete;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer número entero: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número entero: ");
            int numero2 = scanner.nextInt();

            double resultado = division(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);

        } catch (InputMismatchException ex) {
            System.out.println("Error: Ingresa números enteros válidos. Inténtalo de nuevo.");
        } catch (ArithmeticException ex) {
            System.out.println("Error: No se puede dividir por cero. Inténtalo de nuevo.");
            // scanner.next(); // Limpiar el buffer del scanner para evitar un bucle infinito.
            // este scanner.next() tira error (está mal el código provisto desde la Cétedra)
        }

        scanner.close();
    }

    private static double division(int numerador, int denominador) {
        return numerador / denominador;
    }
}
