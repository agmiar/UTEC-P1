package modulo.cuatro.teoria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        try {
            int a = myScanner.nextInt();
            int b = myScanner.nextInt();
            System.out.println(sumar(a, b));
        }
        catch (InputMismatchException ex){
            System.out.println("No ingresaste un número válido");
        }
        finally {
            System.out.println("Estoy adentro del finally");
        }

        System.out.println("Estoy luego del finally");
        myScanner.close();
    }
}
