package modulo.cuatro.teoria;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static int leerEntero(Scanner myScanner){
        boolean continuarLectura = true;
        int entero = 0;
        do {
            try {
                if (!myScanner.hasNextInt()) // si no hay entero válido
                    throw new InputMismatchException("No es un número válido");
                entero = myScanner.nextInt();
                continuarLectura = false;
            }
            catch (InputMismatchException ex){
                System.out.print("Excepción: " + ex.getMessage()
                        + ". Ingrese un número válido: ");
                myScanner.nextLine(); // limpio el scanner, sino se queda con el valor inválido
            }
        } while (continuarLectura);
        return entero;
    }

    public static void main(String[] args) {
        System.out.print("Ingrese un número entero: ");
        Scanner myScanner = new Scanner(System.in);
        System.out.println(leerEntero(myScanner));
        myScanner.close();
    }
}
