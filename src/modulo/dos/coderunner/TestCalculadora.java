package modulo.dos.coderunner;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Suma de dos enteros: " + calculadora.sumar(5, 7));
        System.out.println("Suma de tres enteros: " + calculadora.sumar(5, 7, 10));

        System.out.println("Suma de dos doubles: " + calculadora.sumar(2.5, 3.7));
        System.out.println("Suma de tres doubles: " + calculadora.sumar(2.5, 3.7, 1.2));

        System.out.println("Multiplicación de dos enteros: " + calculadora.multiplicar(3, 4));
        System.out.println("Multiplicación de tres enteros: " + calculadora.multiplicar(3, 4, 2));

        System.out.println("Multiplicación de dos doubles: " + calculadora.multiplicar(2.5, 3.7));
        System.out.println("Multiplicación de tres doubles: " + calculadora.multiplicar(2.5, 3.7, 1.2));
    }
}
