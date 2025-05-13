package modulo.pruebafinal;

public class CalculadoraPromedio {
    public static double calcularPromedio(int[] arr){
        double suma = 0;
        for (int i: arr)
            suma += i;
        return (suma/arr.length);
    }
}
