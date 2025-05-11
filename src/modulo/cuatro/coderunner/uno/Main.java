package modulo.cuatro.coderunner.uno;

public class Main {
    public static void main(String[] args) {
        OperacionMatematica suma = new Suma();
        OperacionMatematica multiplicacion = new Multiplicacion();

        double resultadoSuma = suma.ejecutar(10, 5);
        double resultadoMultiplicacion = multiplicacion.ejecutar(8, 3);

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
    }
}
