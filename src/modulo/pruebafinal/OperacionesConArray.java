package modulo.pruebafinal;

public class OperacionesConArray {

    // Método para calcular la multiplicación de los elementos de un array de números decimales
    public double multiplicacionArray(double[] arr){
        double res = 1;
        for (double i : arr)
            res *= i;
        return res;
    }

    // Método para encontrar el elemento máximo en un array de números decimales
    public double maximoArray(double[] arr){
        double maximo = arr[0];
        double aux = 0;
        for (double i: arr)
            if (i > maximo)
                maximo = i;
        return maximo;
    }


    // Método para calcular el promedio de los elementos de un array de números decimales
    public double promedioArray(double[] arr){
        double suma = 0;
        for (double i : arr)
            suma += i;
        return (suma/arr.length);
    }

}
