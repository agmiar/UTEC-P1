package modulo.dos.practico;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner miScan = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = miScan.nextLine(); // lee hasta el proximo Enter
        System.out.print("Ingresa tu edad: ");
        int edad = miScan.nextInt();
        // 34\n  \n = enter (new line)
        miScan.nextLine(); // termina de leer la linea entera (termina lo que empieza)
        System.out.print("Ingresa tu altura: ");
        double altura = miScan.nextDouble();
        miScan.nextLine();
        System.out.println("Hola " + nombre);
        miScan.close();
    }
}
