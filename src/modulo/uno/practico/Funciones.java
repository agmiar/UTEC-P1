package modulo.uno.practico;

public class Funciones {
//    Ejercicio 1
//    Crear un programa en Java que contenga un procedimiento llamado `saludar`. Este
//    procedimiento imprimirá en la consola el mensaje "¡Hola! Bienvenido al programa." En el
//    método 'main', llamar al procedimiento `saludar`.

    public static void saludar(){
        System.out.println("¡Hola! Bienvenido al programa.");
    }

//    Ejercicio 2
//    Escribir un programa en Java que incluya un procedimiento llamado `imprimirSuma` que
//    toma dos parámetros enteros, suma los valores y muestra el resultado. Llamar al
//    procedimiento con los valores 5 y 7.

    public static void imprimirSuma(int x, int y){
        int suma = x + y;
        System.out.printf("La suma de %d y %d es %d \n", x, y, suma);
    }

//    Ejercicio 3
//    Desarrollar un programa Java con una función llamada `calcularCuadrado` que tome un
//    número como parámetro y devuelva su cuadrado. En el método `main`, llamar a la función
//    con el valor 4 e imprimir el resultado.

    public static void calcularCuadrado(int x){
        int cuadrado = x * x;
        System.out.printf("El cuadrado de %d es %d. \n", x, cuadrado);
    }

//    Ejercicio 4
//    Crear un programa en Java que contenga una variable global llamada `variableGlobal` con
//    valor inicial 10. Incluir un procedimiento llamado `modificarVariables` que tenga una variable
//    local llamada `variableLocal` con valor 5. El procedimiento suma `variableGlobal` y
//`variableLocal`, actualiza `variableGlobal` y muestra el resultado. En el método `main`,
//    llamar al procedimiento.

    public static void modificarVariables(int x){
        int variableLocal = 5;
        x = variableLocal + x;
        System.out.println("El valor de la variable global es: " + x);
    }

    public static void main (String[] args) {
        saludar();
        imprimirSuma(5,7);
        calcularCuadrado(4);
        int variableGlobal = 10;
        modificarVariables(variableGlobal);
    }
}