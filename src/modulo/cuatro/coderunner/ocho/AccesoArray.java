package modulo.cuatro.coderunner.ocho;

import java.util.Scanner;

public class AccesoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};


        System.out.print("Ingresa una posición: ");
        int posicion = scanner.nextInt();

        try{
            int valor = numeros[posicion];
            System.out.println("Valor en la posición " + posicion + ": " + valor);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Error: Intento de acceso a una posición no válida en el array.");
        }

    }
}