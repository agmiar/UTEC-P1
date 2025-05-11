package modulo.cuatro.teoria;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static int dividir(int num1, int num2){
        if (num2 == 0)
            throw new ArithmeticException("Divisor no puede ser cero");
        return num1 / num2;
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num1 = myScanner.nextInt();
        myScanner.nextLine();
        int num2 = myScanner.nextInt();

        try {
            int resultado = dividir(num1, num2);
            System.out.println(resultado);
        }
        catch (ArithmeticException ex){
            System.out.printf("Excepción: " + ex.getMessage() + "\n" + ex.getStackTrace()[1]);

        }
    }
}
